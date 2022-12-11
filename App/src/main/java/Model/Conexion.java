package Model;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {


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

    
}
