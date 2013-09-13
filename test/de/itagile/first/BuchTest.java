package de.itagile.first;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BuchTest {

	@Test
	public void istInitialAusleihbar() throws Exception {
		Buch buch = new Buch();
		assertTrue(buch.istAusleihbar());
	}

}
