package de.itagile.first.vorlagen2;

import java.util.Map;

public class Vorlage {

	private String inhalt;

	public Vorlage(String inhalt) {
		this.inhalt = inhalt;
	}

	public String fuelleAus(Map<String, Object> werte) {
		String result = inhalt;
		for (String placeholder: werte.keySet()) {
			result = result.replace(String.format("{%s}", placeholder), werte.get(placeholder).toString());
		}
		return result;
	}

}
