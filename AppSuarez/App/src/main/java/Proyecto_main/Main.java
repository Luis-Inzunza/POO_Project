
package Proyecto_main;
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

            //System.out.println(getClass().getResource("/iconos/Nombre_del_programa-removebg-preview.png"));
            //System.out.println(Query.registrar(cc, "Palomon", "121234", "Ni idea", "Wakanda", "Vibranio"));
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }


        view.setVisible(true);
        
    }
    
}
