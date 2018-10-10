package interfaz;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.*;

/**
 * Creates a button with the capability of change the color when pressed
 * @author Cristian Guatuzmal
 *
 */
public class BotonVerificador extends JButton {
	
	/**
	 * checks if the button is red
	 */
	private boolean botonOprimido;
	/**
	 * stores that the button will have
	 */
	private int numeroDeBoton;
	
	/**
	 * this constructor initializes the initial state of the button, which is grey and with a number between 0 and 9
	 * @param numeroDeBoton number that will have in it
	 */
	public BotonVerificador(int numeroDeBoton) {
		
		this.numeroDeBoton = numeroDeBoton;
		botonOprimido = false;
		setBackground(new Color(204, 204, 204));
	    setText(numeroDeBoton+"");
	    addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent evt) {
	    		botonVerificadorActionPerformed(evt);
	    	}
	    });
	}
	
	/**
	 * method that makes the button changes its color when pressed
	 * @param evt represents the button being pressed
	 */
	private void botonVerificadorActionPerformed(ActionEvent evt) {
		if(botonOprimido){
			setBackground(new Color(204,204,204));
	        botonOprimido = false;
	    }
	    else{
	        setBackground(Color.RED);
	        botonOprimido = true;
        }
	}
}
