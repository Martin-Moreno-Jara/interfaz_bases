/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import static conexion.Conexion.getConexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hexaw
 */
public class Consultas {
    static Connection conexion = Conexion.getConexion();
    public static int currentUser=-1;
    public static void setCerrarSesion(){
        currentUser=-1;
    }
    
    
    
    
     public static ArrayList comboboxPrograma(){
        ArrayList items = new ArrayList();
        try{
            Statement s = conexion.createStatement();
            String call = "{CALL get_programas_academicos()}";
            CallableStatement stmt = getConexion().prepareCall(call);
            ResultSet rs=stmt.executeQuery();

            while (rs.next())
            {
                String opcion = rs.getString(1);
                items.add(opcion);
            }
        }catch (SQLException ex) {
            System.out.println("Error: "+ex.toString());
        }
        return items;
    }
    public static ArrayList comboboxFacultad(){
        ArrayList items = new ArrayList();
        try{
            Statement s = conexion.createStatement();
            String call = "{CALL get_facultades()}";
            CallableStatement stmt = getConexion().prepareCall(call);
            ResultSet rs=stmt.executeQuery();

            while (rs.next())
            {
                String opcion = rs.getString(1);
                items.add(opcion);
            }
        }catch (SQLException ex) {
            System.out.println("Error: "+ex.toString());
        }
        return items;
    }
    public static ArrayList comboboxAreas(){
        ArrayList items = new ArrayList();
        try{
            Statement s = conexion.createStatement();
            String call = "{CALL get_grupos_areas()}";
            CallableStatement stmt = getConexion().prepareCall(call);
            ResultSet rs=stmt.executeQuery();

            while (rs.next())
            {
                String opcion = rs.getString(1);
                items.add(opcion);
            }
        }catch (SQLException ex) {
            System.out.println("Error: "+ex.toString());
        }
        return items;
    }
    public static ArrayList tableGrupos(){
         ArrayList items = new ArrayList();
        try{
            Statement s = conexion.createStatement();
            String call = "{CALL get_grupos_areas()}";
            CallableStatement stmt = getConexion().prepareCall(call);
            ResultSet rs=stmt.executeQuery();

            while (rs.next())
            {
                String opcion = rs.getString(1);
                items.add(opcion);
            }
        }catch (SQLException ex) {
            System.out.println("Error: "+ex.toString());
        }
        return items;
    }
    public static void llenarTablaGrupos(JTable tablaGrupos ){
        DefaultTableModel tm = new DefaultTableModel();
        String[] identifiers = new String[]{"Nombre","Área","N° Integrantes","N° Proyectos","N° Papers","Lider"};
        tm.setColumnIdentifiers(identifiers);
        tablaGrupos.setModel(tm);
        
         try{
            Statement s = conexion.createStatement();
            String call = "{CALL llenar_tabla_grupos()}";
            CallableStatement stmt = getConexion().prepareCall(call);
            ResultSet rs=stmt.executeQuery();

            while (rs.next())
            {
                String nombre = rs.getString(1);
                String  area = rs.getString(2);
                int integrantes = rs.getInt(3);
                int proyectos = rs.getInt(4);
                int papers = rs.getInt(5);
                String lider = rs.getString(6);
                tm.addRow(new Object[]{nombre,area,integrantes,proyectos,papers,lider});
            }
        }catch (SQLException ex) {
            System.out.println("Error: "+ex.toString());
        }          
    }
    public static void llenarTablaProyectos(JTable tablaGrupos ){
        DefaultTableModel tm = new DefaultTableModel();
        String[] identifiers = new String[]{"Nombre","Grupo","Estado"};
        tm.setColumnIdentifiers(identifiers);
        tablaGrupos.setModel(tm);
        
         try{
            Statement s = conexion.createStatement();
            String call = "{CALL ver_all_proyectos()}";
            CallableStatement stmt = getConexion().prepareCall(call);
            ResultSet rs=stmt.executeQuery();

            while (rs.next())
            {
                String nombre = rs.getString(1);
                String  grupo = rs.getString(2);          
                String estado = rs.getString(3);
                tm.addRow(new Object[]{nombre,grupo,estado});
            }
        }catch (SQLException ex) {
            System.out.println("Error: "+ex.toString());
        }          
    }
    public static void llenarTablaPublicaciones(JTable tablaGrupos ){
        DefaultTableModel tm = new DefaultTableModel();
        String[] identifiers = new String[]{"Titulo","Tema","Proyecto","Grupo"};
        tm.setColumnIdentifiers(identifiers);
        tablaGrupos.setModel(tm);
        
         try{
            Statement s = conexion.createStatement();
            String call = "{CALL ver_all_publicaciones()}";
            CallableStatement stmt = getConexion().prepareCall(call);
            ResultSet rs=stmt.executeQuery();

            while (rs.next())
            {
                String nombre = rs.getString(1);
                String  tema = rs.getString(2);
                String proyecto = rs.getString(3);
                String grupo = rs.getString(4);
                tm.addRow(new Object[]{nombre,tema,proyecto,grupo});
            }
        }catch (SQLException ex) {
            System.out.println("Error: "+ex.toString());
        }          
    }
    
    public static void llenarTablaLaboratorios(JTable tablaGrupos ){
        DefaultTableModel tm = new DefaultTableModel();
        String[] identifiers = new String[]{"ID","Nombre","Tipo","Edificio","Encargado"};
        tm.setColumnIdentifiers(identifiers);
        tablaGrupos.setModel(tm);
        
         try{
            Statement s = conexion.createStatement();
            String call = "{CALL llenar_tabla_laboratorios()}";
            CallableStatement stmt = getConexion().prepareCall(call);
            ResultSet rs=stmt.executeQuery();

            while (rs.next())
            {
                int ID = rs.getInt(1);
                String  nombre = rs.getString(2);
                String tipo = rs.getString(3);
                String edificio = rs.getString(4);
                String encargado = rs.getString(5);
                tm.addRow(new Object[]{ID,nombre,tipo,edificio,encargado});
            }
        }catch (SQLException ex) {
            System.out.println("Error: "+ex.toString());
        }          
    }
    public static Object[] verInfo(JTable tablaGrupos, int columns){
        Object[] atributos = new Object[columns];
        int row = tablaGrupos.getSelectedRow();
        for(int i=0;i<columns;i++){
            atributos[i]=tablaGrupos.getValueAt(row, i);
        }
        return atributos;
    }
    
    //LOGINS****************************************************************************************************************************************************
    public static int verificarLoginEstudiante(String correo,String pass){
        int verify = -1;
        try{
            Statement s = conexion.createStatement();
            String call = "{CALL login_estudiante(?,?)}";
            CallableStatement stmt = getConexion().prepareCall(call);
            stmt.setString(1, correo);
            stmt.setString(2, pass);
            ResultSet rs=stmt.executeQuery();

            while (rs.next())
            {
                verify=rs.getInt(1);
                currentUser=verify;
            }
        }catch (SQLException ex) {
            System.out.println("Error: "+ex.toString());
        }
        return verify;
    }
    public static int verificarLoginProfesor(String correo,String pass){
        int verify = -1;
        try{
            Statement s = conexion.createStatement();
            String call = "{CALL login_profesor(?,?)}";
            CallableStatement stmt = getConexion().prepareCall(call);
            stmt.setString(1, correo);
            stmt.setString(2, pass);
            ResultSet rs=stmt.executeQuery();

            while (rs.next())
            {
                verify=rs.getInt(1);
                 currentUser=verify;
            }
        }catch (SQLException ex) {
            System.out.println("Error: "+ex.toString());
        }
        return verify;
    }
    public static int verificarLoginEmpleado(String correo,String pass){
        int verify = -1;
        try{
            Statement s = conexion.createStatement();
            String call = "{CALL login_empleado(?,?)}";
            CallableStatement stmt = getConexion().prepareCall(call);
            stmt.setString(1, correo);
            stmt.setString(2, pass);
            ResultSet rs=stmt.executeQuery();

            while (rs.next())
            {
                verify=rs.getInt(1);
                 currentUser=verify;
            }
        }catch (SQLException ex) {
            System.out.println("Error: "+ex.toString());
        }
        return verify;
    }
    public static int verificarLoginGrupo(int id,String pass){
        int verify = -1;
        try{
            Statement s = conexion.createStatement();
            String call = "{CALL login_grupo(?,?)}";
            CallableStatement stmt = getConexion().prepareCall(call);
            stmt.setInt(1, id);
            stmt.setString(2, pass);
            ResultSet rs=stmt.executeQuery();

            while (rs.next())
            {
                verify=rs.getInt(1);
                 currentUser=verify;
            }
        }catch (SQLException ex) {
            System.out.println("Error: "+ex.toString());
        }
        return verify;
    }
    
}
