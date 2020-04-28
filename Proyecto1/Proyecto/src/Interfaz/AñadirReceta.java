package Interfaz;

import Datos.Ingrediente;
import Datos.UsuarioTemporal;
import Datos.RegistroBDD;
import Datos.RegistroReceta;
import Datos.SQL;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AñadirReceta extends javax.swing.JFrame {

    Ingrediente ing = new Ingrediente();
    UsuarioTemporal tm = new UsuarioTemporal();
    SQL sql = new SQL();

    public AñadirReceta() {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            setIconImage(new ImageIcon(getClass().getResource("../Imagenes/icono.png")).getImage());
        } catch (Exception e) {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        panelAñadirReceta = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        botonAtras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nombreReceta = new javax.swing.JTextField();
        descripcionReceta = new javax.swing.JTextField();
        botonGuardar = new javax.swing.JButton();
        comentarioReceta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tipoReceta = new javax.swing.JComboBox<>();
        dificultadReceta = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tiempoReceta = new javax.swing.JTextField();
        añadirIngredientes = new javax.swing.JButton();
        añadirPasos = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jButton3.setText("jButton3");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAñadirReceta.setBackground(new java.awt.Color(255, 255, 255));
        panelAñadirReceta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelAñadirReceta.setForeground(new java.awt.Color(255, 255, 255));
        panelAñadirReceta.setFocusable(false);
        panelAñadirReceta.setMinimumSize(new java.awt.Dimension(790, 43));
        panelAñadirReceta.setPreferredSize(new java.awt.Dimension(900, 600));

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

        botonAtras.setBackground(new java.awt.Color(255, 255, 255));
        botonAtras.setFont(new java.awt.Font("Nirmala UI", 0, 19)); // NOI18N
        botonAtras.setForeground(new java.awt.Color(255, 0, 1));
        botonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        botonAtras.setBorder(null);
        botonAtras.setBorderPainted(false);
        botonAtras.setContentAreaFilled(false);
        botonAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAtras.setDefaultCapable(false);
        botonAtras.setFocusPainted(false);
        botonAtras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAtras.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonAtras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonAtrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAtrasMouseExited(evt);
            }
        });
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Nueva Receta");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        nombreReceta.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nombreReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreRecetaActionPerformed(evt);
            }
        });

        descripcionReceta.setColumns(3);
        descripcionReceta.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        descripcionReceta.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        descripcionReceta.setSelectionEnd(-5);
        descripcionReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripcionRecetaActionPerformed(evt);
            }
        });

        botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonGuardar.png"))); // NOI18N
        botonGuardar.setBorder(null);
        botonGuardar.setBorderPainted(false);
        botonGuardar.setContentAreaFilled(false);
        botonGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGuardar.setFocusPainted(false);
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        comentarioReceta.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Descripción");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Comentario");

        tipoReceta.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tipoReceta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plato Principal", "Ensalada", "Postre", "Bebida", "Carne", "Pasta" }));
        tipoReceta.setFocusable(false);
        tipoReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoRecetaActionPerformed(evt);
            }
        });

        dificultadReceta.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        dificultadReceta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fácil", "Media", "Difícil" }));
        dificultadReceta.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Tipo de receta");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Dificultad");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel7.setText("Tiempo estimado");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        tiempoReceta.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tiempoReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiempoRecetaActionPerformed(evt);
            }
        });

        añadirIngredientes.setBackground(new java.awt.Color(255, 0, 0));
        añadirIngredientes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        añadirIngredientes.setForeground(new java.awt.Color(255, 0, 0));
        añadirIngredientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/comestibles (2).png"))); // NOI18N
        añadirIngredientes.setBorder(null);
        añadirIngredientes.setBorderPainted(false);
        añadirIngredientes.setContentAreaFilled(false);
        añadirIngredientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        añadirIngredientes.setDefaultCapable(false);
        añadirIngredientes.setFocusPainted(false);
        añadirIngredientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        añadirIngredientes.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        añadirIngredientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        añadirIngredientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                añadirIngredientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                añadirIngredientesMouseExited(evt);
            }
        });
        añadirIngredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirIngredientesActionPerformed(evt);
            }
        });

        añadirPasos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        añadirPasos.setForeground(new java.awt.Color(255, 0, 0));
        añadirPasos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/receta (5).png"))); // NOI18N
        añadirPasos.setBorder(null);
        añadirPasos.setBorderPainted(false);
        añadirPasos.setContentAreaFilled(false);
        añadirPasos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        añadirPasos.setDefaultCapable(false);
        añadirPasos.setFocusPainted(false);
        añadirPasos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        añadirPasos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        añadirPasos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        añadirPasos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                añadirPasosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                añadirPasosMouseExited(evt);
            }
        });
        añadirPasos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirPasosActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("(HH:mm:ss)");

        javax.swing.GroupLayout panelAñadirRecetaLayout = new javax.swing.GroupLayout(panelAñadirReceta);
        panelAñadirReceta.setLayout(panelAñadirRecetaLayout);
        panelAñadirRecetaLayout.setHorizontalGroup(
            panelAñadirRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAñadirRecetaLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombreReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(201, 201, 201)
                .addComponent(tiempoReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAñadirRecetaLayout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151)
                .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelAñadirRecetaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAñadirRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAñadirRecetaLayout.createSequentialGroup()
                        .addComponent(botonAtras)
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAñadirRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAñadirRecetaLayout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAñadirRecetaLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(21, 21, 21))))
                .addGroup(panelAñadirRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAñadirRecetaLayout.createSequentialGroup()
                        .addGroup(panelAñadirRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descripcionReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comentarioReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelAñadirRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAñadirRecetaLayout.createSequentialGroup()
                                .addGroup(panelAñadirRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelAñadirRecetaLayout.createSequentialGroup()
                                        .addGroup(panelAñadirRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelAñadirRecetaLayout.createSequentialGroup()
                                                .addGap(63, 63, 63)
                                                .addComponent(jLabel6)
                                                .addGap(38, 38, 38))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAñadirRecetaLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(panelAñadirRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)))
                                        .addGroup(panelAñadirRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(dificultadReceta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tipoReceta, 0, 143, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelAñadirRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelAñadirRecetaLayout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(añadirPasos))
                                        .addGroup(panelAñadirRecetaLayout.createSequentialGroup()
                                            .addGap(34, 34, 34)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addGap(14, 14, 14))
                            .addGroup(panelAñadirRecetaLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(añadirIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAñadirRecetaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelAñadirRecetaLayout.setVerticalGroup(
            panelAñadirRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAñadirRecetaLayout.createSequentialGroup()
                .addGroup(panelAñadirRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelAñadirRecetaLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAñadirRecetaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(panelAñadirRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAñadirRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nombreReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAñadirRecetaLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(panelAñadirRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tiempoReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(20, 20, 20)
                .addGroup(panelAñadirRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAñadirRecetaLayout.createSequentialGroup()
                        .addGroup(panelAñadirRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tipoReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(panelAñadirRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(dificultadReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(panelAñadirRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(añadirPasos, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(añadirIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(botonGuardar))
                    .addGroup(panelAñadirRecetaLayout.createSequentialGroup()
                        .addGroup(panelAñadirRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAñadirRecetaLayout.createSequentialGroup()
                                .addComponent(descripcionReceta)
                                .addGap(20, 20, 20))
                            .addGroup(panelAñadirRecetaLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(panelAñadirRecetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comentarioReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(34, 34, 34)
                        .addComponent(botonAtras)))
                .addContainerGap())
        );

        getContentPane().add(panelAñadirReceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        if (nombreReceta.getText().equals("") && descripcionReceta.getText().equals("") && comentarioReceta.getText().equals("") && tiempoReceta.getText().equals("")) {
            System.exit(0);
        } else {
            if (!nombreReceta.getText().equals("") || !descripcionReceta.getText().equals("") || !comentarioReceta.getText().equals("") || !tiempoReceta.getText().equals("")) {
                int confirmar = JOptionPane.showConfirmDialog(null, "Tiene datos que no han sido guardados, ¿Desea cerrar el programa?", "Confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (confirmar == 0) {
                    System.exit(0);
                }
            }
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        if (nombreReceta.getText().equals("") && descripcionReceta.getText().equals("") && comentarioReceta.getText().equals("") && tiempoReceta.getText().equals("")) {
            Menu inicio = new Menu();
            inicio.setVisible(true);
            this.dispose();
        } else {
            if (!nombreReceta.getText().equals("") || !descripcionReceta.getText().equals("") || !comentarioReceta.getText().equals("") || !tiempoReceta.getText().equals("")) {
                int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea volver al menú?, se perderán los datos no guardados", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (confirmar == 0) {
                    Menu inicio = new Menu();
                    inicio.setVisible(true);
                    this.dispose();
                }
            }
        }
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void botonAtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAtrasMouseExited

    }//GEN-LAST:event_botonAtrasMouseExited

    private void botonAtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAtrasMouseEntered

    }//GEN-LAST:event_botonAtrasMouseEntered

    private void nombreRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreRecetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreRecetaActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed

        RegistroReceta receta = new RegistroReceta();
        Ingrediente ing = new Ingrediente();

        receta.setUsuario(tm.getTexto());
        receta.setNombre(nombreReceta.getText());
        receta.setDescripcion(descripcionReceta.getText());
        receta.setComentario(comentarioReceta.getText());
        receta.setTiempo(tiempoReceta.getText());
        receta.setTipo((String) tipoReceta.getSelectedItem());
        receta.setDificultad((String) dificultadReceta.getSelectedItem());

        if (nombreReceta.getText().equals("") || descripcionReceta.getText().equals("") || comentarioReceta.getText().equals("") || tiempoReceta.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Debe llenar los datos");

        } else {
            int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea ingresar esta receta?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            try {
                if (confirmar == 0) {
                    if (!ing.getId().equals("")) {
                        if (sql.verificarReceta(tm.getTexto(),nombreReceta.getText()) == 0) {
                            if (sql.añadirReceta(tm, receta)) {
                                if (sql.idReceta(receta, tm));
                                {
                                    sql.ingresarIngrediente(ing, receta);
                                    JOptionPane.showMessageDialog(null, "La receta fue creada con éxito");
                                }
                                nombreReceta.setText("");
                                tiempoReceta.setText("");
                                comentarioReceta.setText("");
                                descripcionReceta.setText("");
                                tipoReceta.setSelectedIndex(0);
                                dificultadReceta.setSelectedIndex(0);
                                ing.setId(null);
                                ing.setNombre(null);
                                ing.setCantidad(null);
                                ing.setUnidad(null);
                            } else {
                                JOptionPane.showMessageDialog(null, "Error al crear la receta");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Usted ya registró esta receta");
                        }
                    }
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Debe añadir ingredientes");
            }
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void tipoRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoRecetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoRecetaActionPerformed

    private void descripcionRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripcionRecetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descripcionRecetaActionPerformed

    private void añadirIngredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirIngredientesActionPerformed

        MenuIngrediente dia = new MenuIngrediente(new javax.swing.JDialog(), true);
        dia.setVisible(true);

    }//GEN-LAST:event_añadirIngredientesActionPerformed

    private void tiempoRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiempoRecetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tiempoRecetaActionPerformed

    private void añadirIngredientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_añadirIngredientesMouseEntered
        añadirIngredientes.setText("Ingredientes");
    }//GEN-LAST:event_añadirIngredientesMouseEntered

    private void añadirIngredientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_añadirIngredientesMouseExited
        añadirIngredientes.setText("");
    }//GEN-LAST:event_añadirIngredientesMouseExited

    private void añadirPasosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_añadirPasosMouseEntered
        añadirPasos.setText("Añadir Pasos");
    }//GEN-LAST:event_añadirPasosMouseEntered

    private void añadirPasosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_añadirPasosMouseExited
        añadirPasos.setText("");
    }//GEN-LAST:event_añadirPasosMouseExited

    private void añadirPasosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirPasosActionPerformed

        AñadirPasos aña = new AñadirPasos(new javax.swing.JDialog(), true);
        aña.setVisible(true);
        
        
    }//GEN-LAST:event_añadirPasosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton añadirIngredientes;
    private javax.swing.JButton añadirPasos;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField comentarioReceta;
    private javax.swing.JTextField descripcionReceta;
    private javax.swing.JComboBox<String> dificultadReceta;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nombreReceta;
    private javax.swing.JPanel panelAñadirReceta;
    private javax.swing.JTextField tiempoReceta;
    private javax.swing.JComboBox<String> tipoReceta;
    // End of variables declaration//GEN-END:variables

}
