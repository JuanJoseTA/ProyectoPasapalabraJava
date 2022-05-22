import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupter.api.Test;

class TestPregunta{
    private final Pregunta pregunta = new Pregunta();
    @Test void respuestaIncorrecta1(){
        assertFalse(pregunta.responder(pregunta.getSolucion()+" "));
    }

    @Test void respuestaIncorrecta2(){
        assertFalse(pregunta.responder(""));
    }

    @Test void respuestaCorrecta1(){
        assertTrue(pregunta.responder(pregunta.getSolucion()));
    }

    @Test void respuestaCorrecta2(){
        assertTrue(pregunta.responder(pregunta.getSolucion().toUpperCase()));
    }
}