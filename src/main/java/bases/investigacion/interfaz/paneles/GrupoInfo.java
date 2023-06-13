/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package bases.investigacion.interfaz.paneles;

import conexion.*;
import static conexion.Conexion.getConexion;
import java.sql.*;

/**
 *
 * @author Hexaw
 */
public class GrupoInfo extends javax.swing.JPanel {

    int user = conexion.Verificar.currentUser;
    public GrupoInfo() {
        initComponents();
        cargarInfo();
    }
    static String nombreGrupo="";
    static String lider ="";
    public static String getLiderNombre(){
        return lider;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbNumIntegrantes = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbNumProyectos = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbNumPapers = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbId = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        lbArea = new javax.swing.JLabel();
        lbNom = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbLider = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setText("Área");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setText("N° Integrantes");

        lbNumIntegrantes.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lbNumIntegrantes.setText("PlaceHolder edad");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setText("N° Proyectos");

        lbNumProyectos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lbNumProyectos.setText("PlaceHolder Correo");

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setText("N° Papers");

        lbNumPapers.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lbNumPapers.setText("PlaceHolder tipo");

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setText("ID");

        lbId.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lbId.setText("PlaceHolder ID");

        lbArea.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lbArea.setText("placeHolder apellido");

        lbNom.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lbNom.setText("placeHolder apellido");

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel10.setText("Lider");

        lbLider.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lbLider.setText("PlaceHolder cargo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(47, 193, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel5))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbNom, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNombre))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbArea, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addComponent(lbNumIntegrantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lbId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbLider, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)))
                        .addComponent(lbNumProyectos, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                        .addComponent(lbNumPapers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(244, 370, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbNombre)
                    .addComponent(lbNom))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbArea))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbNumIntegrantes))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbNumProyectos))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lbNumPapers))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lbLider))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbId))
                .addContainerGap(168, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    public void cargarInfo(){
        
        try{
            Statement s = Conexion.getConexion().createStatement();
            String call = "{CALL mostrar_perfil_grupo(?)}";
            CallableStatement stmt = getConexion().prepareCall(call);
            stmt.setInt(1, user);
            ResultSet rs=stmt.executeQuery();
            while (rs.next())
            {
                lbId.setText(String.valueOf(rs.getInt(1)));
                lbNom.setText(rs.getString(2));
                lbNumIntegrantes.setText(String.valueOf(rs.getInt(3)) );
                lbNumPapers.setText(String.valueOf(rs.getInt(4)));
                lbArea.setText(rs.getString(5));
                lbNumProyectos.setText(rs.getString(6));
                lbLider.setText(rs.getString(7));                   
            }
            lider = lbLider.getText();
            nombreGrupo=lbNom.getText();
        }catch (SQLException ex) {
            System.out.println("Error: "+ex.toString());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private static javax.swing.JLabel lbArea;
    private javax.swing.JLabel lbId;
    private static javax.swing.JLabel lbLider;
    private static javax.swing.JLabel lbNom;
    private static javax.swing.JLabel lbNombre;
    private static javax.swing.JLabel lbNumIntegrantes;
    private static javax.swing.JLabel lbNumPapers;
    private static javax.swing.JLabel lbNumProyectos;
    // End of variables declaration//GEN-END:variables
}
