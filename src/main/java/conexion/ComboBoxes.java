/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import static conexion.Conexion.getConexion;
import static conexion.Consultas.conexion;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Hexaw
 */
public class ComboBoxes {
    
    
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
    public static ArrayList comboboxGrupos(){
        ArrayList items = new ArrayList();
        try{
            Statement s = conexion.createStatement();
            String call = "{CALL get_grupos()}";
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
    public static ArrayList comboboxTemas(){
        ArrayList items = new ArrayList();
        try{
            Statement s = conexion.createStatement();
            String call = "{CALL get_temas()}";
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
    public static ArrayList comboboxProyectos(){
        ArrayList items = new ArrayList();
        try{
            Statement s = conexion.createStatement();
            String call = "{CALL get_proyectos()}";
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
    public static ArrayList comboboxProyectosGrupo(int id){
        ArrayList items = new ArrayList();
        try{
            Statement s = conexion.createStatement();
            String call = "{CALL get_proyectos_un_grupoCombobox(?)}";
            CallableStatement stmt = getConexion().prepareCall(call);
            stmt.setInt(1, id);
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
    public static ArrayList comboboxEdificio(){
        ArrayList items = new ArrayList();
        try{
            Statement s = conexion.createStatement();
            String call = "{CALL get_edificios()}";
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
    public static ArrayList comboboxLabTipo(){
        ArrayList items = new ArrayList();
        try{
            Statement s = conexion.createStatement();
            String call = "{CALL get_labTipo()}";
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
    public static ArrayList comboboxDepartamentos(){
        ArrayList items = new ArrayList();
        try{
            Statement s = conexion.createStatement();
            String call = "{CALL get_departamentos()}";
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
    
}
