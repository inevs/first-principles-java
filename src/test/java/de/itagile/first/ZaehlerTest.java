package de.itagile.first;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ZaehlerTest {

	@Test
	public void istInitial0() throws Exception {
		assertThat(Zaehler.stand(), is(0));
	}
	
	@Test
	public void kannErhoehtWerden() throws Exception {
		Zaehler.erhoehe();
		assertThat(Zaehler.stand(), is(1));
	}

	@Test
	public void kannMehrmalsErhoehtWerden() throws Exception {
		Zaehler.erhoehe();
		assertThat(Zaehler.stand(), is(2));
	}
}
