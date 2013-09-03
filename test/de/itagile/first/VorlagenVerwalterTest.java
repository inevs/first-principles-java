package de.itagile.first;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class VorlagenVerwalterTest {

	@Test
	public void ersetztPlatzhalterMitRichtigenWerten() throws Exception {
		VorlagenVerwalter vorlagen = new VorlagenVerwalter();
		vorlagen.definiere("foo", "foo {bar}");
		Map<String, Object> werte = new HashMap<>();
		werte.put("bar", "baz");
		String ergebnis = vorlagen.fuelleAus("foo", werte);
		assertThat(ergebnis, is("foo baz"));
	}
}
