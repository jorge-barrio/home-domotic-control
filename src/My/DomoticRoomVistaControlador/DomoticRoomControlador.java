package My.DomoticRoomVistaControlador;
import My.DomoticRoom.Main;
import My.DomoticRoomModelo.Luz;
import My.DomoticRoomModelo.ListaLuces;
import java.awt.Color;
/**
 * Clase DomoticRoomControlador
 *
 * @author Jorge Barrio Conde
 * @author Miguel de la Parte Florez
 **/
public class DomoticRoomControlador {
        private DomoticRoomUI miVista;
        private Luz luz;
        /**
         * Iniciador del controlador
         */
        public DomoticRoomControlador(DomoticRoomUI v, Luz l){
            miVista = v;
            luz = l;
        }
        /**
         * Metodo que devuelve la lista de luces
         * @return objeto ListaLuces
         */
        public ListaLuces getLista(){
            return (Main.getListaLuces());
        }
        public void back(){
            Main.getStateMachineLogin().retroceder();
        }
        /**
         * Manejador del boton top-left
         * @param a JButton seleccionado
         */
        public void tlboton(javax.swing.JButton a){
            (Main.getListaLuces()).setPtr(0);
            miVista.setColorBotones(a.getBackground());
            miVista.botonesPorDefecto();
            miVista.botonSeleccionado(a);
            miVista.actualizarVista((Main.getListaLuces()).getLuz().getIntensidad(),(Main.getListaLuces()).getLuz().getColor(),(Main.getListaLuces()).getLuz().getEstado());
            if ((Main.getListaLuces()).checkAmbiental()){
                miVista.switchAmbiente(true);
            }else{
                miVista.switchAmbiente(false);
            }
            if ((Main.getListaLuces()).checkApagado()){
                miVista.switchApagado(true);
            }else{
                miVista.switchApagado(false);
            }
            if ((Main.getListaLuces()).checkEncendido()){
                miVista.switchEncendido(true);
            }else{
                miVista.switchEncendido(false);
            }
            if ((Main.getListaLuces()).checkLectura()){
                miVista.switchLectura(true);
            }else{
                miVista.switchLectura(false);
            }
        }
        /**
         * Manejador del boton top-right
         */
        public void trboton(javax.swing.JButton a){
            (Main.getListaLuces()).setPtr(1);
            miVista.setColorBotones(a.getBackground());
            miVista.botonesPorDefecto();
            miVista.botonSeleccionado(a);

            miVista.actualizarVista((Main.getListaLuces()).getLuz().getIntensidad(),(Main.getListaLuces()).getLuz().getColor(),(Main.getListaLuces()).getLuz().getEstado());

            if ((Main.getListaLuces()).checkAmbiental()){
                miVista.switchAmbiente(true);
            }else{
                miVista.switchAmbiente(false);
            }
            if ((Main.getListaLuces()).checkApagado()){
                miVista.switchApagado(true);
            }else{
                miVista.switchApagado(false);
            }
            if ((Main.getListaLuces()).checkEncendido()){
                miVista.switchEncendido(true);
            }else{
                miVista.switchEncendido(false);
            }
            if ((Main.getListaLuces()).checkLectura()){
                miVista.switchLectura(true);
            }else{
                miVista.switchLectura(false);
            }
        }
        /**
         * Manejador del boton central
         */
        public void ctrboton(javax.swing.JButton a){
            (Main.getListaLuces()).setPtr(2);
            miVista.setColorBotones(a.getBackground());
            miVista.botonesPorDefecto();
            miVista.botonSeleccionado(a);
            miVista.actualizarVista((Main.getListaLuces()).getLuz().getIntensidad(),(Main.getListaLuces()).getLuz().getColor(),(Main.getListaLuces()).getLuz().getEstado());
            if ((Main.getListaLuces()).checkAmbiental()){
                miVista.switchAmbiente(true);
            }else{
                miVista.switchAmbiente(false);
            }
            if ((Main.getListaLuces()).checkApagado()){
                miVista.switchApagado(true);
            }else{
                miVista.switchApagado(false);
            }
            if ((Main.getListaLuces()).checkEncendido()){
                miVista.switchEncendido(true);
            }else{
                miVista.switchEncendido(false);
            }
            if ((Main.getListaLuces()).checkLectura()){
                miVista.switchLectura(true);
            }else{
                miVista.switchLectura(false);
            }
        }
        /**
         * Manejador del boton bot-left
         */
        public void blboton(javax.swing.JButton a){
            (Main.getListaLuces()).setPtr(3);
            miVista.setColorBotones(a.getBackground());
            miVista.botonesPorDefecto();
            miVista.botonSeleccionado(a);
            miVista.actualizarVista((Main.getListaLuces()).getLuz().getIntensidad(),(Main.getListaLuces()).getLuz().getColor(),(Main.getListaLuces()).getLuz().getEstado());
            if ((Main.getListaLuces()).checkAmbiental()){
                miVista.switchAmbiente(true);
            }else{
                miVista.switchAmbiente(false);
            }
            if ((Main.getListaLuces()).checkApagado()){
                miVista.switchApagado(true);
            }else{
                miVista.switchApagado(false);
            }
            if ((Main.getListaLuces()).checkEncendido()){
                miVista.switchEncendido(true);
            }else{
                miVista.switchEncendido(false);
            }
            if ((Main.getListaLuces()).checkLectura()){
                miVista.switchLectura(true);
            }else{
                miVista.switchLectura(false);
            }
        }
        /**
         * Manejador del boton bot-right
         */
        public void brboton(javax.swing.JButton a){
            (Main.getListaLuces()).setPtr(4);
            miVista.setColorBotones(a.getBackground());
            miVista.botonesPorDefecto();
            miVista.botonSeleccionado(a);
            miVista.actualizarVista((Main.getListaLuces()).getLuz().getIntensidad(),(Main.getListaLuces()).getLuz().getColor(),(Main.getListaLuces()).getLuz().getEstado());
            if ((Main.getListaLuces()).checkAmbiental()){
                miVista.switchAmbiente(true);
            }else{
                miVista.switchAmbiente(false);
            }
            if ((Main.getListaLuces()).checkApagado()){
                miVista.switchApagado(true);
            }else{
                miVista.switchApagado(false);
            }
            if ((Main.getListaLuces()).checkEncendido()){
                miVista.switchEncendido(true);
            }else{
                miVista.switchEncendido(false);
            }
            if ((Main.getListaLuces()).checkLectura()){
                miVista.switchLectura(true);
            }else{
                miVista.switchLectura(false);
            }
        }
        /**
         * Manejador del boton interruptor
         */
        public void interruptor(){
            (Main.getListaLuces()).getLuz().onoff();
            miVista.actualizarVista((Main.getListaLuces()).getLuz().getIntensidad(),(Main.getListaLuces()).getLuz().getColor(),(Main.getListaLuces()).getLuz().getEstado());
            if ((Main.getListaLuces()).checkAmbiental()){
                miVista.switchAmbiente(true);
            }else{
                miVista.switchAmbiente(false);
            }
            if ((Main.getListaLuces()).checkApagado()){
                miVista.switchApagado(true);
            }else{
                miVista.switchApagado(false);
            }
            if ((Main.getListaLuces()).checkEncendido()){
                miVista.switchEncendido(true);
            }else{
                miVista.switchEncendido(false);
            }
            if ((Main.getListaLuces()).checkLectura()){
                miVista.switchLectura(true);
            }else{
                miVista.switchLectura(false);
            }
        }
        /**
         * Manejador del boton encendido
         */
        public void encendido(){
            (Main.getListaLuces()).setEncendido();
            miVista.switchEncendido();
            miVista.actualizarVista((Main.getListaLuces()).getLuz().getIntensidad(),(Main.getListaLuces()).getLuz().getColor(),(Main.getListaLuces()).getLuz().getEstado());
            if ((Main.getListaLuces()).checkAmbiental()){
                miVista.switchAmbiente(true);
            }else{
                miVista.switchAmbiente(false);
            }
            if ((Main.getListaLuces()).checkApagado()){
                miVista.switchApagado(true);
            }else{
                miVista.switchApagado(false);
            }
            if ((Main.getListaLuces()).checkEncendido()){
                miVista.switchEncendido(true);
            }else{
                miVista.switchEncendido(false);
            }
            if ((Main.getListaLuces()).checkLectura()){
                miVista.switchLectura(true);
            }else{
                miVista.switchLectura(false);
            }
        }
        /**
         * Manejador del boton de apagado
         */
        public void apagado(){
            (Main.getListaLuces()).setApagado();
            miVista.switchApagado();
            miVista.actualizarVista((Main.getListaLuces()).getLuz().getIntensidad(),(Main.getListaLuces()).getLuz().getColor(),(Main.getListaLuces()).getLuz().getEstado());
            if ((Main.getListaLuces()).checkAmbiental()){
                miVista.switchAmbiente(true);
            }else{
                miVista.switchAmbiente(false);
            }
            if ((Main.getListaLuces()).checkApagado()){
                miVista.switchApagado(true);
            }else{
                miVista.switchApagado(false);
            }
            if ((Main.getListaLuces()).checkEncendido()){
                miVista.switchEncendido(true);
            }else{
                miVista.switchEncendido(false);
            }
            if ((Main.getListaLuces()).checkLectura()){
                miVista.switchLectura(true);
            }else{
                miVista.switchLectura(false);
            }
        }
        /**
         * Manejador del boton de lectura
         */
        public void lectura(){
            (Main.getListaLuces()).setLectura();
            miVista.switchLectura();
            miVista.actualizarVista((Main.getListaLuces()).getLuz().getIntensidad(),(Main.getListaLuces()).getLuz().getColor(),(Main.getListaLuces()).getLuz().getEstado());
            if ((Main.getListaLuces()).checkAmbiental()){
                miVista.switchAmbiente(true);
            }else{
                miVista.switchAmbiente(false);
            }
            if ((Main.getListaLuces()).checkApagado()){
                miVista.switchApagado(true);
            }else{
                miVista.switchApagado(false);
            }
            if ((Main.getListaLuces()).checkEncendido()){
                miVista.switchEncendido(true);
            }else{
                miVista.switchEncendido(false);
            }
            if ((Main.getListaLuces()).checkLectura()){
                miVista.switchLectura(true);
            }else{
                miVista.switchLectura(false);
            }
        }
        /**
         * Manejador del boton de ambiental
         */
        public void ambiental(){
            (Main.getListaLuces()).setAmbiental();
            miVista.switchAmbiente();
            miVista.actualizarVista((Main.getListaLuces()).getLuz().getIntensidad(),(Main.getListaLuces()).getLuz().getColor(),(Main.getListaLuces()).getLuz().getEstado());
            if ((Main.getListaLuces()).checkAmbiental()){
                miVista.switchAmbiente(true);
            }else{
                miVista.switchAmbiente(false);
            }
            if ((Main.getListaLuces()).checkApagado()){
                miVista.switchApagado(true);
            }else{
                miVista.switchApagado(false);
            }
            if ((Main.getListaLuces()).checkEncendido()){
                miVista.switchEncendido(true);
            }else{
                miVista.switchEncendido(false);
            }
            if ((Main.getListaLuces()).checkLectura()){
                miVista.switchLectura(true);
            }else{
                miVista.switchLectura(false);
            }
        }
        /**
         * Manejador del boton del slider
         * @param num el balor de la barra-
         */
        public void barra(int num){
            (Main.getListaLuces()).getLuz().setIntensidad(num);
            miVista.actualizarVista((Main.getListaLuces()).getLuz().getIntensidad(),(Main.getListaLuces()).getLuz().getColor(),(Main.getListaLuces()).getLuz().getEstado());
            if ((Main.getListaLuces()).checkAmbiental()){
                miVista.switchAmbiente(true);
            }else{
                miVista.switchAmbiente(false);
            }
            if ((Main.getListaLuces()).checkApagado()){
                miVista.switchApagado(true);
            }else{
                miVista.switchApagado(false);
            }
            if ((Main.getListaLuces()).checkEncendido()){
                miVista.switchEncendido(true);
            }else{
                miVista.switchEncendido(false);
            }
            if ((Main.getListaLuces()).checkLectura()){
                miVista.switchLectura(true);
            }else{
                miVista.switchLectura(false);
            }
        }
        /**
         * Consulta el color de una luz
         * @param nombre nombre de la luz
         * @return el color
         */
        public String getColor(String nombre){
            int puntero = (Main.getListaLuces()).getPtr();
            switch (nombre){
                case "botonLamparaCamaL":
                    (Main.getListaLuces()).setPtr(0);
                    break;
                case "botonLamparaCamaR":
                    (Main.getListaLuces()).setPtr(1);
                    break;
                case "botonLamparaGeneral":
                    (Main.getListaLuces()).setPtr(2);
                    break;
                case "botonLamparaDesk":
                    (Main.getListaLuces()).setPtr(3);
                    break;
                case "botonLamparaSillon":
                    (Main.getListaLuces()).setPtr(4);
                    break;
            }

            String n=tradColor((Main.getListaLuces()).getLuz().getColor());
            (Main.getListaLuces()).setPtr(puntero);
            return n;
        }
        private String tradColor(int n){
            switch (n){
            case 0:
                return ("White");
            case 1:
                return ("Yellow");
            case 2:
                return ("Green");
            case 3:
                return ("Red");
            case 4:
                return ("Blue");
            }
            return "";
        }
        /**
         * Manejador de la caja
         * @param num codigo del color
         */
        public void caja(int num){
            (Main.getListaLuces()).getLuz().setColor(num);
            miVista.actualizarVista((Main.getListaLuces()).getLuz().getIntensidad(),(Main.getListaLuces()).getLuz().getColor(),(Main.getListaLuces()).getLuz().getEstado());

            if ((Main.getListaLuces()).checkAmbiental()){
                miVista.switchAmbiente(true);
            }else{
                miVista.switchAmbiente(false);
            }
            if ((Main.getListaLuces()).checkApagado()){
                miVista.switchApagado(true);
            }else{
                miVista.switchApagado(false);
            }
            if ((Main.getListaLuces()).checkEncendido()){
                miVista.switchEncendido(true);
            }else{
                miVista.switchEncendido(false);
            }
            if ((Main.getListaLuces()).checkLectura()){
                miVista.switchLectura(true);
            }else{
                miVista.switchLectura(false);
            }

        }
}
