package Controler;

import java.sql.*;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Clases.Cliente;
import Model.Query;
public class ControlData {
    
    private static Connection con = null;

    public static void Conect() throws Exception
    {
        try
        {
            con = Model.Query.connect();
            System.out.println(Model.ConfTabla.CheckDB(con,"Clientes"));
        }
        catch(Exception e)
        {
            System.out.println(e);
            
        }
       
    }

    public static List<Cliente> mostrarclientes()
    {
        List<Cliente> lista = null;
        try
        {
            lista = Model.Query.mostrarCliente(con);
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return lista;
    }

    public static boolean crearcliente(Cliente clie)
    {
        boolean creado = false;
        if(!clie.getNombre().matches(".*[a-zA-Z]+.*") ||!clie.getApe().matches(".*[a-zA-Z]+.*"))
        {
            creado = false;
            JOptionPane.showMessageDialog(null, "Favor de Introducir Caracteres Validos En Nombre y Apellido");
        }else
        {
            creado =  Query.registrarcliente(con, clie);

        }
        return creado;
    }
}
