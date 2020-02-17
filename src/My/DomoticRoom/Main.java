package My.DomoticRoom;

import My.DomoticRoomModelo.CalefaccionModelo;
import My.DomoticRoomModelo.ListaLuces;
import My.DomoticRoomModelo.Luz;
import My.DomoticRoomModelo.PersianaModelo;
import My.DomoticRoomVistaControlador.*;

/**
 * Clase Main
 * @author Jorge Barrio Conde
 * @author Miguel de la Parte Florez
 */
public class Main {
    private static StateMachine SM;
    
    private static CalefaccionModelo calefaccionModelo;
    private static PersianaModelo persianaModelo;
    private static Luz luz;
    private static ListaLuces listaLuces;
    
    public static void main(String args[]) {
        calefaccionModelo = new CalefaccionModelo(20,21);
        persianaModelo = new PersianaModelo();  
        listaLuces = new ListaLuces();
        
        SM = new StateMachine();
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DomoticRoomUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DomoticRoomUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DomoticRoomUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DomoticRoomUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new General().setVisible(true);
            }
        });
    }
    
    /**
     * Devuelve la referencia al objeto StateMachine
     * @return un objeto StateMachine
     */
    public static StateMachine getStateMachineLogin() {
        return SM;
    }
    
    public static PersianaModelo getPersianaModelo() {
        return persianaModelo;
    } 
    
    public static CalefaccionModelo getCalefaccionModelo(){
        return calefaccionModelo;
    }
    
    public static ListaLuces getListaLuces() {
        return listaLuces;
    }
}