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
	public boolean esBonus() {
		return numero==rondaBonus || numero==rondaBonus+1;
	}
	public void sigRonda() {
		numero++;
	}
	
	public void procesoRonda(Jugador principal,Jugador rebote,Temporizador t,Scanner sc) {
		if(esBonus()) {
			System.out.println("RONDA BONUS!! (DOBLE PUNTUACION)\n");
		}
		Pregunta p=new Pregunta(numero);
		String r = null;
		System.out.println("Responde "+ principal.getNombre()+"\n");
		System.out.println(p.getPregunta()+"\n");
		t.reiniciar();
		t.iniciar();
		while(t.tiempoPasado()<=15 && r==null) {
		    if(sc.hasNextLine()) {
		    	  r=sc.nextLine();
		    	  t.parar();
		    }
		  
		    
		   
		}
		if(p.respuesta(r) && t.tiempoPasado()<=15){
		    System.out.println("CORRECTO \n");
		    principal.sumar(esBonus());
		}else {
			if(esBonus()) {
				System.out.println("REBOTE CON BONUS!!");
			}
			 System.out.println("INCORRECTO, HAY REBOTE\n");
			 System.out.println("Responde "+ rebote.getNombre()+"\n");
			 System.out.println(p.getPregunta()+"\n");
			 t.reiniciar();
			 t.iniciar();
			 r = null;
			 while(t.tiempoPasado()<=15 && r==null) {
				 if(sc.hasNextLine()) {
			    	  r=sc.nextLine();
			    	  t.parar();
			      }
				  
			}
			 if(p.respuesta(r) && t.tiempoPasado()<=15){
				    System.out.println("CORRECTO \n");
				    rebote.sumar(esBonus());
			  }else {
				  System.out.println("INCORRECTO");
				  System.out.println("La solucion correcta es: ");
				  System.out.println(p.getSolucion()+"\n");
			  }
		}
	}
}