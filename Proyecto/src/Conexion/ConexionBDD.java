package Conexion;

import java.sql.*;

public class ConexionBDD {

    Connection con = null;

    public Connection conexion() {
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/holandabro", "root", "admin");
            
            
        } catch (ClassNotFoundException | SQLException e) {
            
        }
        return con;
    }
}
