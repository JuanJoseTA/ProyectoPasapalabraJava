package pasadeporte;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JugadorTest {
	
	private static Jugador jug;
	private static String n = "exito";
	private static Boolean a = true;
	private static Boolean b = false;
	private static int num;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		jug = new Jugador(n);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
	}

	@BeforeEach
	void setUp() throws Exception {
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testJugador() {
		Assertions.assertNotNull(jug.getNombre());
		Assertions.assertNotNull(jug.getPuntuacion());
	}

	@Test
	void testGetNombre() {
		Assertions.assertTrue(jug.getNombre()==n);
	}

	@Test
	void testGetPuntuacion() {
		Assertions.assertFalse(jug.getPuntuacion()<0 || jug.getPuntuacion()>28);
	}

	@Test
	void testSumar() {
		
		num=jug.getPuntuacion();
		jug.sumar(a);
		Assertions.assertTrue((jug.getPuntuacion()-2)==num);
		num=jug.getPuntuacion();
		jug.sumar(b);
		Assertions.assertTrue((jug.getPuntuacion()-1)==num);	
	}
}
