package pasadeporte;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PreguntaTest {

	private static Pregunta preg;
	private static Random r;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		assertNull(preg.getPregunta(), "exito");
		assertNull(preg.getSolucion(), "exito");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		preg = new Pregunta(r.nextInt(26));
	}

	@AfterEach
	void tearDown() throws Exception {
		preg = null;
	}

	@Test
	void testPregunta() {
		fail("Not yet implemented");
	}

	@Test
	void testGetPregunta() {
		fail("Not yet implemented");
	}

	@Test
	void testGetSolucion() {
		fail("Not yet implemented");
	}

	@Test
	void testRespuesta() {
		assertTrue(preg.respuesta(preg.getSolucion()), "Respuesta solución correcta");
		assertFalse(preg.respuesta(" "), "Respuesta vacía correcta");
	}

}
