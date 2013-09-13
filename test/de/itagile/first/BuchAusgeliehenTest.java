package de.itagile.first;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class BuchAusgeliehenTest {

	private Buch buch = new Buch();

	@Before
	public void leiheBuchAus() {
		buch.leiheAus();
	}
	
	@Test
	public void istNichtNochmalsAusleihbar() throws Exception {
		assertFalse(buch.istAusleihbar());
	}

	@Test
	public void istNachRueckgabeWiederAusleihbar() throws Exception {
		buch.gibZurueck();
		assertTrue(buch.istAusleihbar());
	}

}
