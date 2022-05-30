package pasadeporte;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PartidaTest {
	private static Partida p;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		assertNull(p.getTurno(),"exito");
		assertNull(p.getLetras(),"exito");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		p = new Partida();
	}

	@AfterEach
	void tearDown() throws Exception {
		p = null;
	}

	@Test
	void testPartida() {
		assertNotNull(p.getTurno(),"exito");
		assertNotNull(p.getLetras(),"exito");
	}

	@Test
	void testIniciaLetras() {
		ArrayList letras = p.getLetras();
		boolean ok=true;
		
		for(int i=0;i<letras.size()&&!ok;i++) {
			if(letras.get(i)==null) {
				ok=false;
			}
		}
		
		assertTrue(ok,"exito");
	}

	@Test
	void testJugar() {
		boolean ok=true;
		Ronda r;
		
		if(r.getNumero()<=p.getLetras().size()) {
			ok=false;
		}
		
		assertTrue(ok,"exito");
	}

}
