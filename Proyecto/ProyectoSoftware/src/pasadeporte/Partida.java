package pasadeporte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Partida {
	private List<Character> letras;
	private int turno;
	
	
	public Partida() {
		letras= new ArrayList<>();
		turno=1;
	}
	
	public void getResultado(Jugador j1,Jugador j2) {
		if(j1.getPuntuacion()>j2.getPuntuacion()) {
			System.out.println("HA GANADO "+ j1.getNombre().toUpperCase()+"!");
		}else if (j2.getPuntuacion()>j1.getPuntuacion()) {
			System.out.println("HA GANADO "+ j2.getNombre().toUpperCase()+"!");
		}else {
			System.out.println("LA PARTIDA HA TERMINADO EN EMPATE");
		}
	}
	
	public void iniciaLetras() {
		char letra = (char) (96);
		for(int i=0;i<27;i++) {
			letras.add(i,letra);
			letra++;
		}
	}
	
	public void jugar(Jugador j1,Jugador j2,Ronda r,Temporizador t,Scanner sc) {
		int i=1;
		while(r.getNumero()<27) {
			
			System.out.println("Ronda de la letra "+letras.get(i));
			if(turno==1) {
				r.procesoRonda(j1, j2, t,sc);
				turno=2;
			}else {
				r.procesoRonda(j2, j1, t,sc);
				turno=1;
			}
			
		r.sigRonda();
		i++;
		}
	}

	public int getTurno() {
		// TODO Auto-generated method stub
		return turno;
	}

	public List<Character> getLetras() {
		// TODO Auto-generated method stub
		return letras;
	}
	


}
