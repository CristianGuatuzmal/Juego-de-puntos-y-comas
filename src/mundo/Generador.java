package mundo;

/**
 * This import is used to grant access to exponential operations 
 */
import java.lang.Math;

/**
 * 
 * The task if this class is to generate the number which the player will have to reach this number
 * has to be composed by different numbers in each position. 
 * 
 * @author Cristian Guatuzmal
 *
 */
public class Generador {
	
	/**
	 * This variable stores the number which the player will have to reach
	 */
	private int numeroObjetivo;
	
    /**
     * This class has an implicit constructor
     */
    
    /**
     * This is the getter for {@link #numeroObjetivo}
     * @return {@link #numeroObjetivo}
     */
	public int getNumeroObjetivo() {
		return numeroObjetivo;
	}
	
	/**
	 * This method generates the number that will be given by the class and which the player 
	 * has to reach
	 * @param numeroDeCifras is 10 exposed to the number of digits, is always a exponent of 10. this
	 * value is obtained from {@link #generarNumeroParaGenerador(int)}
	 * @return the final number, which matches all the conditions.
	 */
	public int generarNumero(int numeroDeCifras) {
		
		boolean checker = false;
		int result=0;
		
		while(checker==false) {
			
		result =(int) (Math.random()*generarNumeroParaGenerador(numeroDeCifras));
			
		if(revisarNumero(result, numeroDeCifras)==true) {
			checker=true;
		}
						
		}
		
	return result;
	}
	
	/**
	 * This class verifies if the number has different numbers in all its positions, if affirmative,
	 * will give true, else, it will give false
	 * @param numeroARevisar is the number that will be checked
	 * @param numeroDeCifras is the number of digits the number will have
	 * @return true if the number matches the conditions and false if not
	 */
	public boolean revisarNumero(int numeroARevisar, int numeroDeCifras) {
		
		String cadenaRevisable = numeroARevisar+"";
		boolean resultado = false;
		
		if(cadenaRevisable.length()==numeroDeCifras) {
			for (int i =0; i<cadenaRevisable.length(); i++) {
				for(int j=0;j<cadenaRevisable.length(); j++) {
					if(i!=j) {
                    if(cadenaRevisable.charAt(i)==cadenaRevisable.charAt(j)) {
                    	resultado = false;
                    	return resultado;
					}
                    else resultado = true;
					}
				}
			}
		}
		
		return resultado;
		
	}
	
	/**
	 * This method generates the 10 potentia that will multiply in {@link #generarNumero(int)} to make the
	 * decimal random match the number of digits
	 * @param numeroDeCifras is the number of zeros necessary to obtain the number to multiply
	 * @return a 10 potentia who will mulltiply de zero base decimal of math random
	 */
	public int generarNumeroParaGenerador(int numeroDeCifras){
        
		int result = 10;

        result = (int)Math.pow(result, numeroDeCifras);
           
        return result;
            
	}
}
