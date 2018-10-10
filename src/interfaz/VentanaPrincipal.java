/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import mundo.Comparador;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Logger;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;


/**
 *This interface was made with netbeans
 *i've got some troubles with the function of saving the numbers and the commas obtained, i have to write a line to
 *avoid the JPanels to grow when they first receive a number, but all the rest is working good 
 * @author Cristian Guatuzmal
 */
public class VentanaPrincipal extends JFrame {
	/**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    private void initComponents() {

        recibidorNumero = new JPanel();
        recibidor = new JTextField();
        ingresarNumero = new JButton();
        progresoNumeros = new JPanel();
        intentos = new JPanel();
        intentosTexto = new JLabel();
        intentosNumero = new JLabel();
        panelPuntosYComas = new JPanel();
        puntosYComas = new JLabel();
        marcadorNumeros = new JPanel();
        progresoComas = new JPanel();
        panelInferior = new JPanel();
        ReiniciarJuego = new JButton();
        etiquetaNumeroDeCifras = new JLabel();
        miComparador = new Comparador();
        numeroDeCifras = new JComboBox<>();
        botonUno = new BotonVerificador(1);
        botonDos = new BotonVerificador(2);
        botonTres = new BotonVerificador(3);
        botonCuatro = new BotonVerificador(4);
        botonCinco = new BotonVerificador(5);
        botonSeis = new BotonVerificador(6);
        botonSiete = new BotonVerificador(7);
        botonOcho = new BotonVerificador(8);
        botonNueve = new BotonVerificador(9);
        botonCero = new BotonVerificador(0);
        contadorIntentos = 0;
        pivoteNumeros = 0;
        
        
         // Set the close operation and gives a title to the frame
         
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juego de puntos y comas");
         
        //gives properties to the JPanel "marcadorNumeros" and displays it
       marcadorNumeros.setBorder(BorderFactory.createTitledBorder("Marcar números no incluidos"));

        GroupLayout marcadorNumerosLayout = new GroupLayout(marcadorNumeros);
        marcadorNumeros.setLayout(marcadorNumerosLayout);
        marcadorNumerosLayout.setHorizontalGroup(
            marcadorNumerosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(marcadorNumerosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(marcadorNumerosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(marcadorNumerosLayout.createSequentialGroup()
                        .addComponent(botonUno, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonDos, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonTres, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonCuatro, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonCinco, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                    .addGroup(marcadorNumerosLayout.createSequentialGroup()
                        .addComponent(botonSeis, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonSiete, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonOcho, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonNueve, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(botonCero, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        marcadorNumerosLayout.setVerticalGroup(
            marcadorNumerosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(marcadorNumerosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(marcadorNumerosLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(botonUno, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonDos, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonTres, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCuatro, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCinco, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(marcadorNumerosLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCero, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonNueve, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonOcho, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSiete, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSeis, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE)));
        
        
        //gives properties to the JPanel "recibidorNumero" and displays it
        recibidorNumero.setBorder(BorderFactory.createTitledBorder("Escribir numero"));

        ingresarNumero.setText("Insertar número");
        ingresarNumero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ingresarNumeroActionPerformed(evt);
            }
        });

        GroupLayout recibidorNumeroLayout = new GroupLayout(recibidorNumero);
        recibidorNumero.setLayout(recibidorNumeroLayout);
        recibidorNumeroLayout.setHorizontalGroup(
            recibidorNumeroLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(recibidorNumeroLayout.createSequentialGroup()
                .addGroup(recibidorNumeroLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(recibidorNumeroLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(recibidor, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                    .addGroup(recibidorNumeroLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(ingresarNumero, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        recibidorNumeroLayout.setVerticalGroup(
            recibidorNumeroLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(recibidorNumeroLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(recibidor, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(ingresarNumero, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        
      //gives properties to the JPanel "progresoNumeros" and displays it
        progresoNumeros.setBorder(BorderFactory.createTitledBorder("Intentos realizados"));

        intentosTexto.setText("Intentos:");

        intentosNumero.setText("0");

        GroupLayout intentosLayout = new GroupLayout(intentos);
        intentos.setLayout(intentosLayout);
        intentosLayout.setHorizontalGroup(
            intentosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(intentosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(intentosTexto)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(intentosNumero)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        intentosLayout.setVerticalGroup(
            intentosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(intentosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(intentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(intentosTexto)
                    .addComponent(intentosNumero))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GridLayout progresoNumerosLayout = new GridLayout(7,7);
        progresoNumerosLayout.minimumLayoutSize(rootPane);
        progresoNumeros.setLayout(progresoNumerosLayout);
        progresoNumeros.add(new JLabel("aqui se insertan numeros"));
      //gives properties to the JPanel "panelPuntosYcomas" and displays it
        panelPuntosYComas.setBorder(BorderFactory.createTitledBorder("Puntos y comas"));

        puntosYComas.setFont(new Font("Consolas", 1, 24)); // NOI18N

        GroupLayout panelPuntosYComasLayout = new GroupLayout(panelPuntosYComas);
        panelPuntosYComas.setLayout(panelPuntosYComasLayout);
        panelPuntosYComasLayout.setHorizontalGroup(
            panelPuntosYComasLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelPuntosYComasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(puntosYComas, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPuntosYComasLayout.setVerticalGroup(
            panelPuntosYComasLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelPuntosYComasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(puntosYComas, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
      //gives properties to the JPanel "progresoComas" and displays it
        progresoComas.setBorder(BorderFactory.createTitledBorder("progreso"));

        GridLayout layoutProgresoComas = new GridLayout(7,7);
        layoutProgresoComas.minimumLayoutSize(rootPane);
        progresoComas.setLayout(layoutProgresoComas);
        progresoComas.add(new JLabel("aqui se insertan comas"));

        ReiniciarJuego.setText("ReiniciarJuego");
        ReiniciarJuego.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ReiniciarJuegoActionPerformed(evt);
            }
        });

        etiquetaNumeroDeCifras.setText("número de cifras a jugar");

        numeroDeCifras.setMaximumRowCount(9);
        numeroDeCifras.setModel(new DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        numeroDeCifras.setSelectedIndex(2);
        numeroDeCifras.setToolTipText("");
        numeroDeCifras.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                numeroDeCifrasActionPerformed(evt);
            }
        });

        GroupLayout panelInferiorLayout = new GroupLayout(panelInferior);
        panelInferior.setLayout(panelInferiorLayout);
        panelInferiorLayout.setHorizontalGroup(
            panelInferiorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, panelInferiorLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ReiniciarJuego, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
                .addGroup(panelInferiorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(panelInferiorLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(etiquetaNumeroDeCifras)
                        .addGap(51, 51, 51))
                    .addGroup(GroupLayout.Alignment.TRAILING, panelInferiorLayout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numeroDeCifras, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))))
        );
        panelInferiorLayout.setVerticalGroup(
            panelInferiorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, panelInferiorLayout.createSequentialGroup()
                .addComponent(etiquetaNumeroDeCifras)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numeroDeCifras, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
            .addComponent(ReiniciarJuego, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(panelPuntosYComas, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(marcadorNumeros, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(progresoComas, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(progresoNumeros, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(recibidorNumero, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(panelInferior, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelPuntosYComas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(marcadorNumeros, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(progresoComas, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(recibidorNumero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(progresoNumeros, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelInferior, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
      pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * this method determines what will ingresarNumero do when pressed
     * @param evt which represents the button press
     */
    private void ingresarNumeroActionPerformed(ActionEvent evt) {//GEN-FIRST:event_ingresarNumeroActionPerformed
        miComparador.setNumeroActual(Integer.parseInt(recibidor.getText()));
        puntosYComas.setText(miComparador.puntosYComas());
        progresoComas.add(new JLabel(miComparador.puntosYComas()));
        intentosNumero.setText((contadorIntentos+=1)+"");
        if(pivoteNumeros != (Integer.parseInt(recibidor.getText()))) {
        	
        	progresoNumeros.add(new JLabel(recibidor.getText()));
        	
        }
        
    }

    /**
     * this method determines what will "reiniciarJuego" do when pressed
     * @param evt which represents the button press
     */
    private void ReiniciarJuegoActionPerformed(ActionEvent evt) {//GEN-FIRST:event_ReiniciarJuegoActionPerformed
        JOptionPane.showMessageDialog(null, miComparador.getNumeroObjetivo());
        dispose();
        main(null);
    }//GEN-LAST:event_ReiniciarJuegoActionPerformed
    
    /**
     * this method determines what will numeroDeCifras do when displayed and selected
     * @param evt which represents the activation of the list
     */
    private void numeroDeCifrasActionPerformed(ActionEvent evt) {//GEN-FIRST:event_numeroDeCifrasActionPerformed
       miComparador.setNumeroDeCifras(Integer.parseInt((String)numeroDeCifras.getSelectedItem()));
       miComparador.setNumeroObjetivo(miComparador.getElGenerador().generarNumero(miComparador.getNumeroDeCifras()));
       
    }
   /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
    
    //variables initialization
    /**
     * this button restart the program and dispose the old number
     */
    private JButton ReiniciarJuego;
    /**
     * shows the actual number of digits in the number
     */
    private JLabel etiquetaNumeroDeCifras;
    /**
     * this button starts the comparison of both of numbers
     */
    private JButton ingresarNumero;
    /**
     * this shows how many tries had the player made
     */
    private JPanel intentos;
    /**
     * shoes the number of times the user tried
     */
    private JLabel intentosNumero;
    /**
     * show the text "número de intentos"
     */
    private JLabel intentosTexto;
    /**
     * contains all of the 1o buttons that allow the player to mark visually the numbers that he think are
     * not in the final number
     */
    private JPanel marcadorNumeros;
    /**
     * allows to select how many digits will be
     */
    private JComboBox<String> numeroDeCifras;
    /**
     * contains the "reinicar juego" button and the "numeroDeCifras" JComboBox
     */
    private JPanel panelInferior;
    /**
     * shows the dots and commas the player have obtained
     */
    private JPanel panelPuntosYComas;
    /**
     * there is where the commas you have previously got are displayed
     */
    private JPanel progresoComas;
    /**
     * there is where the previous numbers you have entered are displayed
     */
    private JPanel progresoNumeros;
    /**
     * there is where the las dots and comma you've got are displayed
     */
    private JLabel puntosYComas;
    /**
     * there the user introduces his number
     */
    private JTextField recibidor;
    /**
     * this panel have the number receiver and the comparator button
     */
    private JPanel recibidorNumero;
    /**
     * this is an instance of Comparador, used to get the number generated and compare it with the users number
     */
    private Comparador miComparador;
    /**
     * the next ten buttons are displayed in the "marcadorNumeros" panel, and are intended to be used to mark
     * the numbers you think don't match
     */
	private BotonVerificador botonCero;
	private BotonVerificador botonCinco;
    private BotonVerificador botonCuatro;
    private BotonVerificador botonDos;
    private BotonVerificador botonNueve;
    private BotonVerificador botonOcho;
    private BotonVerificador botonSeis;
    private BotonVerificador botonSiete;
    private BotonVerificador botonTres;
    private	BotonVerificador botonUno;
    /**
     * this var stores the number of tries which the user had made
     */
    private int contadorIntentos;
    /**
     * this var stores the last number  which the user had ingressed, so if is the same than the last, will not
     * be displayed
     */
    private int pivoteNumeros;
}

