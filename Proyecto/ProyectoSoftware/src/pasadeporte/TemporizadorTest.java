package pasadeporte;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TemporizadorTest {
	
	Temporizador t=new Temporizador();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
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
	void testTemporizador() {
		
		 assertNotNull(t.getAndando(),"Inicializado");
		 assertNotNull(t.tiempoPasado(),"Inicializado");
	}

	@Test
	void testReiniciar() {
		 assertTrue(t.getAndando()==false);
		 assertTrue(t.tiempoPasado()==0);
	}

	@Test
	void testIniciar() {
		assertTrue(t.getAndando()==true);
		assertTrue(t.tiempoPasado()>0);
	}

	@Test
	void testParar() {
		 assertTrue(t.getAndando()==false);
		 assertTrue(t.tiempoPasado()>0);
	}

	@Test
	void testTiempoPasado() {
		assertTrue(t.tiempoPasado()>0);
	}

}
