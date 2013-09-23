package de.itagile.first.vorlagen2;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class VorlageTestFunktionalDekomponiert {

	@Test
	public void ersetztPlatzhalterMitRichtigenWerten() throws Exception {
		Vorlage vorlage = new Vorlage("foo {bar}");
		String ergebnis = vorlage.fuelleAus(werte("bar", "baz"));
		assertThat(ergebnis, is("foo baz"));
	}

	private Map<String, Object> werte(String key, String value) {
		Map<String, Object> werte = new HashMap<>();
		werte.put(key, value);
		return werte;
	}
}
