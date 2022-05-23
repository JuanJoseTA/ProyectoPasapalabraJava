package pasadeporte;

public class Partida {
    private ArrayList letras = new ArrayList(25);
	private int turno;
	
	
	public Partida() {
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
	
	public void jugar(Jugador j1,Jugador j2,Ronda r) {
		while(r.getNumero()<letras.size()) {
		}
	}
	


}
