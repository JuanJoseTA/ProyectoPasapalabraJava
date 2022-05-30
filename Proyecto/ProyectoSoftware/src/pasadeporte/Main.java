package pasadeporte;

public class Main {
    public static void main(String[] args) {
    	String alias1;
    	String alias2;
    	Scanner teclado=new Scanner(System.in);
    	System.out.print("Nombre del jugador 1: ");
    	alias1=teclado.nextLine();
    	System.out.print("\nNombre del jugador 2: ");
    	alias2=teclado.nextLine();
    	
    	Jugador j1= new Jugador(alias1);
    	Jugador j2=new Jugador(alias2);
    	Temporizador t=new Temporizador();
    	Ronda r=new Ronda();
    	Partida partida=new Partida();
    	
    	
    	partida.iniciaLetras();
    	partida.jugar(j1, j2,r, t);
    	
    	partida.getResultado(j1, j2);
    	
    	
    	
	}
}
