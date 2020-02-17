package My.DomoticRoomVistaControlador;

import My.DomoticRoom.Main;
import My.DomoticRoomModelo.CalefaccionModelo;
import java.text.DecimalFormat;

/**
 * Clase del controlador de la calefaccion
 * @author Jorge Barrio Conde
 * @author Miguel de la Parte Florez
 */
public class CalefaccionControlador {
        private Calefaccion miVista;

        /**
         * Inicializador de CalefaccionControlador
         * @param v objeto Calefaccion referido a la vista
         * @param c objeto CalefaccionModelo
         */
        public CalefaccionControlador(Calefaccion v){
            miVista = v;
            initializeFrio();
        }

        /**
         * Vuelve al JFrame general
         */
        public void back(){
            Main.getStateMachineLogin().retroceder();
        }

        /**
         * Enciende la calefaccion
         */
        public void encender(){
            (Main.getCalefaccionModelo()).setEncendido(!(Main.getCalefaccionModelo()).getEncendido());
            miVista.showEncendido((Main.getCalefaccionModelo()).getEncendido());
        }

        /**
         * Sube la temperatura de la calefaccion
         */
        public void subirTemp(){
            (Main.getCalefaccionModelo()).setTemperaturaDeseada(((Main.getCalefaccionModelo()).getTemperaturaDeseada() + (float)0.5));
            miVista.showTemperaturaDeseada(new DecimalFormat("#.0"), (Main.getCalefaccionModelo()).getTemperaturaDeseada());
        }

        /**
         * Baja la temperatura de la calefaccion
         */
        public void bajarTemp(){
            (Main.getCalefaccionModelo()).setTemperaturaDeseada((Main.getCalefaccionModelo()).getTemperaturaDeseada() - (float)0.5);
            miVista.showTemperaturaDeseada(new DecimalFormat("#.0"), (Main.getCalefaccionModelo()).getTemperaturaDeseada());
        }

        /**
         * Crea un hilo que simula la perdida de temperatura por el frio del exterior
         */
        private void initializeFrio() {
        new Thread() {
            @Override
            public void run() {
                while(true)
                miVista.showTemperaturaActual(new DecimalFormat("#.0"),(Main.getCalefaccionModelo()).getTemperaturaActual());
            }
        }.start();
    }

    /**
     * Crea un hilo que simula el incremento de temperatura por el calor de la calefaccion encendida
     */
    private void initializeCalentando() {
        new Thread() {
            @Override
            public void run() {

                miVista.showTemperaturaActual(new DecimalFormat("#.0"),(Main.getCalefaccionModelo()).getTemperaturaActual());
            }
        }.start();
    }
}
