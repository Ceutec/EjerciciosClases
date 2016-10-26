import static org.junit.Assert.*;

import org.junit.Test;

public class Evaluar {

	@Test
	public void constructorTest() {
		Vuelo vuelo = new Vuelo("Paris", 12);
	}
	
	@Test
	public void getDesinoTest() {
		Vuelo vuelo = new Vuelo("Paris", 12);
		assertEquals("", "Paris", vuelo.getDestino());
		
		Vuelo vuelo2 = new Vuelo("Buenos aires", 4);
		assertEquals("", "Buenos aires", vuelo2.getDestino());
	}
	
	@Test
	public void setDesinoTest() {
		Vuelo vuelo = new Vuelo("Paris", 12);
		vuelo.setDestino("Irak");
		assertEquals("", "Irak", vuelo.getDestino());
		
		Vuelo vuelo2 = new Vuelo("Buenos aires", 4);
		vuelo2.setDestino("Iran");
		assertEquals("", "Iran", vuelo2.getDestino());
	}
	
	@Test
	public void getHoraTest() {
		Vuelo vuelo = new Vuelo("Paris", 12);
		assertEquals("", 12, vuelo.getHora());
		
		Vuelo vuelo2 = new Vuelo("Buenos aires", 4);
		assertEquals("", 4, vuelo2.getHora());
	}
	
	@Test
	public void setHoraTest() {
		Vuelo vuelo = new Vuelo("Paris", 12);
		vuelo.setHora(666);
		assertEquals("", 666, vuelo.getHora());
		
		Vuelo vuelo2 = new Vuelo("Buenos aires", 4);
		vuelo2.setHora(777);
		assertEquals("", 777, vuelo2.getHora());
	}

	@Test
	public void atrasarTest() {
		Vuelo vuelo = new Vuelo("Paris", 12);
		vuelo.atrasar(2);
		assertEquals("", 14, vuelo.getHora());
		
		Vuelo vuelo2 = new Vuelo("Buenos aires", 4);
		vuelo2.atrasar(5);
		assertEquals("", 9, vuelo2.getHora());
	}
}
