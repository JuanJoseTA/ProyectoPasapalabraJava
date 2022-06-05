import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Partida {
    private List<Character> letras;
    private int turno;
    private final static String reset="\u001B[0m";
    private final static String blue="\033[34m";
    private final static String purple="\033[35m";
    private final static String cyan="\033[36m";
    private final static String yellow="\033[33m";
    private final static String black="\033[30m";

    public Partida() {
        letras= new ArrayList<>();
        turno=1;
    }

    public void getResultado(Jugador j1,Jugador j2) {
        if(j1.getPuntuacion()>j2.getPuntuacion()) {
            System.out.println(yellow+"HA GANADO "+ j1.getNombre().toUpperCase()+"!");
        }else if (j2.getPuntuacion()>j1.getPuntuacion()) {
            System.out.println(yellow+"HA GANADO "+ j2.getNombre().toUpperCase()+"!");
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

    public void jugar(Jugador j1,Jugador j2,Ronda r,Temporizador t,Scanner sc) throws UnsupportedEncodingException {
        int i=1;
        while(r.getNumero()<27) {
            System.out.println("\n======================================================================================\n");
            System.out.println(black+"\nRonda de la letra:"+letras.get(i).toString().toUpperCase()+reset);
            System.out.println(purple+"PUNTUACIONES"+reset);
            System.out.println(cyan+j1.getNombre()+reset+": "+j1.getPuntuacion()+purple+" puntos"+reset);
            System.out.println(blue+j2.getNombre()+reset+": "+j2.getPuntuacion()+purple+" puntos\n\n"+reset);
            if(turno==1) {
                r.procesoRonda(j1, j2, t,sc,cyan,blue);
                turno=2;
            }else {
                r.procesoRonda(j2, j1, t,sc,blue,cyan);
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
