package pasadeporte;

import java.util.Random;

public class Ronda {
	private int rondaBonus;
	private int numero;
	private Random r = new Random();
	
	public void generarRondaBonus() {
		rondaBonus=r.nextInt(27);
	}
	
	public int getRondaBonus() {
		return rondaBonus;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void procesoRonda() {
		
	}

}
