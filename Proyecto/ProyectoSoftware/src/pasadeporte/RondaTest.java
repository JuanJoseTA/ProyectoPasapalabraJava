package pasadeporte;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RondaTest {
	
	private static Ronda r;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		assertNull(r.getNumero(),"exito");
		assertNull(r.getRondaBonus(),"exito");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		r=new Ronda();
	}

	@AfterEach
	void tearDown() throws Exception {
		r=null;
	}

	@Test
	void testGenerarRondaBonus() {
		r.generarRondaBonus();
		assertAll(() -> assertNotNull(r.getRondaBonus(),"Variable ronda bonus generada"),() -> assertTrue(r.getRondaBonus()>0 && r.getRondaBonus()<27,"rondaBonus valida"));
	}

	@Test
	void testGetRondaBonus() {
		assertTrue(r.getRondaBonus()>0 && r.getRondaBonus()<27,"rondaBonus valida");
	}

	@Test
	void testProcesoRonda() {
		fail("Not yet implemented");
	}
	
	@Test 
	void testGetNumero() {
		assertTrue(r.getNumero()>0 && r.getNumero()<27,"Número de ronda valido");
	}
	@Test
	void testSigRonda() {
		int t=r.getNumero();
		r.sigRonda();
		assertTrue(t+1==r.getNumero());
	}
	@Test
	void testEsBonus() {
		while(r.getNumero()!=r.getRondaBonus()) {
			r.sigRonda();
		}
		assertTrue(r.esBonus(),"Comprobación de encontrarse en rondaBonus correcta parte 1");
		r.sigRonda();
		assertTrue(r.esBonus(),"Comprobación de encontrarse en rondaBonus correcta parte 2");
		
	}
	
	

}
