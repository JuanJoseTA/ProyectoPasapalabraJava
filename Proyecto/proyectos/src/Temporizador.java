public class Temporizador {
    private boolean andando;
    private long tiempoInicio;
    private long tiempoPasado;


    // Crea un temporizador
    public Temporizador() {
        this.reiniciar();
    }

    // Lo pone a cero
    public void reiniciar() {
        andando = false;
        tiempoPasado = 0;
    }

    // Lo pone a andar
    public void iniciar() {
        if(!andando) {
            andando = true;
            tiempoInicio = System.nanoTime();
        }
    }

    // Detiene temporalmente el temporizador
    public void parar() {
        if(!andando)
            throw new RuntimeException("Temporizador ya parado");
        else {
            tiempoPasado += System.nanoTime()-tiempoInicio;
            andando = false;
        }
    }

    // Devuelve el tiempo (en nanosegundos) que el temporizador ha estado andando
    public long tiempoPasado(){
        if(andando)
            return (long) ((tiempoPasado + System.nanoTime() - tiempoInicio)/Math.pow(10, 9));
        else
            return (long) (tiempoPasado/Math.pow(10,9));
    }

    public boolean getAndando() {
        // TODO Auto-generated method stub
        return andando;
    }


}
