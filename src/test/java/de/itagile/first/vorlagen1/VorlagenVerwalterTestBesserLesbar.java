package de.itagile.first.vorlagen1;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class VorlagenVerwalterTestBesserLesbar {

	@Test
	public void ersetztPlatzhalterMitRichtigenWerten() throws Exception {
		VorlagenVerwalter vorlagen = new VorlagenVerwalter();
		vorlagen.definiere("foo", "foo {bar}");
		String ergebnis = vorlagen.fuelleAus("foo", werte("bar", "baz"));
		assertThat(ergebnis, is("foo baz"));
	}

	private Map<String, Object> werte(String key, String value) {
		Map<String, Object> werte = new HashMap<>();
		werte.put(key, value);
		return werte;
	}
}
