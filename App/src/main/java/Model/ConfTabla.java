package Model;

import java.sql.*;

public class ConfTabla {
   
    public static String CrearTabla(Connection con, String tabla)
    {
        PreparedStatement ps;
        String devolver;
        //String reg = "CREATE TABLE Embarcacion (Nombre	TEXT, Matricula	INTEGER,  Cert	TEXT,  Puerto	TEXT, Tipo	TEXT, PRIMARY KEY(Matricula) )";
        String reg = identificartabla(tabla);

        try {
            ps = con.prepareStatement(reg);
            ps.executeUpdate();
            devolver = "Se ha creado la tabla";
            
        } catch (SQLException e) {
            devolver = e.toString();
        }
        return devolver;
    }
   static String identificartabla(String nom)
    {
        String reg = "";
        switch(nom)
        {
            case "Embarcaciones":
                        reg = "CREATE TABLE Embarcaciones(" +
                        "Embarcacion	TEXT NOT NULL,"+
                        "Matricula	INTEGER NOT NULL,"+
                        "Fecha_Zarpe	TEXT NOT NULL,"+
                        "Certificado_Seguridad	TEXT NOT NULL,"+
                        "Puerto_Exp	TEXT NOT NULL,"+
                        "Tipo_Pesca	TEXT NOT NULL,"+
                        "Extintores	INTEGER NOT NULL,"+
                        "Arqueo	NUMERIC NOT NULL,"+
                        "Eslora	NUMERIC NOT NULL,"+
                        "Manga	NUMERIC NOT NULL,"+
                        "Tipo_Casco	TEXT NOT NULL,"+
                        "Motor	TEXT NOT NULL,"+
                        "Puerto_Ori	TEXT NOT NULL,"+
                        "Tripulantes	INTEGER NOT NULL,"+
                        "PRIMARY KEY(Matricula));";
                break;

                case "Clientes":
                            reg = "CREATE TABLE Clientes ("+
                            "Nombre	TEXT NOT NULL,"+
                            "Apellido	TEXT NOT NULL,"+
                            "Telefono	INTEGER NOT NULL,"+
                            "Correo	TEXT NOT NULL,"+
                            "Barcos	INTEGER NOT NULL,"+
                            "PRIMARY KEY(Apellido));"; 
                break;
        }
        return reg;
    }


    public static String CheckDB(Connection con, String tabla)
    {
        PreparedStatement ps;
        String devolver;

        try {
            String reg = "SELECT * FROM " +  tabla;

            ps = con.prepareStatement(reg);
            ps.executeQuery();
            devolver = "Tabla Encontrada";
            
        } catch (SQLException e) {
            System.out.println("Tabla No Encontrada");
            devolver =CrearTabla(con, tabla);
        }
        return devolver;
    }


}
