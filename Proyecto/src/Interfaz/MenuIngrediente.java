package Interfaz;

import Datos.Ingrediente;
import Datos.NuevoIngrediente;
import Datos.SQL;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MenuIngrediente extends javax.swing.JDialog {

    Ingrediente ing = new Ingrediente();
    SQL sql = new SQL();
    AñadirReceta an = new AñadirReceta();

    ArrayList unidades = new ArrayList();
    ArrayList ingredientes = new ArrayList();
    ArrayList cantidades = new ArrayList();
    ArrayList id = new ArrayList();
    ArrayList id2 = new ArrayList();
    ArrayList nombres2 = new ArrayList();

    public MenuIngrediente(javax.swing.JDialog parent, boolean modal) {

        initComponents();
        this.setLocationRelativeTo(null);
        nombreIngrediente.removeAllItems();
        panel.setVisible(false);
        ArrayList<String> ali = new ArrayList<String>();
        ali = sql.traerIngrediente();
        for (int i = 0; i < ali.size(); i++) {
            nombreIngrediente.addItem(ali.get(i).substring(0, 1).toUpperCase() + ali.get(i).substring(1));
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        panelAñadirIngrediente = new javax.swing.JPanel();
        botonAtras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        unidadIngrediente = new javax.swing.JComboBox<>();
        cantidadIngrediente = new javax.swing.JSpinner();
        nombreIngrediente = new javax.swing.JComboBox<>();
        panel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        buscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(520, 250));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAñadirIngrediente.setBackground(new java.awt.Color(255, 255, 255));
        panelAñadirIngrediente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 5));
        panelAñadirIngrediente.setForeground(new java.awt.Color(255, 255, 255));
        panelAñadirIngrediente.setFocusable(false);
        panelAñadirIngrediente.setPreferredSize(new java.awt.Dimension(530, 250));
        panelAñadirIngrediente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        panelAñadirIngrediente.add(botonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel1.setText("Añadir Ingredientes");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelAñadirIngrediente.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, 61));

        unidadIngrediente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "gramos", "kilos", "Item 4", "Cucharada" }));
        unidadIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadIngredienteActionPerformed(evt);
            }
        });
        panelAñadirIngrediente.add(unidadIngrediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 166, 150, 38));
        panelAñadirIngrediente.add(cantidadIngrediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 166, 150, 38));

        nombreIngrediente.setEditable(true);
        nombreIngrediente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        nombreIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreIngredienteActionPerformed(evt);
            }
        });
        nombreIngrediente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombreIngredienteKeyPressed(evt);
            }
        });
        panelAñadirIngrediente.add(nombreIngrediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 166, 150, 38));

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setForeground(new java.awt.Color(255, 255, 255));
        panel.setFocusable(false);
        panel.setPreferredSize(new java.awt.Dimension(530, 250));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("_________");
        panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 31, -1, -1));

        buscar.setForeground(new java.awt.Color(102, 102, 102));
        buscar.setBorder(null);
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscarKeyPressed(evt);
            }
        });
        panel.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 97, 30));

        panelAñadirIngrediente.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 349, 109, 56));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setText("Ingrediente");
        panelAñadirIngrediente.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 134, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel3.setText("Cantidad");
        panelAñadirIngrediente.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 134, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel4.setText("Unidad");
        panelAñadirIngrediente.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 134, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/searchmagnifierinterfacesymbol1_79893.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        panelAñadirIngrediente.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, -1, -1));

        jLabel7.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Guardar ingrediente");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelAñadirIngrediente.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));

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
        panelAñadirIngrediente.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 220, 40));

        getContentPane().add(panelAñadirIngrediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 532, 434));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAtrasMouseEntered

    }//GEN-LAST:event_botonAtrasMouseEntered

    private void botonAtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAtrasMouseExited

    }//GEN-LAST:event_botonAtrasMouseExited

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed

        int confirmar = JOptionPane.showConfirmDialog(null, "¿Ya ingresó todos los ingredientes?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (confirmar == 0) {
            AñadirReceta rec = new AñadirReceta();
            this.setVisible(false);
        }
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void unidadIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadIngredienteActionPerformed

    }//GEN-LAST:event_unidadIngredienteActionPerformed

    private void nombreIngredienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreIngredienteKeyPressed

    }//GEN-LAST:event_nombreIngredienteKeyPressed

    private void nombreIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreIngredienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreIngredienteActionPerformed

    private void buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            String ingrediente = buscar.getText().toLowerCase();
            String ingrediente2 = ingrediente.substring(0, 1).toUpperCase() + ingrediente.substring(1);
            ArrayList ali = new ArrayList();
            boolean ok = true;

            for (int i = 0; i < nombreIngrediente.getModel().getSize(); i++) {
                ali.add(nombreIngrediente.getModel().getElementAt(i));
            }
            for (int i = 0; i < ali.size(); i++) {
                if (!buscar.getText().equals("")) {
                    if (ingrediente2.equals(ali.get(i))) {
                        nombreIngrediente.setSelectedItem(ingrediente2);
                        buscar.setText("");
                        ok = true;
                        break;
                    } else {
                        if (!ingrediente2.equals(ali.get(i))) {
                            ok = false;
                        }
                    }
                }
            }
            if (ok == false) {
                NuevoIngrediente nuevoIng = new NuevoIngrediente();
                nuevoIng.setNombre(buscar.getText());
                int confirmar = JOptionPane.showConfirmDialog(null, "No se encuentra registrado este ingrediente\n\t¿Desea registrarlo?", "Error", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (confirmar == 0) {
                    IngresarNuevoIngrediente ingresarIng = new IngresarNuevoIngrediente(new javax.swing.JDialog(), true);
                    ingresarIng.setVisible(true);

                }
            }
        }
    }//GEN-LAST:event_buscarKeyPressed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        
        ingredientes.add(nombreIngrediente.getSelectedItem());
        unidades.add(unidadIngrediente.getSelectedItem());
        cantidades.add(cantidadIngrediente.getValue());

        for (int i = 0; i < ingredientes.size(); i++) {
            ing.setNombre(ingredientes);
        }
        for (int i = 0; i < cantidades.size(); i++) {
            ing.setCantidad(cantidades);
        }
        for (int i = 0; i < unidades.size(); i++) {
            ing.setUnidad(unidades);
        }
        id = sql.ingrediente();
        for (int o = 0; o < id.size(); o++) {
            id2.add(id.get(0));
            ing.setId(id2);
        }

        nombreIngrediente.setSelectedIndex(0);
        unidadIngrediente.setSelectedIndex(0);
        cantidadIngrediente.setValue(0);
        panel.setVisible(false);
        buscar.setText("");
        
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        panel.setVisible(true);
        buscar.requestFocus();
    }//GEN-LAST:event_jLabel5MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuIngrediente dialog = new MenuIngrediente(new javax.swing.JDialog(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtras;
    javax.swing.JButton btnIngresar;
    private javax.swing.JTextField buscar;
    private javax.swing.JSpinner cantidadIngrediente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JComboBox<String> nombreIngrediente;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelAñadirIngrediente;
    private javax.swing.JComboBox<String> unidadIngrediente;
    // End of variables declaration//GEN-END:variables
}
