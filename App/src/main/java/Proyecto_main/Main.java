
package Proyecto_main;
import Model.Conexion;
import Model.ConfTabla;
import Model.Modelo;
import Model.Query;

import java.sql.Connection;

import Controler.Controlador;
import Visual.Interfaz;

public class Main {
    public static void main(String[] args) {
        Modelo model = new Modelo();
        Interfaz view = new Interfaz(model);
        Controlador Cont = new Controlador(model,view);

        try
        {
            Conexion con = new Conexion();
            Connection cc = con.connect();
            System.out.println(ConfTabla.CheckDB(cc));
            //System.out.println(Query.registrar(cc, "Palomon", "121234", "Ni idea", "Wakanda", "Vibranio"));
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }


        view.setVisible(true);
        
    }
    
}
