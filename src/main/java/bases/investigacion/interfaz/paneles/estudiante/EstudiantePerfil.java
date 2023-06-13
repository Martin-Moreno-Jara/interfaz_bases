/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package bases.investigacion.interfaz.paneles.estudiante;

import conexion.Conexion;
import static conexion.Conexion.getConexion;
import java.sql.*;

/**
 *
 * @author Hexaw
 */
public class EstudiantePerfil extends javax.swing.JPanel {

    int user = conexion.Verificar.currentUser;
    String userTel ="";
    String userDir ="";
    
    public EstudiantePerfil() {
        initComponents();
        llenarPerfil();
        aceptarCambios.setVisible(false);
        cancelar.setVisible(false);
    }
    public void llenarPerfil(){

        try{
            Statement s = Conexion.getConexion().createStatement();
            String call = "{CALL mostrar_un_perfil(?)}";
            CallableStatement stmt = getConexion().prepareCall(call);
            stmt.setInt(1, user);
            ResultSet rs=stmt.executeQuery();
            while (rs.next())
            {
                lbNom.setText(rs.getString(1));
                lbApellido.setText(rs.getString(2));
                lbEdad.setText(String.valueOf(rs.getInt(3)) );
                lbCorreo.setText(rs.getString(4));
                tel.setText(rs.getString(5));
                dir.setText(rs.getString(6));
                ced.setText(String.valueOf(rs.getInt(7)));
                lbCurso.setText(rs.getString(8));
                gru.setText(rs.getString(9));
               
            }
            userTel = tel.getText();
            userDir = dir.getText();
        }catch (SQLException ex) {
            System.out.println("Error: "+ex.toString());
        }
    }
    public static String sendGrupo(){
        return gru.getText();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ced = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        gru = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        editarButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbEdad = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbCorreo = new javax.swing.JLabel();
        lbCurso = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbNom = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        dir = new javax.swing.JTextField();
        tel = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lbApellido = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        aceptarCambios = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setText("Cédula");

        ced.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        ced.setText("PlaceHolder Cedula");

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel10.setText("Grupo");

        gru.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        gru.setText("PlaceHolder grupo");

        editarButton.setBackground(new java.awt.Color(118, 35, 47));
        editarButton.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        editarButton.setForeground(new java.awt.Color(255, 255, 255));
        editarButton.setText("Editar información");
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lbEdad.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lbEdad.setText("PlaceHolder edad");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setText("Correo");

        lbCorreo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lbCorreo.setText("PlaceHolder Correo");

        lbCurso.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lbCurso.setText("PlaceHolder cursando");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setText("Edad");

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setText("Telefono");

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setText("Dirección");

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setText("Cursando");

        lbNom.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lbNom.setText("placeHolder apellido");

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setText("Nombre");

        dir.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        dir.setText("jTextField4");
        dir.setBorder(null);
        dir.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        dir.setEnabled(false);

        tel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tel.setText("jTextField3");
        tel.setBorder(null);
        tel.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tel.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setText("Apellido");

        lbApellido.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lbApellido.setText("placeHolder apellido");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(lbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dir)
                                    .addComponent(tel)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(lbNom, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(31, 31, 31)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbNom))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbApellido))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbEdad))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbCorreo))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(dir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lbCurso))
                .addContainerGap())
        );

        cancelar.setBackground(new java.awt.Color(118, 35, 47));
        cancelar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        aceptarCambios.setBackground(new java.awt.Color(118, 35, 47));
        aceptarCambios.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        aceptarCambios.setForeground(new java.awt.Color(255, 255, 255));
        aceptarCambios.setText("Aceptar cambios");
        aceptarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarCambiosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 81, Short.MAX_VALUE)
                .addComponent(lbNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(aceptarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(ced))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addGap(18, 18, 18)
                            .addComponent(gru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(editarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(ced)
                            .addComponent(lbNombre))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(gru))
                        .addGap(164, 164, 164)
                        .addComponent(editarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aceptarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
       aceptarCambios.setVisible(true);
       cancelar.setVisible(true);
       tel.setEnabled(true);
       tel.setText("");
       dir.setEnabled(true);
       dir.setText("");
    }//GEN-LAST:event_editarButtonActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        tel.setEnabled(false);
       dir.setEnabled(false);
       tel.setText(userTel);
       dir.setText(userDir);
        aceptarCambios.setVisible(false);
        cancelar.setVisible(false);
    }//GEN-LAST:event_cancelarActionPerformed

    private void aceptarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarCambiosActionPerformed
       int ced = user;
       String tele = tel.getText();
       String dire = dir.getText();
       conexion.Updates.editarPerfilEstudiante(ced, tele, dire);
       llenarPerfil();
       tel.setEnabled(false);
       dir.setEnabled(false);
       cancelar.setVisible(false);
       aceptarCambios.setVisible(false);
    }//GEN-LAST:event_aceptarCambiosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarCambios;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel ced;
    private javax.swing.JTextField dir;
    private javax.swing.JButton editarButton;
    private static javax.swing.JLabel gru;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private static javax.swing.JLabel lbApellido;
    private static javax.swing.JLabel lbCorreo;
    private static javax.swing.JLabel lbCurso;
    private static javax.swing.JLabel lbEdad;
    private static javax.swing.JLabel lbNom;
    private static javax.swing.JLabel lbNombre;
    private javax.swing.JTextField tel;
    // End of variables declaration//GEN-END:variables
}
