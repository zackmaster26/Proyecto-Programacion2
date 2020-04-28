package Interfaz;

import Datos.UsuarioTemporal;
import Datos.CifradoContraseña;
import Datos.RegistroBDD;
import Datos.RegistroReceta;
import Datos.SQL;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    int posY = 0, posX = 0;

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            setIconImage(new ImageIcon(getClass().getResource("../Imagenes/icono.png")).getImage());
        } catch (Exception e) {

        }
        panelLogin.requestFocus();
        ocultar.setVisible(false);
        mostrar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        panelLogin = new javax.swing.JPanel();
        mostrar = new javax.swing.JLabel();
        ocultar = new javax.swing.JLabel();
        labelUsr = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        labelPass = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        TituloLogin = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(500, 230));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLogin.setBackground(new java.awt.Color(255, 255, 255));
        panelLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelLogin.setForeground(new java.awt.Color(255, 255, 255));
        panelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mostrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        mostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ojocerrado.png"))); // NOI18N
        mostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarMouseClicked(evt);
            }
        });
        panelLogin.add(mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));

        ocultar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ocultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ojo.png"))); // NOI18N
        ocultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ocultarMouseClicked(evt);
            }
        });
        panelLogin.add(ocultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));

        labelUsr.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        labelUsr.setForeground(new java.awt.Color(204, 204, 204));
        labelUsr.setText("Usuario");
        labelUsr.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelLogin.add(labelUsr, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("___________________");
        panelLogin.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 210, 20));

        usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usuario.setForeground(new java.awt.Color(102, 102, 102));
        usuario.setBorder(null);
        usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        usuario.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                usuarioCaretUpdate(evt);
            }
        });
        usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuarioMouseClicked(evt);
            }
        });
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usuarioKeyPressed(evt);
            }
        });
        panelLogin.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 200, 30));

        labelPass.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        labelPass.setForeground(new java.awt.Color(204, 204, 204));
        labelPass.setText("Contraseña");
        labelPass.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelLogin.add(labelPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("___________________");
        panelLogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 210, 20));

        pass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pass.setForeground(new java.awt.Color(102, 102, 102));
        pass.setBorder(null);
        pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passMouseClicked(evt);
            }
        });
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passKeyPressed(evt);
            }
        });
        panelLogin.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 200, 30));

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        panelLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, -1, -1));

        btnIngresar.setBackground(new java.awt.Color(255, 255, 255));
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/loginbtn.png"))); // NOI18N
        btnIngresar.setBorder(null);
        btnIngresar.setBorderPainted(false);
        btnIngresar.setContentAreaFilled(false);
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.setDefaultCapable(false);
        btnIngresar.setFocusPainted(false);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        btnIngresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnIngresarKeyPressed(evt);
            }
        });
        panelLogin.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 200, 40));

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setDefaultCapable(false);
        btnSalir.setFocusable(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        panelLogin.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 3, 50, 40));

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AñadirUsuario.png"))); // NOI18N
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.setFocusPainted(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        panelLogin.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, -1, 70));

        btnMinimizar.setBackground(new java.awt.Color(255, 255, 255));
        btnMinimizar.setForeground(new java.awt.Color(255, 255, 255));
        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonMinimizar.png"))); // NOI18N
        btnMinimizar.setBorder(null);
        btnMinimizar.setBorderPainted(false);
        btnMinimizar.setContentAreaFilled(false);
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.setDefaultCapable(false);
        btnMinimizar.setFocusable(false);
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        panelLogin.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 30, 40));

        TituloLogin.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        TituloLogin.setText("Login");
        panelLogin.add(TituloLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 110, 70));

        jLabel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel4MouseDragged(evt);
            }
        });
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });
        panelLogin.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 60));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel5.setText("Olvidaste tu contraseña?");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        panelLogin.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, -1, -1));

        getContentPane().add(panelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_usuarioCaretUpdate

        UsuarioTemporal tm = new UsuarioTemporal();
        tm.setTexto(usuario.getText());
    }//GEN-LAST:event_usuarioCaretUpdate

    private void usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioMouseClicked
        labelUsr.setText("");

        if (usuario.getText().equals("") && pass.getText().equals("")) {
            labelPass.setText("Contraseña");

        }

    }//GEN-LAST:event_usuarioMouseClicked

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed

    }//GEN-LAST:event_usuarioActionPerformed

    private void passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passMouseClicked
        labelPass.setText("");
        mostrar.setVisible(true);

        if (usuario.getText().equals("") && pass.getText().equals("")) {
            labelUsr.setText("Usuario");
        }


    }//GEN-LAST:event_passMouseClicked

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        pass.setText("");
    }//GEN-LAST:event_passActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

        SQL modSQL = new SQL();
        RegistroBDD usu = new RegistroBDD();
        String pass1 = new String(pass.getPassword());

        if (!usuario.getText().equals("") && !pass1.equals("")) {

            String passnuevo = CifradoContraseña.sha1(pass1);
            usu.setNombreUsuario(usuario.getText());
            usu.setContraseña(passnuevo);

            if (modSQL.login(usu)) {
                try {
                    //Fade.JFrameFadeOut(1f, 0f,0.1f, 50, this, Fade.EXIT);
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
                Menu inicio = new Menu();
                inicio.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar sus datos");
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Registro reg = new Registro();
        reg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void jLabel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseDragged
        setLocation(evt.getXOnScreen() - posX, evt.getYOnScreen() - posY);
    }//GEN-LAST:event_jLabel4MouseDragged

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed

        posX = evt.getX();
        posY = evt.getY();
    }//GEN-LAST:event_jLabel4MousePressed

    private void btnIngresarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnIngresarKeyPressed

    }//GEN-LAST:event_btnIngresarKeyPressed

    private void passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            SQL modSQL = new SQL();
            RegistroBDD usu = new RegistroBDD();
            String pass1 = new String(pass.getPassword());

            if (!usuario.getText().equals("") && !pass1.equals("")) {

                String passnuevo = CifradoContraseña.sha1(pass1);
                usu.setNombreUsuario(usuario.getText());
                usu.setContraseña(passnuevo);

                if (modSQL.login(usu)) {

                    try {
                        //Fade.JFrameFadeOut(1f, 0f,0.1f, 50, this, Fade.EXIT);
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Menu inicio = new Menu();
                    inicio.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar sus datos");
            }
        }
    }//GEN-LAST:event_passKeyPressed

    private void usuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            SQL modSQL = new SQL();
            RegistroBDD usu = new RegistroBDD();
            String pass1 = new String(pass.getPassword());

            if (!usuario.getText().equals("") && !pass1.equals("")) {

                String passnuevo = CifradoContraseña.sha1(pass1);
                usu.setNombreUsuario(usuario.getText());
                usu.setContraseña(passnuevo);

                if (modSQL.login(usu)) {

                    Menu inicio = new Menu();
                    inicio.setVisible(true);
                    this.dispose();

                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar sus datos");
            }
        }
    }//GEN-LAST:event_usuarioKeyPressed

    private void mostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarMouseClicked

        mostrar.setVisible(false);
        mostrar.setEnabled(false);
        ocultar.setVisible(true);
        ocultar.setEnabled(true);
        pass.setEchoChar((char) 0);


    }//GEN-LAST:event_mostrarMouseClicked

    private void ocultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocultarMouseClicked

        ocultar.setVisible(false);
        ocultar.setEnabled(false);

        mostrar.setVisible(true);
        mostrar.setEnabled(true);

        pass.setEchoChar((char) 8226);

    }//GEN-LAST:event_ocultarMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        recuperacion rec = new recuperacion();
        rec.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        
        SQL modSQL = new SQL();
        RegistroBDD usu = new RegistroBDD();
        String pass1 = new String(pass.getPassword());

        if (!usuario.getText().equals("") && !pass1.equals("")) {

            String passnuevo = CifradoContraseña.sha1(pass1);
            usu.setNombreUsuario(usuario.getText());
            usu.setContraseña(passnuevo);

            if (modSQL.login(usu)) {
                try {
                    //Fade.JFrameFadeOut(1f, 0f,0.1f, 50, this, Fade.EXIT);
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
                Menu inicio = new Menu();
                inicio.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar sus datos");
        }
        
    }//GEN-LAST:event_jLabel1MouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TituloLogin;
    javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel labelPass;
    private javax.swing.JLabel labelUsr;
    private javax.swing.JLabel mostrar;
    private javax.swing.JLabel ocultar;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
