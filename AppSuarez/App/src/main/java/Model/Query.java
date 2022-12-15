package Model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Clases.Cliente;

public class Query {
   
    public  static Connection connect() throws Exception
    {
        Connection con = null;

            try{
                Class.forName("org.sqlite.JDBC");
    
                con =  DriverManager.getConnection("jdbc:sqlite:Database.sql");
     
            }catch(Exception e)
            {
                System.out.println(e);
            }
            return con;
    }

    public  void closecon(Connection con)
    {
        try
        {
            con.close();    

        }catch(Exception e)
        {
            System.out.println(e);
        }

    }

    public static String registrar(Connection con, String Nombre, String Matricula, String Cert, String Puerto, String Tipo)
    {
        PreparedStatement ps;
        String devolver;
        String reg = "INSERT INTO Embarcacion (Nombre, Matricula, Cert, Puerto, Tipo) VALUES(?,?,?,?,?)";

        try {
            ps = con.prepareStatement(reg);
            ps.setString(1, Nombre);
            ps.setString(2, Matricula);
            ps.setString(3, Cert);
            ps.setString(4, Puerto);
            ps.setString(5, Tipo);
            ps.executeUpdate();
            devolver = "Se ha subido correctamente";
            
        } catch (SQLException e) {
            devolver = e.toString();
        }
        return devolver;
    }

    public static boolean registrarcliente(Connection con, Cliente clie)
    {
        PreparedStatement ps;
        boolean devolver = false;
        String reg = "INSERT INTO Clientes (Nombre, Apellido, Telefono, Correo, Barcos, Fecha) VALUES(?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(reg);
            ps.setString(1, clie.getNombre());
            ps.setString(2, clie.getApe());
            ps.setString(3, clie.getTelefono());
            ps.setString(4, clie.getCorreo());
            ps.setInt(5, clie.getbarcos());
            ps.setString(6, clie.getFecha());
            ps.executeUpdate();
            devolver = true;
            JOptionPane.showMessageDialog(null, "Se ha subido correctamente");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return devolver;
    }

    public static List<Cliente> mostrarCliente(Connection con)
    {
        PreparedStatement ps;
        String reg = "SELECT * FROM Clientes";
        ResultSet res;
        List<Cliente> lista = new ArrayList<Cliente>();
       int  i=0;
        try {

            ps = con.prepareStatement(reg);
            res = ps.executeQuery();
            while(res.next())
            {
                Cliente client = new Cliente();
                client.setNombre(res.getString("Nombre"));
                client.setApe(res.getString("Apellido"));
                client.setCorreo(res.getString("Correo"));
                client.setbarcos(Integer.valueOf(res.getString("Barcos")));
                client.setTelefono(res.getString("Telefono"));
                client.setFecha(res.getString("Fecha"));
                lista.add(client);
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return lista;
    }

}
