import java.io.UnsupportedEncodingException;

import java.util.Scanner;

public class Main {
	private final static String cyan="\033[36m";
	private final static String yellow="\033[33m";
	private final static String reset="\u001B[0m";
	public static void main(String[] args) throws UnsupportedEncodingException {
    	String alias1;
    	String alias2;
    	Scanner teclado=new Scanner(System.in);
    	System.out.print(cyan+"\nNombre del jugador 1: "+reset);
    	alias1=teclado.nextLine();
    	System.out.print(yellow+"\nNombre del jugador 2: "+reset);
    	alias2=teclado.nextLine();
    	
    	Jugador j1= new Jugador(alias1);
    	Jugador j2=new Jugador(alias2);
    	Temporizador t=new Temporizador();
    	Ronda r=new Ronda();
    	Partida partida=new Partida();
    	
    	
    	partida.iniciaLetras();
    	partida.jugar(j1, j2,r, t,teclado);
    	
    	System.out.println(j1.getNombre()+" ha terminado con "+j1.getPuntuacion()+" puntos");
    	System.out.println(j2.getNombre()+" ha terminado con "+j2.getPuntuacion()+" puntos");
    	
    	partida.getResultado(j1, j2);
    	
    	
    	
	}
}
