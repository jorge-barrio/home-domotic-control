package My.DomoticRoomVistaControlador;

import javax.swing.JFrame;
import My.DomoticRoomVistaControlador.*;
import My.DomoticRoomModelo.*;

/**
 * Clase de la StateMachine
 * 
 * @author Jorge Barrio Conde
 * @author Miguel de la Parte Florez
 */
public class StateMachine {
    private General general;
    private JFrame luces;
    private JFrame calefaccion;
    private JFrame persianas;
    
    /**
     * Inicializador de la StateMachine
     */
    public StateMachine() {
        start();    
    }
    
    /**
     * Metodo de la ejecucion de la StateMachine
     */
    public void start() {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                general = new General();
                luces = new DomoticRoomUI();
                calefaccion = new Calefaccion();
                persianas = new Persianas();
                
                general.setLocationRelativeTo(null);
                luces.setLocationRelativeTo(null);
                calefaccion.setLocationRelativeTo(null);
                persianas.setLocationRelativeTo(null);
                
                general.setVisible(true);
            }
        });}

    /**
     * Hace visible el JFrame de las persianas
     */
    public void persianaOn() {
       general.setVisible(false);
       persianas.setVisible(true);
       
    }
    
    /**
     * Hace visible el JFrame de las luces
     */
    public void lucesOn() {
       general.setVisible(false);
       general.dispose();
       luces.setVisible(true);
    }
    
    /**
     * Hace visible el JFrame de la calefaccion
     */
    public void calefaccionOn() {
       general.setVisible(false);
       calefaccion.setVisible(true);
    }
    
    /**
     * Cierra la JFrame general
     */
    void close() {
       general.setVisible(false);
    }
    
    /**
     * Retrocede de un JFrame especifico al JFrame general
     */
    public void retroceder(){
        
        calefaccion.setVisible(false);
        luces.setVisible(false);
        persianas.setVisible(false);
        //System.out.println(persianaModelo);
        general.actualizaInfor();
        general.setVisible(true);
    }
}