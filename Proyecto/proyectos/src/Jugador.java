public class Jugador {

    private String nombre;
    private int puntuacion;

    public Jugador(String n) {
        nombre = n;
        puntuacion = 0;

    }

    //EL METODO INTRODUCIR NOMBRE NO ES NECESARIO TENIENDO EL CONSTRUCTOR, PUESTO QUE EN UNA PARTIDA NO SE CAMBIA EL NOMBRE

    public String getNombre() {
        return nombre;

    }

    public int getPuntuacion() {
        return puntuacion;

    }

    public void sumar(boolean bonus) {
        if(bonus) {
            puntuacion++;

        }
        puntuacion++;

    }
}
