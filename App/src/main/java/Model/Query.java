package Model;

import java.sql.*;

public class Query {
   
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

}
