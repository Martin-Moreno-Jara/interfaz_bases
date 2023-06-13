/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import static conexion.Conexion.getConexion;
import static conexion.Updates.conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Hexaw
 */
public class Inserts {
    static Connection conexion = Conexion.getConexion();
    
    public static void crearGrupo(int id,String nom,String area,int lider,String contra){
        try{
            Statement s = conexion.createStatement();
            String call = "{CALL crear_grupo(?,?,?,?,?)}";
            CallableStatement stmt = getConexion().prepareCall(call);
            stmt.setInt(1, id);
            stmt.setString(2, nom);
            stmt.setString(3, area);
            stmt.setInt(4, lider);
            stmt.setString(5, contra);
            stmt.executeUpdate();
          JOptionPane.showMessageDialog(null, "Grupo creado exitosamente");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }
    public static void crearProyecto(int id,String nom,String prop,String estado,int gru){
        try{
            Statement s = conexion.createStatement();
            String call = "{CALL crear_proyecto(?,?,?,?,?)}";
            CallableStatement stmt = getConexion().prepareCall(call);
            stmt.setInt(1, id);
            stmt.setString(2, nom);
            stmt.setString(3, prop);
            stmt.setString(4, estado);
            stmt.setInt(5, gru);
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Proyecto creado exitosamente");
          
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }
    public static void crearPublicacion(int id,String titulo,int pag,String tema,int pry){
        try{
            Statement s = conexion.createStatement();
            String call = "{CALL crear_publicacion(?,?,?,?,?)}";
            CallableStatement stmt = getConexion().prepareCall(call);
            stmt.setInt(1, id);
            stmt.setString(2, titulo);
            stmt.setInt(3, pag);
            stmt.setString(4, tema);
            stmt.setInt(5, pry);
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Publicación creada exitosamente");
          
        }catch (SQLException ex) {
            System.out.println("Error: "+ex.toString());
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }
}
