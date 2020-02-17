package My.DomoticRoomVistaControlador;

import My.DomoticRoom.Main;
/**
 * Clase del controlador general
 * @author Jorge Barrio Conde
 * @author Miguel de la Parte Florez
 */
public class GeneralControlador {
    private General miVista;
    
    /**
     * Inicializador de GeneralControlador
     * @param v objeto miVista
     */
    public GeneralControlador(General v){
            miVista = v;
        }
    
    /**
     * Activa el JFrame de las persianas y oculta el resto
     */
    public void persianaOn(){
        Main.getStateMachineLogin().persianaOn();
    }
    
    /**
     * Activa el JFrame de la calefaccion y oculta el resto
     */
    public void calefaccionOn(){
        Main.getStateMachineLogin().calefaccionOn();
    }
    
    /**
     * Activa el JFrame de las luces y oculta el resto
     */    
    public void lucesOn(){
        Main.getStateMachineLogin().lucesOn();
    }
}
