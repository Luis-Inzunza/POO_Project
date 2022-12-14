package Controler;

import java.sql.*;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Clases.Cliente;
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

    public static void crearcliente()
    {
        
    }
}
