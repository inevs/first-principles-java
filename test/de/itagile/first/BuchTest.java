package de.itagile.first;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BuchTest {

	@Test
	public void kannAusgeliehenUndZurueckGegebenWerden() throws Exception {
		Buch buch = new Buch();
		assertTrue(buch.istAusleihbar());
		buch.leiheAus();
		assertFalse(buch.istAusleihbar());
		buch.gibZurueck();
		assertTrue(buch.istAusleihbar());
	}
}
