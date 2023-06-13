/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import static conexion.Conexion.getConexion;
import static conexion.Consultas.conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Hexaw
 */
public class Updates {
    static Connection conexion = Conexion.getConexion();
    public static void editarPerfilProfesor(int id,String tel,String dir){
        try{
            Statement s = conexion.createStatement();
            String call = "{CALL editar_profesor_perfil(?,?,?)}";
            CallableStatement stmt = getConexion().prepareCall(call);
            stmt.setInt(1, id);
            stmt.setString(2, tel);
            stmt.setString(3, dir);
            stmt.executeUpdate();
          
        }catch (SQLException ex) {
            System.out.println("Error: "+ex.toString());
        }
    }
    public static void editarPerfilEstudiante(int id,String tel,String dir){
        try{
            Statement s = conexion.createStatement();
            String call = "{CALL editar_estudiante_perfil(?,?,?)}";
            CallableStatement stmt = getConexion().prepareCall(call);
            stmt.setInt(1, id);
            stmt.setString(2, tel);
            stmt.setString(3, dir);
            stmt.executeUpdate();
          
        }catch (SQLException ex) {
            System.out.println("Error: "+ex.toString());
        }
    }
    public static void editarProyecto(String oldName, String newName){
        try{
            Statement s = conexion.createStatement();
            String call = "{CALL actualizarNombreProyecto(?,?)}";
            CallableStatement stmt = getConexion().prepareCall(call);
            stmt.setString(1, oldName);
            stmt.setString(2, newName);
            stmt.executeUpdate();
          
        }catch (SQLException ex) {
            System.out.println("Error: "+ex.toString());
        }
    }
    
    public static void editarPublicacion(String id, String newTitulo,String newTema){
        try{
            Statement s = conexion.createStatement();
            String call = "{CALL actualizarPaper(?,?,?)}";
            CallableStatement stmt = getConexion().prepareCall(call);
            stmt.setString(1, id);
            stmt.setString(2, newTitulo);
            stmt.setString(3, newTema);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"La actualización se realizó exitosamente");
          
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
            System.out.println("Error: "+ex.toString());
        }
    }
    public static void addProfesor(int grupo,String profe){
        try{
            Statement s = conexion.createStatement();
            String call = "{CALL add_profesor(?,?)}";
            CallableStatement stmt = getConexion().prepareCall(call);
            stmt.setInt(1, grupo);
            stmt.setString(2, profe);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Profesor añadido exitosamente");
          
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());

        }
    }
    public static void addEstudiante(int grupo,String estu){
        try{
            Statement s = conexion.createStatement();
            String call = "{CALL ActualizarGrupoEstudiante(?,?)}";
            CallableStatement stmt = getConexion().prepareCall(call);
            stmt.setInt(1, grupo);
            stmt.setString(2, estu);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Estudiante añadido exitosamente");
          
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());

        }
    }
    
    public static void removeProfesor(int grupo,String profe){
        try{
            Statement s = conexion.createStatement();
            String call = "{CALL remove_profesor(?,?)}";
            CallableStatement stmt = getConexion().prepareCall(call);
            stmt.setInt(1, grupo);
            stmt.setString(2, profe);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Profesor eliminado exitosamente");
          
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());

        }
    }
    public static void removeEstudiante(String estu){
        try{
            Statement s = conexion.createStatement();
            String call = "{CALL remove_estudiante(?)}";
            CallableStatement stmt = getConexion().prepareCall(call);
            stmt.setString(1, estu);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Estudiante eliminado exitosamente");
          
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());

        }
    }
}
