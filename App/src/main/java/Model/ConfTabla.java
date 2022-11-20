package Model;

import java.sql.*;

public class ConfTabla {
   
    public static String CrearTabla(Connection con)
    {
        PreparedStatement ps;
        String devolver;
        String reg = "CREATE TABLE Embarcacion (Nombre	TEXT, Matricula	INTEGER,  Cert	TEXT,  Puerto	TEXT, Tipo	TEXT, PRIMARY KEY(Matricula) )";

        try {
            ps = con.prepareStatement(reg);
            ps.executeUpdate();
            devolver = "Se ha creado la tabla";
            
        } catch (SQLException e) {
            devolver = e.toString();
        }
        return devolver;
    }

    public static String CheckDB(Connection con)
    {
        PreparedStatement ps;
        String devolver;

        try {
            ps = con.prepareStatement("SELECT * FROM Embarcacion");
            ps.executeQuery();
            devolver = "Tabla Encontrada";
            
        } catch (SQLException e) {
            System.out.println("Tabla No Encontrada");
            devolver =CrearTabla(con);
        }
        return devolver;
    }


}
