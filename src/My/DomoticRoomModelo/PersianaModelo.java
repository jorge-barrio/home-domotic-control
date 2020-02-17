/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My.DomoticRoomModelo;

/**
 * Clase PersianaModelo
 * 
 * @author Jorge Barrio Conde
 * @author Miguel de la Parte Florez
 */
public class PersianaModelo {
    private boolean persiana1;
    private boolean persiana2;
    private int ptr;
    
    /**
     * Inicializador de PersianasModelo
     */
    public PersianaModelo(){
        persiana1 = false;
        persiana2 = false;
        setPtr(1);
    }
    
    /**
     * Getter del estado de la persiana1
     * @return boolean con un true si la persiana esta bajada o false si esta subida
     */
    public boolean getPersiana1(){
        return persiana1;
    }
    
    /**
     * Getter del estado de la persiana2
     * @return boolean con un true si la persiana esta bajada o false si esta subida
     */
    public boolean getPersiana2(){
        return persiana2;
    }
    
    /**
     * Selecciona una persiana
     * @param n entero que indica que persiana quiere seleccionar
     */
    public void setPtr(int n){
        System.out.println(n);
        ptr = n;
    }
    
    /**
     * Setter del estado de la persiana seleccionada
     * @param estado boolean que es true si la persiana esta bajada o false si esta subida
     */
    public void setPersiana(boolean estado){
        if (ptr==1)
            persiana1 = estado;
        if (ptr==2)
            persiana2 = estado;
        System.out.println(estado+": "+persiana1+" "+persiana2);
    }
    
    public String toString() {
        return "Persiana1 bajada? "+getPersiana1()+"\tPersiana2 bajada? "+getPersiana2();
    }
}
