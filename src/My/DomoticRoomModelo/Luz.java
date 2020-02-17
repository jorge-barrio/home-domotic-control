/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My.DomoticRoomModelo;
/**
 * Clase Luz
 * Representa una lampara
 * 
 * @author Jorge Barrio Conde
 * @author Miguel de la Parte Florez
 */
public class Luz {
    private int intensidad;
    private int color; //0.-Blanco //1.-Amarillo //2.-Rojo //3.-Azul //4.-Verde
    private boolean encendido;
    private String nombre;
    
    /**
     * Inicializador de Luz
     * @param name String del nombre asociado a la Luz
     */
    public Luz(String name){
        intensidad = 0;
        color = 0;
        encendido = false;
        nombre = name;
    }
    
    /**
     * Asigna un entero a la intensidad de la Luz
     * @param intensidad entero asociado a la intensidad luminica de rango 0-100
     */
    public void setIntensidad(int intensidad){
        this.intensidad = intensidad;
    }
    
    /**
     * Devuelve el nombre de la Luz
     * @return String asociado al nombre de la Luz
     */
    public String getName(){
        return nombre;
    }
    
    /**
     * Establece color a la Luz
     * @param color entero de rango 0-4 asociado a 5 colores (0.-Blanco, 1.-Amarillo, 2.-Rojo, 3.-Azul, 4.-Verde)
     */
    public void setColor(int color){
        this.color = color;
    }
    
    /**
     * Enciende la Luz
     */
    public void on(){
        encendido = true;
    }
    
    /**
     * Conmuta la Luz (si esta apagada la enciende y vicebersa)
     */
    public void onoff(){
        encendido = !encendido;
    }
    
    /**
     * Apaga la Luz
     */
    public void off(){
        encendido = false;
    }
    
    /**
     * Devuelve intensidad de la Luz
     * @return int asociado a la intensidad de la Luz de rango 0-100
     */
    public int getIntensidad(){
        return intensidad;
    }
    
    /**
     * Devuelve el color de la Luz
     * @return entero de rango 0-4 asociado a 5 colores (0.-Blanco, 1.-Amarillo, 2.-Rojo, 3.-Azul, 4.-Verde)
     */
    public int getColor(){
        return color;
    }
    
    /**
     * Devuelve el estado de encendido
     * @return true si esta encendido y false si esta apagado
     */
    public boolean getEstado(){
        return encendido;
    }
}
