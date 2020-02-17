package My.DomoticRoomModelo;


import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Clase de CalefaccionModelo
 * 
 * @author Jorge Barrio Conde
 * @author Miguel de la Parte Florez
 */
public class CalefaccionModelo {
    private boolean encendido;
    private float temperaturaActual;
    private float temperaturaDeseada;
    
    /**
     * Inicializador de CalefaccionObj
     * 
     * @param temperaturaActual float que indica la temperatura actual
     * @param temperaturaDeseada float que indica la temperatura a la que se quiere calentar
     */
    public CalefaccionModelo(float temperaturaActual, float temperaturaDeseada){
        this.temperaturaActual = temperaturaActual;
        this.temperaturaDeseada = temperaturaDeseada;
        encendido = false;
        initializeFrio();
    }
    
    /**
     * Setter de temperaturaActual
     * @param temperaturaActual float que indica la temperatura actual
     */
    public void setTemperaturaActual(float temperaturaActual){
        this.temperaturaActual = temperaturaActual;
        //showTemperaturaActual();
    }
    
    /**
     * Setter de la temperaturaDeseada
     * @param temperaturaDeseada float que indica la temperatura a la que se quiere calentar
     */
    public void setTemperaturaDeseada (float temperaturaDeseada){
        this.temperaturaDeseada = temperaturaDeseada;
        //showTemperaturaDeseada();
    }
    
    /**
     * Setter de encendido
     * @param encendido boolean que indica si esta encendida la calefaccion (true) o no (false)
     */
    public void setEncendido(boolean encendido){
        if (this.encendido != encendido) {
            this.encendido = encendido;
            //showEncendido();
        }
        if(this.encendido)
            initializeCalentando();
        else
            initializeFrio();
    }
    
    /**
     * Getter de la temperaturaActual
     * @return float de la temperatura a la que se encuentra el hogar
     */
    public float getTemperaturaActual(){
        return temperaturaActual;
    }
    
    /**
     * Getter de la temperaturaDeseada
     * @return float de la temperatura que se quiere llegar a calentar el hogar
     */
    public float getTemperaturaDeseada(){
        return temperaturaDeseada;
    }
    
    /**
     * Getter de encendido
     * @return true si esta encendido y false si no
     */
    public boolean getEncendido (){
        return encendido;
    }

    /**
     * Reloj que va decrementando la temperaturaActual
     */
    private void initializeFrio() {
        new Thread() {
            @Override
            public void run() {

                while(true){
                    temperaturaActual = temperaturaActual - (float)0.1;

                    try{
                        Thread.sleep(5000);
                    } catch(InterruptedException e) {}

                    if(temperaturaActual<18){
                        temperaturaActual=18;
                    }

                    
                }
            }
        }.start();
    }
    
    /**
     * Reloj que va incrementando la temperaturaActual
     */
    private void initializeCalentando() {
        new Thread() {
            @Override
            public void run() {

                while(encendido){

                    temperaturaActual = temperaturaActual + (float) 0.1;

                    if(temperaturaActual>temperaturaDeseada){
                        temperaturaActual = temperaturaDeseada;
                    }

                    try{
                        Thread.sleep(2000);
                    } catch(InterruptedException e) {}

                    
                }
            }
        }.start();
    }

}
