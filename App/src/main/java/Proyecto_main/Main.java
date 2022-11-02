
package Proyecto_main;
import Model.Modelo;
import Controler.Controlador;
import Visual.Interfaz;

public class Main {
    public static void main(String[] args) {
        Modelo model = new Modelo();
        Interfaz view = new Interfaz(model);
        Controlador Cont = new Controlador(model,view);
        
        view.setVisible(true);
        
    }
    
}
