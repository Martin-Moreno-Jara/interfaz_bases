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
public class Registros {
    static Connection conexion = Conexion.getConexion();
    
    public static void registrar_estudiante(int cedula,String nombre,String apellido,
            int edad, String correo,String telefono,String direccion,String tipo,int programa,String pass){
            try{
            Statement s = conexion.createStatement();
            String call = "{CALL estudiante_register(?,?,?,?,?,?,?,?,?,?)}";
            CallableStatement stmt = getConexion().prepareCall(call);
            stmt.setInt(1, cedula);
            stmt.setString(2, nombre);
            stmt.setString(3, apellido);
            stmt.setInt(4, edad);
            stmt.setString(5, correo);
            stmt.setString(6, telefono);
            stmt.setString(7, direccion);
            stmt.setString(8, tipo);
            stmt.setInt(9, programa);
            stmt.setString(10, pass);
            stmt.executeUpdate();

                JOptionPane.showMessageDialog(null, "Usuario creado correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
            
            System.out.println("No se ha podido crear el usuario: "+ex.toString());
        }
    }
    public static void registrar_profesor(int cedula,String nombre,String apellido,
            int edad, String correo,String telefono,String direccion,String tipo,int departamento,String pass){
            try{
            Statement s = conexion.createStatement();
            String call = "{CALL profesor_register(?,?,?,?,?,?,?,?,?,?)}";
            CallableStatement stmt = getConexion().prepareCall(call);
            stmt.setInt(1, cedula);
            stmt.setString(2, nombre);
            stmt.setString(3, apellido);
            stmt.setInt(4, edad);
            stmt.setString(5, correo);
            stmt.setString(6, telefono);
            stmt.setString(7, direccion);
            stmt.setString(8, tipo);
            stmt.setInt(9, departamento);
            stmt.setString(10, pass);
            stmt.executeUpdate();

                JOptionPane.showMessageDialog(null, "Usuario creado correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
            
            System.out.println("No se ha podido crear el usuario: "+ex.toString());
        }
    }
}
