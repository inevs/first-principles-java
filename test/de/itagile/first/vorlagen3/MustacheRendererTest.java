package de.itagile.first.vorlagen3;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MustacheRendererTest {

	@Test
	public void ersetztPlatzhalterMitRichtigenWerten() throws Exception {
		VorlagenRenderer mustache = new MustacheRenderer();
		String ergebnis = mustache.fuelleAus("foo {bar}", werte("bar", "baz"));
		assertThat(ergebnis, is("foo baz"));
	}

	private Map<String, String> werte(String key, String value) {
		Map<String, String> werte = new HashMap<>();
		werte.put(key, value);
		return werte;
	}
}
