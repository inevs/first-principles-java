package de.itagile.first.vorlagen2;

import java.util.HashMap;
import java.util.Map;

// verwalter.definiere("foo", new Vorlage("foo {bar}"));
// verwalter.get("foo").fuelleAus({"bar": "baz"});

public class VorlagenVerwalter2 {
	private Map<String, Vorlage> vorlagen = new HashMap<>();

	public void definiere(String name, Vorlage template) {
		vorlagen.put(name, template);
	}

	public Vorlage get(String templateName) {
		return vorlagen.get(templateName);
	}

}
