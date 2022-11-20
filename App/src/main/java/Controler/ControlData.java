package Controler;

import java.sql.*;
public class ControlData {
    
    private Connection con = null;

    public void Conect() throws Exception
    {
        try
        {
            con = Model.Conexion.connect();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
       
    }
}
