/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package bases.investigacion.interfaz.paneles;

import dialogs.EditPublicacion;
import dialogs.VerPublicaciones;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;
/**
 *
 * @author Hexaw
 */
public class GrupoPublicaciones extends javax.swing.JPanel {

    int grupo = conexion.Verificar.currentUser;
    static String oldName = "";
    public static String getOldName(){
        return oldName;
    }
    public GrupoPublicaciones() {
        initComponents();
        conexion.Consultas.llenarTablaPublicacionesGrupo(tablePublicaciones,grupo);
        llenarCBTemas();
        llenarCBproyectos1();
        llenarCBproyectos2();
    }
public void dialogVerPublicaciones(){
        VerPublicaciones pub = new VerPublicaciones();
        pub.setLocationRelativeTo(null);
        pub.setVisible(true);
    }
    public void llenarCBTemas(){
        ArrayList facultades = new ArrayList();
        cbTema.removeAllItems();
        cbTema.addItem("-");
        facultades = conexion.ComboBoxes.comboboxTemas();
        Iterator iterador = facultades.iterator();
        while(iterador.hasNext()){
            String opcion = (String) iterador.next();
            cbTema.addItem(opcion);
        }
    }
    public void llenarCBproyectos1(){
        ArrayList facultades = new ArrayList();
        cbProyecto.removeAllItems();
        cbProyecto.addItem("-");
        facultades = conexion.ComboBoxes.comboboxProyectosGrupo(conexion.Verificar.currentUser);
        Iterator iterador = facultades.iterator();
        while(iterador.hasNext()){
            String opcion = (String) iterador.next();
            cbProyecto.addItem(opcion);
        }
    }
    public void llenarCBproyectos2(){
        ArrayList facultades = new ArrayList();
        cbPubliProyecto.removeAllItems();
        cbPubliProyecto.addItem("-");
        facultades = conexion.ComboBoxes.comboboxProyectosGrupo(conexion.Verificar.currentUser);
        Iterator iterador = facultades.iterator();
        while(iterador.hasNext()){
            String opcion = (String) iterador.next();
            cbPubliProyecto.addItem(opcion);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        titulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePublicaciones = new javax.swing.JTable();
        crearPublicacion = new javax.swing.JButton();
        cbTema = new javax.swing.JComboBox<>();
        cbProyecto = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        titel = new javax.swing.JTextField();
        topic = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbPubliProyecto = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        pag = new javax.swing.JTextField();
        Eliminar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(118, 35, 47));
        jButton1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setText("Filtrar");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel3.setText("titulo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, -1));

        jButton2.setBackground(new java.awt.Color(118, 35, 47));
        jButton2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Ver información");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, -1, -1));

        titulo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 114, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel4.setText("Tema");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel6.setText("Proyecto");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, -1));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setText("Publicaciones");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 23, 105, -1));

        tablePublicaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Titulo", "Tema", "Proyecto", "Grupo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablePublicaciones);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 250));

        crearPublicacion.setBackground(new java.awt.Color(118, 35, 47));
        crearPublicacion.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        crearPublicacion.setForeground(new java.awt.Color(255, 255, 255));
        crearPublicacion.setText("Crear");
        crearPublicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearPublicacionActionPerformed(evt);
            }
        });
        jPanel1.add(crearPublicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, -1, -1));

        cbTema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbTema, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 114, -1));

        cbProyecto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 114, -1));

        jLabel5.setText("Titulo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel7.setText("Tema");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));
        jPanel1.add(titel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 80, -1));
        jPanel1.add(topic, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 80, -1));

        jLabel8.setText("Proyecto");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

        cbPubliProyecto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbPubliProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPubliProyectoActionPerformed(evt);
            }
        });
        jPanel1.add(cbPubliProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, -1));

        jLabel9.setText("ID");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        jLabel10.setText("Páginas");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 90, -1));
        jPanel1.add(pag, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 90, -1));

        Eliminar.setBackground(new java.awt.Color(118, 35, 47));
        Eliminar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPanel1.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, -1, -1));

        jButton5.setBackground(new java.awt.Color(118, 35, 47));
        jButton5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Editar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 715, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(tablePublicaciones.getSelectedRow()>-1){
            VerPublicaciones.atributos=conexion.Consultas.verInfo(tablePublicaciones,4);
            dialogVerPublicaciones();
        }else{
            JOptionPane.showMessageDialog(this, "Ninguna fila seleccionada");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cbPubliProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPubliProyectoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPubliProyectoActionPerformed
    public void vaciar(){
        id.setText("");
        titel.setText("");
        pag.setText("");
        topic.setText("");
    }
    private void crearPublicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearPublicacionActionPerformed
        int pId = Integer.parseInt(id.getText());
        String pTitulo = titel.getText();
        int pPag = Integer.parseInt(pag.getText());
        String pTema = topic.getText();
        int pProyecto = conexion.Consultas.proyectoNombre(cbPubliProyecto.getSelectedItem().toString());
        conexion.Inserts.crearPublicacion(pId, pTitulo, pPag, pTema, pProyecto);
        vaciar();
        conexion.Consultas.llenarTablaPublicacionesGrupo(tablePublicaciones,conexion.Verificar.currentUser);
    }//GEN-LAST:event_crearPublicacionActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        int seleccionado= tablePublicaciones.getSelectedRow();
        if (seleccionado>-1){
            String pub = (String) tablePublicaciones.getValueAt(seleccionado, 0);
            conexion.Deletes.eliminarPublicacion(pub);
            conexion.Consultas.llenarTablaPublicacionesGrupo(tablePublicaciones,grupo);
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int seleccionado= tablePublicaciones.getSelectedRow(); 
        if (seleccionado>-1){ 
            this.oldName = (String) tablePublicaciones.getValueAt(seleccionado, 0); 
            EditPublicacion e = new EditPublicacion(null, true); 
            e.setVisible(true); 
            conexion.Consultas.llenarTablaPublicacionesGrupo(tablePublicaciones,grupo); 
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String title = titulo.getText();
        String tema = cbTema.getSelectedItem().toString();
        String proyecto = cbProyecto.getSelectedItem().toString();
        System.out.println(proyecto);
        conexion.Consultas.filtrarTablaPublicaciones(tablePublicaciones, title, tema,GrupoInfo.nombreGrupo, proyecto);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Eliminar;
    private javax.swing.JComboBox<String> cbProyecto;
    private javax.swing.JComboBox<String> cbPubliProyecto;
    private javax.swing.JComboBox<String> cbTema;
    private javax.swing.JButton crearPublicacion;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pag;
    private javax.swing.JTable tablePublicaciones;
    private javax.swing.JTextField titel;
    private javax.swing.JTextField titulo;
    private javax.swing.JTextField topic;
    // End of variables declaration//GEN-END:variables
}
