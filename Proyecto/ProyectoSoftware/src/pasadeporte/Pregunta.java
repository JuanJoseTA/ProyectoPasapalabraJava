package pasadeporte;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Random;

public class Pregunta {
	
	private String solucion;
	private String pregunta;
	
	public Pregunta(int ronda) {
		char letra = (char) (ronda + 96);
		File archivo = null;
		FileReader fr = null;
		FileReader gr = null;
	    BufferedReader br = null;
	    BufferedReader br2 = null;
	    int numPreg = 0;
	    int numPregAl;
	    Random r = new Random();
	    try {
	         // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine()).
	         archivo = new File (letra+".txt");
	         fr = new FileReader (archivo);
			 gr = new FileReader (archivo);
	         br = new BufferedReader(fr);
	         br2 = new BufferedReader(gr);
			 numPreg = (int) br.lines().count();
	         numPregAl = r.nextInt(numPreg);
	         int i = 0;
	         while(i != numPregAl){
				 i++;
				 br2.readLine();
			 }
			 String cadena = br2.readLine();
			 String delimitadores = "[;]";
			 String[] palabrasSeparadas = cadena.split(delimitadores);
			 pregunta = palabrasSeparadas[0];
			 solucion = palabrasSeparadas[1];
		}catch(Exception e){
	         e.printStackTrace();
	      }
	}
	
	public String getPregunta() {
		return pregunta;
	}
	
	public String getSolucion() {
		return solucion;
	}
	
	public boolean respuesta(String respuesta) {
		String r = respuesta.toUpperCase();
		String s = solucion.toUpperCase();
		return s.equals(r);
	}
}
