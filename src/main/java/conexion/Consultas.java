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
    public static void filtrarTablaGrupos(JTable tablaGrupos,String nombre,String area){
        DefaultTableModel tm = new DefaultTableModel();
        String[] identifiers = new String[]{"Nombre","Área","N° Integrantes","N° Proyectos","N° Papers","Lider"};
        tm.setColumnIdentifiers(identifiers);
        tablaGrupos.setModel(tm);
        
         try{
            Statement s = conexion.createStatement();
            String call = "{CALL filtrar_grupos(?,?)}";
            CallableStatement stmt = getConexion().prepareCall(call);
            stmt.setString(1, nombre);
            stmt.setString(2, area);
            ResultSet rs=stmt.executeQuery();

            while (rs.next())
            {
                String tbnombre = rs.getString(1);
                String  tbarea = rs.getString(2);
                int integrantes = rs.getInt(3);
                int proyectos = rs.getInt(4);
                int papers = rs.getInt(5);
                String lider = rs.getString(6);
                tm.addRow(new Object[]{tbnombre,tbarea,integrantes,proyectos,papers,lider});
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
    
    public static void filtrarTablaProyectos(JTable tablaGrupos,String nombre,String grupo,String estado){
        DefaultTableModel tm = new DefaultTableModel();
        String[] identifiers = new String[]{"Nombre","Grupo","Estado"};
        tm.setColumnIdentifiers(identifiers);
        tablaGrupos.setModel(tm);
        
         try{
            Statement s = conexion.createStatement();
            String call = "{CALL filtrar_proyectos(?,?,?)}";
            CallableStatement stmt = getConexion().prepareCall(call);
            stmt.setString(1, nombre);
            stmt.setString(2, grupo);
            stmt.setString(3, estado);
            ResultSet rs=stmt.executeQuery();

            while (rs.next())
            {
                String nombreP = rs.getString(1);
                String  grupoP = rs.getString(2);          
                String estadoP = rs.getString(3);
                tm.addRow(new Object[]{nombreP,grupoP,estadoP});
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
    public static void filtrarTablaPublicaciones(JTable tablaGrupos,String titulo,String tema,String grupo,String proyecto){
        DefaultTableModel tm = new DefaultTableModel();
        String[] identifiers = new String[]{"Titulo","Tema","Proyecto","Grupo"};
        tm.setColumnIdentifiers(identifiers);
        tablaGrupos.setModel(tm);
        
         try{
            Statement s = conexion.createStatement();
            String call = "{CALL filtrar_publicaciones(?,?,?,?)}";
            CallableStatement stmt = getConexion().prepareCall(call);
            stmt.setString(1, titulo);
            stmt.setString(2, tema);
            stmt.setString(3, grupo);
            stmt.setString(4, proyecto);
            ResultSet rs=stmt.executeQuery();

            while (rs.next())
            {
                String tituloP = rs.getString(1);
                String  temaP = rs.getString(2);          
                String grupoP = rs.getString(3);
                String proyectoP = rs.getString(4);
                tm.addRow(new Object[]{tituloP,temaP,grupoP,proyectoP});
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
    public static void filtrarTablaLaboratorios(JTable tablaGrupos,String nombre,String tipo,String edificio){
        DefaultTableModel tm = new DefaultTableModel();
        String[] identifiers = new String[]{"ID","Nombre","Tipo","Edificio","Encargado"};
        tm.setColumnIdentifiers(identifiers);
        tablaGrupos.setModel(tm);
        
         try{
            Statement s = conexion.createStatement();
            String call = "{CALL filtrar_laboratorios(?,?,?)}";
            CallableStatement stmt = getConexion().prepareCall(call);
            stmt.setString(1, nombre);
            stmt.setString(2, tipo);
            stmt.setString(3, edificio);
            ResultSet rs=stmt.executeQuery();

            while (rs.next())
            {
                String tituloP = rs.getString(1);
                String  temaP = rs.getString(2);          
                String grupoP = rs.getString(3);
                String edf = rs.getString(4);
                String enc = rs.getString(5);
          
                tm.addRow(new Object[]{tituloP,temaP,grupoP,edf,enc});
            }
        }catch (SQLException ex) {
            System.out.println("Error: "+ex.toString());
        }          
    }
    
    public static void llenarTablaEstudiantes(JTable tablaGrupos ){
        DefaultTableModel tm = new DefaultTableModel();
        String[] identifiers = new String[]{"Nombre","Correo","Programa"};
        tm.setColumnIdentifiers(identifiers);
        tablaGrupos.setModel(tm);
        
         try{
            Statement s = conexion.createStatement();
            String call = "{CALL llenar_estudiantes()}";
            CallableStatement stmt = getConexion().prepareCall(call);
            ResultSet rs=stmt.executeQuery();

            while (rs.next())
            {
                String  nombre = rs.getString(1);
                String correo = rs.getString(2);
                String programa = rs.getString(3);;
                tm.addRow(new Object[]{nombre,correo,programa});
            }
        }catch (SQLException ex) {
            System.out.println("Error: "+ex.toString());
        }          
    }
    public static void filtrarTablaEstudiantes(JTable tablaGrupos,String cor,String pgr){
        DefaultTableModel tm = new DefaultTableModel();
        String[] identifiers = new String[]{"Nombre","Correo","Programa"};
        tm.setColumnIdentifiers(identifiers);
        tablaGrupos.setModel(tm);
        
         try{
            Statement s = conexion.createStatement();
            String call = "{CALL filtrar_estudiantes(?,?)}";
            CallableStatement stmt = getConexion().prepareCall(call);
            stmt.setString(1, cor);
            stmt.setString(2, pgr);
            ResultSet rs=stmt.executeQuery();

            while (rs.next())
            {
                String nombre = rs.getString(1);
                String  correo = rs.getString(2);          
                String programa = rs.getString(3);
                tm.addRow(new Object[]{nombre,correo,programa});
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
    public static int proyectoNombre(String nombre){
        int nom=0;
        try{
            Statement s = conexion.createStatement();
            String call = "{CALL get_proyId(?)}";
            CallableStatement stmt = getConexion().prepareCall(call);
            stmt.setString(1, nombre);
            ResultSet rs=stmt.executeQuery();

            while (rs.next())
            {
                nom=rs.getInt(1);
            }
        }catch (SQLException ex) {
            System.out.println("Error: "+ex.toString());
        }          
        return nom;
    }
    
    public static void llenarTablaProyectosGrupo(JTable tablaGrupos,int id){
        DefaultTableModel tm = new DefaultTableModel();
        String[] identifiers = new String[]{"Nombre","Grupo","Estado"};
        tm.setColumnIdentifiers(identifiers);
        tablaGrupos.setModel(tm);
        
         try{
            Statement s = conexion.createStatement();
            String call = "{CALL get_proyectos_un_grupo(?)}";
            CallableStatement stmt = getConexion().prepareCall(call);
            stmt.setInt(1, id);
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
    public static void llenarTablaPublicacionesGrupo(JTable tablaGrupos,int id){
        DefaultTableModel tm = new DefaultTableModel();
        String[] identifiers = new String[]{"Titulo","Tema","Proyecto","Grupo"};
        tm.setColumnIdentifiers(identifiers);
        tablaGrupos.setModel(tm);
        
         try{
            Statement s = conexion.createStatement();
            String call = "{CALL get_publicaciones_un_grupo(?)}";
            CallableStatement stmt = getConexion().prepareCall(call);
            stmt.setInt(1, id);
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
    
    public static void llenarTablaEstudiantesSinGrupo(JTable tablaGrupos ){
        DefaultTableModel tm = new DefaultTableModel();
        String[] identifiers = new String[]{"Nombre","Correo","Programa","Tipo"};
        tm.setColumnIdentifiers(identifiers);
        tablaGrupos.setModel(tm);
        
         try{
            Statement s = conexion.createStatement();
            String call = "{CALL mostrar_estudiantes_singrupo()}";
            CallableStatement stmt = getConexion().prepareCall(call);
            ResultSet rs=stmt.executeQuery();

            while (rs.next())
            {
                String  nombre = rs.getString(1);
                String correo = rs.getString(2);
                String programa = rs.getString(3);
                tm.addRow(new Object[]{nombre,correo,programa,"Estudiante"});
            }
            call = "{CALL ObtenerProfesoresSinGrupo()}";
            stmt = getConexion().prepareCall(call);
            rs=stmt.executeQuery();

            while (rs.next())
            {
                String  nombre = rs.getString(1);
                String correo = rs.getString(2);
                String programa = rs.getString(3);
                tm.addRow(new Object[]{nombre,correo,programa,"Profesor"});
            }
            
        }catch (SQLException ex) {
            System.out.println("Error: "+ex.toString());
        }          
    }
    
    public static void llenarTablaEstudiantesConGrupo(JTable tablaGrupos,int id ){
        DefaultTableModel tm = new DefaultTableModel();
        String[] identifiers = new String[]{"Nombre","Correo","Programa","Tipo"};
        tm.setColumnIdentifiers(identifiers);
        tablaGrupos.setModel(tm);
        
         try{
            Statement s = conexion.createStatement();
            String call = "{CALL lista_est_grupo(?)}";
            CallableStatement stmt = getConexion().prepareCall(call);
            stmt.setInt(1, id);
            ResultSet rs=stmt.executeQuery();

            while (rs.next())
            {
                String  nombre = rs.getString(1);
                String correo = rs.getString(2);
                String programa = rs.getString(3);
                tm.addRow(new Object[]{nombre,correo,programa,"Estudiante"});
            }
            call = "{CALL ObtenerProfesoresPorGrupo(?)}";
            stmt = getConexion().prepareCall(call);
            stmt.setInt(1, id);
            rs=stmt.executeQuery();

            while (rs.next())
            {
                String  nombre = rs.getString(1);
                String correo = rs.getString(2);
                String programa = rs.getString(3);
                tm.addRow(new Object[]{nombre,correo,programa,"Profesor"});
            }
        }catch (SQLException ex) {
            System.out.println("Error: "+ex.toString());
        }          
    }
    
    
    
}
