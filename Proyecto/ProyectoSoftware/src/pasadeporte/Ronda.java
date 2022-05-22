package pasadeporte;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ronda {
	private int rondaBonus;
	private int numero;
	private Random r = new Random();
	
	public Ronda() {
		generarRondaBonus();
		numero=1;
	}
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
		Pregunta p=new Pregunta(numero);
		String r = null;
		Temporizador temp= new Temporizador();
		p.preguntar();
		temp.iniciar();
		while(temp.tiempoPasado()<=15 && r==null) {
		try (Scanner sc = new Scanner(System.in)) {
			 r=sc.nextLine();
		}catch(InputMismatchException i) {
			System.err.println(i.getMessage());
		}
		temp.parar();
		if(!p.respuesta(r)){
			System.out.println("INCORRECTO \n");
			System.out.println("REBOTE \n");
			temp.reiniciar();
			temp.iniciar();
			p.preguntar();
			
			
		}
	}
}
}