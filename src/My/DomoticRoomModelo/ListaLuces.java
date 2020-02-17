/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My.DomoticRoomModelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Clase de ListaLuces
 * Representa la intalacion luminica de una habitacion
 * 
 * @author Jorge Barrio Conde
 * @author Miguel de la Parte Florez
 */


public class ListaLuces {
    /**
     * lista list de Luz que almacenan tod
     * ptr entero asociado a la posicion de una Luz de la instalacion (rango del 1 al 5)
     */

    private List<Luz> lista;
    private int ptr;
    /**
     * Inicializador de ListaLuces
     */

    public ListaLuces(){
        lista = new ArrayList();
        Luz L1 = new Luz("bedL");
        Luz L2 = new Luz("bedR");
        Luz L3 = new Luz("general");
        Luz L4 = new Luz("desk");
        Luz L5 = new Luz("sillon");
        lista.add(L1);
        lista.add(L2);
        lista.add(L3);
        lista.add(L4);
        lista.add(L5);
        ptr = 0;
    }
    /**
     * Devuelve la luz correspondiente a la posicion almacenada en ptr
     * @return objeto Luz correspondiente a la posicion ptr (del 1 al 5)
     */

    public Luz getLuz(){
        Luz luz = lista.get(ptr);
        return luz;
    }
    /**
     * Devuelve la luz correspondiente a un nombre dado
     * @param nombre
     *          El nombre de Luz a obtener
     * 
     * @return objeto Luz correspondiente a su nombre
     */

    public Luz getLuz(String nombre){
    for(Luz i : lista){
            if(i.getName().equals(nombre))
                return i;
        }
    return null;
    }
    
    /**
     * Comprueba si todas las luces estan al 30% de intensidad y de color amarillo (modo ambiental)
     * @return true si esta activado el modo ambiental o false si no
     */

    public boolean checkAmbiental(){
        for(Luz i : lista){
            if(!i.getEstado()||i.getColor()!=1||i.getIntensidad()!=30)
                return false;
        }
        return true;
    }
    /**
     * Comprueba si todas las luces estan encendidas al 100% de intensidad (modo encendido)
     * @return true si esta activado el modo encendido o false si no
     */

    public boolean checkEncendido(){
        for(Luz i : lista){
            if(!i.getEstado()||i.getColor()!=0||i.getIntensidad()!=100)
                return false;
        }
        return true;
    }
    /**
     * Comprueba si todas las luces estan apagadas (modo apagado)
     * @return true si esta activado el modo apagado o false si no
     */
    public boolean checkApagado(){
        for(Luz i : lista){
            if(i.getEstado())
                return false;
        }
        return true;
    }
    
    /**
     * Comprueba cuantas luces estan encendidas
     * @return un entero que dice cuantas luces hay encendidas
     */
    public int cuantasEncendidas(){
        int num = 0;
        for(Luz i : lista){
            if(i.getEstado())
                num++;
        }
        return num;
    }
    /**
     * Comprueba si la primera y la tercera luz estan encendidas al 60% de intensidad y de color blanco (modo lectura)
     * @return true si esta activado el modo lectura o false si no
     */

    public boolean checkLectura(){
        for(Luz i : lista){
            if (lista.indexOf(i)!=0&&lista.indexOf(i)!=2)
                if(i.getEstado())
                    return false;
            if (lista.indexOf(i)==0||lista.indexOf(i)==2)
            if(!i.getEstado()||i.getColor()!=0||i.getIntensidad()!=60)
                return false;
        }
        return true;
    }
    /**
     * Almacena en ptr la posicion de una luz determinada
     * @param pos posicion de una determinada luz (de 1 a 5)
     */

    public void setPtr(int pos){
        ptr = pos;
    }
    /**
     * Devuelve la posicion de una luz determinada
     * @return entero de la posicion de una luz determinada que ha sido guardada
     */

    public int getPtr(){
        return ptr;
    }
    /**
     * Establece modo ambiental (todas las luces encendidas al 30% y color amarillo)
     */

    public void setAmbiental(){
        for(Luz i : lista){
            i.on();
            i.setColor(1);
            i.setIntensidad(30);
        }
    }
    /**
     * Establece el modo encendido (todas las luces encendidas al 100% de intensidad)
     */
    public void setEncendido(){
        for(Luz i : lista){
            i.on();
            i.setColor(0);
            i.setIntensidad(100);
        }
        
    }
    /**
     * Establece el modo apagado (todas las luces apagadas)
     */

    public void setApagado(){
        for(Luz i : lista){
            i.off();
        }
        
    }
    /**
     * Establece el modo lectura (solo la luz 1 y 3 encendida en color blanco al 60% de intensidad)
     */

    public void setLectura(){
        for(Luz i : lista){
            i.off();
        }
        lista.get(0).on();
        lista.get(0).setColor(0);
        lista.get(0).setIntensidad(60);
        lista.get(2).on();
        lista.get(2).setColor(0);
        lista.get(2).setIntensidad(60);
    }
}
