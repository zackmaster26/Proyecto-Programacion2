package Datos;

import javax.sql.rowset.WebRowSet;
import Conexion.ConexionBDD;
import Conexion.ConexionBDD;
import Interfaz.AñadirReceta;
import Datos.recuperacionCorreo;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;

public class SQL extends ConexionBDD {

    public boolean registro(RegistroBDD usr) {

        PreparedStatement ps = null;
        Connection con = conexion();

        String sql = "INSERT INTO registro (nombreUsuario, contraseña, nombre, apellido, correo, codigo) VALUES (?, ?, ?, ?, ?, ?);";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getNombreUsuario());
            ps.setString(2, usr.getContraseña());
            ps.setString(3, usr.getNombre());
            ps.setString(4, usr.getApellido());
            ps.setString(5, usr.getCorreo());
            ps.setInt(6, usr.getCodigo());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public int validacionUsuario(String usuario) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion();

        String sql = "SELECT count(nombreUsuario) FROM registro WHERE nombreUsuario = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            return 1;

        }
    }

    public boolean validacionCorreo(String correo) {

        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mather = pattern.matcher(correo);

        return mather.find();

    }

    public boolean login(RegistroBDD usr) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion();

        String sql = "SELECT nombreusuario, contraseña, nombre FROM registro WHERE nombreusuario = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getNombreUsuario());
            rs = ps.executeQuery();

            if (rs.next()) {
                if (usr.getContraseña().equals(rs.getString(2))) {

                    usr.setNombre(rs.getString(3));
                    return true;

                } else {
                    return false;
                }
            }
            return false;

        } catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }
    }

    public ArrayList<String> traerIngrediente() {

        ArrayList<String> lista = new ArrayList<String>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion();

        String sql = "SELECT * FROM ingrediente";

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery(sql);
        } catch (Exception e) {
        }
        try {
            while (rs.next()) {
                lista.add(rs.getString("nombreingrediente"));
            }
        } catch (Exception ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public boolean añadirReceta(UsuarioTemporal usuario, RegistroReceta rec) {

        PreparedStatement ps = null;
        Connection con = conexion();

        String sql = "INSERT INTO recetas (nombreUsuario, nombre, descripcion, comentarioReceta, tiempoReceta, tipoReceta, dificultadReceta, Pasos) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getTexto());
            ps.setString(2, rec.getNombre());
            ps.setString(3, rec.getDescripcion());
            ps.setString(4, rec.getComentario());
            ps.setString(5, rec.getTiempo());
            ps.setString(6, rec.getTipo());
            ps.setString(7, rec.getDificultad());
            for (int i = 0; i < rec.getPasos().size(); i++) {
                ps.setArray(8, (Array) rec.getPasos().get(i));
            }

            ps.execute();

            return true;

        } catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }
    }

    public boolean idReceta(RegistroReceta rec, UsuarioTemporal usu) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion();

        String sql = "SELECT id_receta FROM recetas WHERE nombre = ? and nombreusuario = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, rec.getNombre());
            ps.setString(2, usu.getTexto());
            rs = ps.executeQuery();

        } catch (Exception e) {
            return false;
        }
        try {
            while (rs.next()) {
                rec.setId(rs.getString("id_receta"));
                return true;
            }
        } catch (Exception ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return false;
    }

    public ArrayList ingrediente() {

        Ingrediente ing = new Ingrediente();
        ArrayList ali = new ArrayList();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion();

        String sql = "SELECT * FROM ingrediente WHERE nombreingrediente = ?";

        try {
            ps = con.prepareStatement(sql);
            for (int i = 0; i < ing.getNombre().size(); i++) {
                ps.setObject(1, ing.getNombre().get(i));
                rs = ps.executeQuery();
            }

        } catch (Exception e) {

        }
        try {
            while (rs.next()) {
                ali.add(rs.getString("id_ingrediente"));

            }
        } catch (Exception ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ali;
    }

    public boolean ingresarIngrediente(Ingrediente ing, RegistroReceta rec) {

        PreparedStatement ps = null;
        Connection con = conexion();

        String sql = "INSERT INTO recetas_has_ingrediente (id_receta, ingrediente, cantidad, unidad) VALUES (?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            for (int i = 0; i < ing.getId().size(); i++) {
                ps.setString(1, rec.getId());
                ps.setObject(2, ing.getId().get(i));
                ps.setObject(3, ing.getCantidad().get(i));
                ps.setObject(4, ing.getUnidad().get(i));
                ps.execute();
            }
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }

    }

    public int verificarReceta(String tm, String nombreReceta) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion();
        RegistroReceta rec = new RegistroReceta();
        UsuarioTemporal usu = new UsuarioTemporal();

        String sql = "SELECT count(nombre) FROM recetas WHERE nombreusuario = ? and nombre = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, tm);
            ps.setString(2, nombreReceta);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            return 1;

        }
    }

    public int recibirCodigo(recuperacionCorreo cor) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion();
        RegistroReceta rec = new RegistroReceta();

        String sql = "SELECT codigo FROM registro WHERE correo = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cor.getCorreo());
            rs = ps.executeQuery();

            if (rs.next()) {
                int codigo = rs.getInt("codigo");
                return codigo;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        return 0;
    }

    public int verifiarCodigo(recuperacionCorreo cor) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion();

        String sql = "SELECT count(codigo) FROM registro WHERE correo = ? and codigo = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cor.getCorreo());
            ps.setInt(2, cor.getCodigo());
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }
            return 0;
        } catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            return 0;

        }
    }

    public boolean updateContraseña(String contra, recuperacionCorreo cor) {

        Connection con = conexion();
        PreparedStatement ps = null;

        String sql = "UPDATE registro SET contraseña = ? WHERE correo = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, contra);
            ps.setString(2, cor.getCorreo());
            ps.execute();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }

    }

    public int existeCorreo(recuperacionCorreo cor) {

        Connection con = conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT count(correo) FROM registro WHERE correo = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cor.getCorreo());
            rs = ps.executeQuery();

            while (rs.next()) {
                return rs.getInt(1);
            }
            return 0;

        } catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            return 0;

        }

    }

    public int existeCorreoRegistro(String correo) {

        Connection con = conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT count(correo) FROM registro WHERE correo = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, correo);
            rs = ps.executeQuery();

            while (rs.next()) {
                return rs.getInt(1);
            }
            return 1;

        } catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            return 1;

        }

    }

}
