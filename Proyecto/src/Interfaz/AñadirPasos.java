/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Datos.RegistroReceta;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Rodrigo
 */
public class AñadirPasos extends javax.swing.JDialog {

    JTextField campo = new JTextField();
    ArrayList<String> lista = new ArrayList();

    ArrayList aux = new ArrayList();
    RegistroReceta rec = new RegistroReceta();
    int posY = 0, posX = 0;
    int i = 0;

    public AñadirPasos(javax.swing.JDialog parent, boolean modal) {

        super(parent, modal);
        initComponents();
        LNOMODI.setVisible(false);
        MODI.setVisible(true);
        LMODI.setVisible(true);
        NOMODI.setVisible(false);
        setLocationRelativeTo(null);
        listaPasos.removeAllItems();
        //anelCampos.setVisible(false);
        //PanelNum.setVisible(false);
        LabelPas.setText("Paso 1");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        listaPasos = new javax.swing.JComboBox<>();
        borrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaPaso = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        LMODI = new javax.swing.JLabel();
        LNOMODI = new javax.swing.JLabel();
        MODI = new javax.swing.JLabel();
        NOMODI = new javax.swing.JLabel();
        botonAtras = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LabelPas = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        paso = new javax.swing.JTextField();
        atras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(17, 17, 17));
        jPanel3.setForeground(new java.awt.Color(17, 17, 17));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hamburger (2).png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, -1));

        listaPasos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listaPasos.setBorder(null);
        listaPasos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaPasosActionPerformed(evt);
            }
        });
        jPanel3.add(listaPasos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 136, 34));

        borrar.setText("BORRA TODOS LOS PASOS");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        jPanel3.add(borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        areaPaso.setColumns(20);
        areaPaso.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        areaPaso.setRows(5);
        areaPaso.setText("fsdfsdfsdfsdfsd");
        jScrollPane2.setViewportView(areaPaso);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 240, 110));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Seleccione un paso a mostrar");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/loginbtn.png"))); // NOI18N
        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 118, 50));

        LMODI.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        LMODI.setText("MODIFICAR");
        jPanel3.add(LMODI, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, 20));

        LNOMODI.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        LNOMODI.setText("NO MODIFICAR");
        jPanel3.add(LNOMODI, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 90, -1));

        MODI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hoverbtn.png"))); // NOI18N
        MODI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MODIMouseClicked(evt);
            }
        });
        jPanel3.add(MODI, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 90, 40));

        NOMODI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/loginbtn.png"))); // NOI18N
        NOMODI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NOMODIMouseClicked(evt);
            }
        });
        jPanel3.add(NOMODI, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 90, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 0, 330, 470));

        botonAtras.setBackground(new java.awt.Color(255, 255, 255));
        botonAtras.setFont(new java.awt.Font("Nirmala UI", 0, 19)); // NOI18N
        botonAtras.setForeground(new java.awt.Color(255, 0, 1));
        botonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        botonAtras.setBorder(null);
        botonAtras.setBorderPainted(false);
        botonAtras.setContentAreaFilled(false);
        botonAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        jPanel1.add(botonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonGuardar.png"))); // NOI18N
        botonGuardar.setBorder(null);
        botonGuardar.setBorderPainted(false);
        botonGuardar.setContentAreaFilled(false);
        botonGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonGuardar.setFocusPainted(false);
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 48)); // NOI18N
        jLabel1.setText(" Pasos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 80)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/+.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 90, 61));

        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel3MouseDragged(evt);
            }
        });
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 296, 48));

        LabelPas.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        LabelPas.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(LabelPas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 130, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("_________________________");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 300, -1));

        paso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        paso.setForeground(new java.awt.Color(102, 102, 102));
        paso.setBorder(null);
        paso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pasoMouseClicked(evt);
            }
        });
        paso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasoActionPerformed(evt);
            }
        });
        jPanel1.add(paso, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 280, 30));

        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-back-30.png"))); // NOI18N
        atras.setContentAreaFilled(false);
        atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atras.setDefaultCapable(false);
        atras.setEnabled(false);
        atras.setFocusPainted(false);
        atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atrasMouseClicked(evt);
            }
        });
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        jPanel1.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 1, 610, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        //[255,87,34]NARANJITA LINDO
        if (!paso.getText().equals("")) {
            lista.add(paso.getText());
            LabelPas.setText("Paso " + (i + 2));
            i++;
            listaPasos.addItem("Paso " + i);
        }
        paso.setText("");


    }//GEN-LAST:event_jLabel2MouseClicked

    private void botonAtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAtrasMouseEntered

    }//GEN-LAST:event_botonAtrasMouseEntered

    private void botonAtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAtrasMouseExited

    }//GEN-LAST:event_botonAtrasMouseExited

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed

        this.dispose();
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed

        posX = evt.getX();
        posY = evt.getY();

    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseDragged
        setLocation(evt.getXOnScreen() - posX, evt.getYOnScreen() - posY);
    }//GEN-LAST:event_jLabel3MouseDragged

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed

        if (!paso.getText().equals("")) {

        }


    }//GEN-LAST:event_botonGuardarActionPerformed

    private void pasoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pasoMouseClicked

    }//GEN-LAST:event_pasoMouseClicked

    private void pasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pasoActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

        int pos = jPanel3.getX();
        if (pos > 500) {
            Animacion.Animacion.mover_izquierda(565, 280, 2, 2, jPanel3);

        } else {
            Animacion.Animacion.mover_derecha(280, 565, 2, 2, jPanel3);

        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void MODIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MODIMouseClicked

        MODI.setVisible(false);
        LMODI.setVisible(false);

        LNOMODI.setVisible(true);

        NOMODI.setVisible(true);
    }//GEN-LAST:event_MODIMouseClicked

    private void NOMODIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NOMODIMouseClicked

        NOMODI.setVisible(false);
        MODI.setVisible(true);

        LMODI.setVisible(true);
        LNOMODI.setVisible(false);
    }//GEN-LAST:event_NOMODIMouseClicked

    private void listaPasosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaPasosActionPerformed

        int io = 0;
        for (int j = 0; j < listaPasos.getItemCount(); j++) {
            io = listaPasos.getSelectedIndex();
        }
        for (int j = 0; j < lista.size(); j++) {
            areaPaso.setText(lista.get(io));
        }

    }//GEN-LAST:event_listaPasosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int io = listaPasos.getSelectedIndex();
        if (areaPaso.getText().equals("")) {
            int count = listaPasos.getItemCount();
            if (count == io + 1) {
                lista.remove(io);
                listaPasos.removeItemAt(io);
                i = i - 1;
                LabelPas.setText("Paso " + (i + 1));
            } else {
                JOptionPane.showMessageDialog(null, "Sólo se puede borrar el último paso");
            }
        } else {
            lista.set(io, areaPaso.getText());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea eliminar todos los pasos?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (confirmar == 0) {
            int io = listaPasos.getItemCount();
            lista.clear();
            listaPasos.removeAllItems();
            i = 0;
            LabelPas.setText("Paso " + (i + 1));
            areaPaso.setText("");
        }
    }//GEN-LAST:event_borrarActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed

        
    }//GEN-LAST:event_atrasActionPerformed

    private void atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseClicked
        
        AñadirReceta añ = new AñadirReceta();
        añ.requestFocus();
        this.dispose();
    }//GEN-LAST:event_atrasMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AñadirPasos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AñadirPasos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AñadirPasos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AñadirPasos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AñadirPasos dialog = new AñadirPasos(new javax.swing.JDialog(), true);
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
    private javax.swing.JLabel LMODI;
    private javax.swing.JLabel LNOMODI;
    private javax.swing.JLabel LabelPas;
    private javax.swing.JLabel MODI;
    private javax.swing.JLabel NOMODI;
    private javax.swing.JTextArea areaPaso;
    private javax.swing.JButton atras;
    private javax.swing.JButton borrar;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> listaPasos;
    private javax.swing.JTextField paso;
    // End of variables declaration//GEN-END:variables
}
