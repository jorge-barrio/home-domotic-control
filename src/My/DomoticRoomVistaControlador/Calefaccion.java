package My.DomoticRoomVistaControlador;

import My.DomoticRoomModelo.CalefaccionModelo;

import java.text.DecimalFormat;

import My.DomoticRoom.Main;

/**
 * Clase Calefaccion
 * @author Jorge Barrio Conde
 * @author Miguel de la Parte Florez
 */
public class Calefaccion extends javax.swing.JFrame {

    private CalefaccionControlador miControl;

    /**
     * Inicializador de Calefaccion
     * @param calefaccion objeto (Main.getCalefaccionModelo())
     */
    public Calefaccion() {
        initComponents();
        miControl = new CalefaccionControlador(this);
    }


    /**
     * Muestra en los JLabel correspondientes la temperaturaActual
     * @param formato objeto DecimalFormat que ajusta la precision del float
     * @param temperaturaActual float que indica la temperatura actual
     */
    public void showTemperaturaActual (DecimalFormat formato, float temperaturaActual){
        labelTemperaturaActual.setText(formato.format(temperaturaActual));
    }

    /**
     * Muestra en el JLabel correspondiente la temperatura a la que se quiere calentar
     * @param formato objeto DecimalFormat que ajusta la precision del float
     * @param temperaturaActual float que indica la temperatura actual
     */
    public void showTemperaturaDeseada (DecimalFormat formato, float temperaturaDeseada){
        labelTemperaturaDeseada.setText(formato.format(temperaturaDeseada));
    }

    /**
     * Muestra en los labels y botones indicados el estado de la calefaccion
     * @param encendido boolen que si es true mostrara el radiador como encendido y si es false como apagado
     */
    public void showEncendido (boolean encendido){
        if (encendido){
            labelCalefaccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/wradiadorOn.png")));
            interruptor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/ON.png")));

        }else{
            labelCalefaccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/wradiadorOff.png")));
            interruptor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/OFF.png")));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelDescripcion = new javax.swing.JLabel();
        botonVolver = new javax.swing.JButton();
        panelRepresentacion = new javax.swing.JPanel();
        panelCasa = new javax.swing.JPanel();
        labelCalefaccion = new javax.swing.JLabel();
        panelValores = new javax.swing.JPanel();
        labelTemperaturaActual = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelºCActual = new javax.swing.JLabel();
        interruptor = new javax.swing.JButton();
        panelBotones = new javax.swing.JPanel();
        botonSubirTemp = new javax.swing.JButton();
        botonBajarTemp = new javax.swing.JButton();
        labelTemperaturaDeseada = new javax.swing.JLabel();
        labelºCDeseada = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelFondo.setBackground(new java.awt.Color(48, 48, 48));
        panelFondo.setPreferredSize(new java.awt.Dimension(1016, 600));

        panelTitulo.setBackground(new java.awt.Color(48, 48, 48));

        labelTitulo.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(254, 254, 254));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Calefaccion");

        labelDescripcion.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        labelDescripcion.setForeground(new java.awt.Color(254, 254, 254));
        labelDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDescripcion.setText("Controlador de la temperatura del hogar");

        botonVolver.setBackground(new java.awt.Color(48, 48, 48));
        botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/volver.png"))); // NOI18N
        botonVolver.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        botonVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTituloLayout.createSequentialGroup()
                        .addComponent(labelDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panelTituloLayout.createSequentialGroup()
                        .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(227, 227, 227))))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelRepresentacion.setBackground(new java.awt.Color(48, 48, 48));

        panelCasa.setBackground(new java.awt.Color(48, 48, 48));

        labelCalefaccion.setBackground(new java.awt.Color(48, 48, 48));
        labelCalefaccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/wradiadorOff.png"))); // NOI18N

        javax.swing.GroupLayout panelCasaLayout = new javax.swing.GroupLayout(panelCasa);
        panelCasa.setLayout(panelCasaLayout);
        panelCasaLayout.setHorizontalGroup(
            panelCasaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCasaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCalefaccion, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelCasaLayout.setVerticalGroup(
            panelCasaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCasaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCalefaccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelValores.setBackground(new java.awt.Color(48, 48, 48));

        labelTemperaturaActual.setFont(new java.awt.Font("Uroob", 0, 48)); // NOI18N
        labelTemperaturaActual.setForeground(new java.awt.Color(254, 254, 254));
        labelTemperaturaActual.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelTemperaturaActual.setText("21.0");

        jLabel2.setFont(new java.awt.Font("Uroob", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TEMPERATURA:");

        labelºCActual.setFont(new java.awt.Font("Uroob", 0, 36)); // NOI18N
        labelºCActual.setForeground(new java.awt.Color(254, 254, 254));
        labelºCActual.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelºCActual.setText("ºC");

        interruptor.setBackground(new java.awt.Color(48, 48, 48));
        interruptor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/OFF.png"))); // NOI18N
        interruptor.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        interruptor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        interruptor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interruptorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelValoresLayout = new javax.swing.GroupLayout(panelValores);
        panelValores.setLayout(panelValoresLayout);
        panelValoresLayout.setHorizontalGroup(
            panelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelValoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                    .addGroup(panelValoresLayout.createSequentialGroup()
                        .addComponent(labelTemperaturaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelºCActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelValoresLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(interruptor, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        panelValoresLayout.setVerticalGroup(
            panelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelValoresLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTemperaturaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelºCActual, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(interruptor, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        panelBotones.setBackground(new java.awt.Color(48, 48, 48));

        botonSubirTemp.setBackground(new java.awt.Color(254, 254, 254));
        botonSubirTemp.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        botonSubirTemp.setText("/\\");
            botonSubirTemp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            botonSubirTemp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            botonSubirTemp.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonSubirTempActionPerformed(evt);
                }
            });

            botonBajarTemp.setBackground(new java.awt.Color(254, 254, 254));
            botonBajarTemp.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
            botonBajarTemp.setText("\\/");
            botonBajarTemp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            botonBajarTemp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            botonBajarTemp.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonBajarTempActionPerformed(evt);
                }
            });

            labelTemperaturaDeseada.setBackground(new java.awt.Color(254, 254, 254));
            labelTemperaturaDeseada.setFont(new java.awt.Font("Uroob", 0, 48)); // NOI18N
            labelTemperaturaDeseada.setForeground(new java.awt.Color(205, 26, 26));
            labelTemperaturaDeseada.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            labelTemperaturaDeseada.setText("21.0 ");

            labelºCDeseada.setFont(new java.awt.Font("Uroob", 0, 36)); // NOI18N
            labelºCDeseada.setForeground(new java.awt.Color(205, 26, 26));
            labelºCDeseada.setText("ºC");

            javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
            panelBotones.setLayout(panelBotonesLayout);
            panelBotonesLayout.setHorizontalGroup(
                panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBotonesLayout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(botonBajarTemp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonSubirTemp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelBotonesLayout.createSequentialGroup()
                            .addComponent(labelTemperaturaDeseada)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(labelºCDeseada, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)))
                    .addContainerGap(105, Short.MAX_VALUE))
            );
            panelBotonesLayout.setVerticalGroup(
                panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBotonesLayout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addComponent(botonSubirTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(25, 25, 25)
                    .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelºCDeseada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelTemperaturaDeseada, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addComponent(botonBajarTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(50, 50, 50))
            );

            javax.swing.GroupLayout panelRepresentacionLayout = new javax.swing.GroupLayout(panelRepresentacion);
            panelRepresentacion.setLayout(panelRepresentacionLayout);
            panelRepresentacionLayout.setHorizontalGroup(
                panelRepresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRepresentacionLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(panelValores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            panelRepresentacionLayout.setVerticalGroup(
                panelRepresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRepresentacionLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panelRepresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelValores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(panelCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
            panelFondo.setLayout(panelFondoLayout);
            panelFondoLayout.setHorizontalGroup(
                panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelFondoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelRepresentacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
            );
            panelFondoLayout.setVerticalGroup(
                panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panelRepresentacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 1079, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    /*==================================================================
                            Acciones de botones
     *================================================================*/

    private void interruptorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interruptorActionPerformed
        miControl.encender();
    }//GEN-LAST:event_interruptorActionPerformed

    private void botonSubirTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSubirTempActionPerformed
        miControl.subirTemp();
    }//GEN-LAST:event_botonSubirTempActionPerformed

    private void botonBajarTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBajarTempActionPerformed
        miControl.bajarTemp();
    }//GEN-LAST:event_botonBajarTempActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        miControl.back();
    }//GEN-LAST:event_botonVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBajarTemp;
    private javax.swing.JButton botonSubirTemp;
    private javax.swing.JButton botonVolver;
    private javax.swing.JButton interruptor;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelCalefaccion;
    private javax.swing.JLabel labelDescripcion;
    private javax.swing.JLabel labelTemperaturaActual;
    private javax.swing.JLabel labelTemperaturaDeseada;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelºCActual;
    private javax.swing.JLabel labelºCDeseada;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelCasa;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelRepresentacion;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JPanel panelValores;
    // End of variables declaration//GEN-END:variables
}