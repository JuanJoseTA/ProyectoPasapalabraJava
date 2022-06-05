import java.io.UnsupportedEncodingException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.io.*;
import java.net.*;
import java.util.Random;
import java.util.Scanner;

public class Ronda {
    private final static String black="\033[30m";
    private final static String red="\033[31m";
    private final static String green="\033[32m";
    private final static String yellow="\033[33m";
    private final static String blue="\033[34m";
    private final static String purple="\033[35m";
    private final static String cyan="\033[36m";
    private final static String white="\033[37m";
    private final static String reset="\u001B[0m";
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

    public void procesoRonda(Jugador principal,Jugador rebote,Temporizador t,Scanner sc,String colorPrincipal,String colorRebote) throws UnsupportedEncodingException {
        if(esBonus()) {
            System.out.println(blue+"RONDA BONUS!! (DOBLE PUNTUACION)\n"+reset);
        }
        Pregunta p=new Pregunta(numero);
        String r = null;
        System.out.println(colorPrincipal+"Responde "+ principal.getNombre()+reset+"->");
        System.out.print(black+p.getPregunta()+"\n"+reset);
        t.reiniciar();
        t.iniciar();
        while(t.tiempoPasado()<=15 && r==null) {
            if(sc.hasNextLine()) {
                r=sc.nextLine();
                t.parar();
            }



        }
        if(p.respuesta(r) && t.tiempoPasado()<=15){
            System.out.println();
            System.out.println("\n"+green+"CORRECTO"+reset);
            principal.sumar(esBonus());
        }else {

            if(t.tiempoPasado()>=15) {
                System.out.println(red+"\nEL TIEMPO SE HA ACABADO, HAY REBOTE\n"+reset);
            }else if(!p.respuesta((r))){
                System.out.println(red+"\nINCORRECTO, HAY REBOTE\n"+reset);
            }
            if(esBonus()) {
                System.out.println(blue+"\nREBOTE CON BONUS!!\n"+reset);
            }

            System.out.println(colorRebote+"Responde "+rebote.getNombre()+reset);
            System.out.println(black+p.getPregunta()+"\n"+reset);
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
                System.out.println(green+"\nCORRECTO"+reset);
                rebote.sumar(esBonus());
            }else {
                System.out.println(red+"\nINCORRECTO\n"+reset);
                System.out.println("La solucion correcta es: "+p.getSolucion()+"\n");

            }
        }
    }
}