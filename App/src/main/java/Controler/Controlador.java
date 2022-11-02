package Controler;
import Visual.Interfaz;
import Model.Modelo;
import java.awt.event.*;

/////Inicio de programa//////
public class Controlador {
    
    private Modelo m_model;
    private Interfaz m_view;
    
    //////constructor////////
    
    public Controlador(Modelo model, Interfaz view){
        m_model = model;
        m_view = view;
        
        view.addcerrarListener(new CerrarListener());
    }
    
    //////////Metodos y acciones//////////
    
    class CerrarListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            try{
                m_view.setVisible(false); //cierra el programa, enviar a controlador
            }catch (NumberFormatException nfex){
                m_view.showError("Bad input:");
            }
        }
        
    }
    
}
