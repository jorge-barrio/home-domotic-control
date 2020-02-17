package My.DomoticRoomVistaControlador;

import My.DomoticRoom.Main;
import My.DomoticRoomModelo.PersianaModelo;
import java.awt.Color;

/**
 * Clase controlador de persianas
 *
 * @author Jorge Barrio Conde
 * @author Miguel de la Parte Florez
 */
public class PersianasControlador {

    private Persianas miVista;
    int n;

    /**
     * Inicializador de PersianasControlador
     * @param v objeto Persiana
     * @param p objeto PersianaModelo
     */
    public PersianasControlador(Persianas v){
            miVista = v;
            n = 1;
    }
    /**
     * Retrocede de al JFrame general
     */
    public void back(){
            System.out.println(Main.getPersianaModelo());
            Main.getStateMachineLogin().retroceder();
    }

    /**
     * Selecciona la persiana 1
     */
    public void persiana1(){
        (Main.getPersianaModelo()).setPtr(1);
        n = 1;
        miVista.seleccionaPersiana1();
    }

    /**
     * Selecciona la persiana 2
     */
    public void persiana2(){
        (Main.getPersianaModelo()).setPtr(2);
        n = 2;
        miVista.seleccionaPersiana2();
    }

    /**
     * Sube la persiana seleccionada
     */
    public void up(){
        (Main.getPersianaModelo()).setPersiana(false);
        miVista.subir(n);
    }

    /**
     * Baja la persiana seleccionada
     */
    public void down(){
        (Main.getPersianaModelo()).setPersiana(true);
        miVista.bajar(n);
    }
}
