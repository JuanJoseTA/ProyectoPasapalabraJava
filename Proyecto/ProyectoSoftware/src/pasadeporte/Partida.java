package pasadeporte;

import java.util.ArrayList;

public class Partida {
    private ArrayList letras;
	private int turno;
	
	
	public Partida() {
		letras= new ArrayList(26);
		turno=1;
	}
	
	private void getResultado(Jugador j1,Jugador j2) {
		if(j1.getPuntuacion()>j2.getPuntuacion()) {
			System.out.println("HA GANADO "+ j1.getNombre().toUpperCase()+"!");
		}else if (j2.getPuntuacion()>j1.getPuntuacion()) {
			System.out.println("HA GANADO "+ j2.getNombre().toUpperCase()+"!");
		}else {
			System.out.println("EMPATE");
		}
	}
	
	public void iniciaLetras() {
		char letra = (char) (96);
		for(int i=0;i<letras.size();i++) {
			letras.add(i,letra);
			letra++;
		}
	}
	
	public void jugar(Jugador j1,Jugador j2,Ronda r,Temporizador t) {
		int i=1;
		while(r.getNumero()<=letras.size()) {
			System.out.println("Ronda de la letra "+letras.get(i));
			if(turno==1) {
				r.procesoRonda(j1, j2, t);
				turno=2;
			}else {
				r.procesoRonda(j2, j1, t);
				turno=1;
			}
			
		r.sigRonda();
		i++;
		}
	}
	


}
