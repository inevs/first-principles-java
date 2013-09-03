package de.itagile.first;

import java.util.HashMap;
import java.util.Map;

public class VorlagenVerwalter {
	private Map<String, String> vorlagen = new HashMap<>();

	public void definiere(String name, String template) {
		vorlagen.put(name, template);
	}

	public String fuelleAus(String templateName, Map<String, Object> werte) {
		String template = vorlagen.get(templateName);
		String result = template;
		for (String placeholder: werte.keySet()) {
			result = result.replace(String.format("{%s}", placeholder), werte.get(placeholder).toString());
		}
		return result;
	}

}
