package de.itagile.first.vorlagen3;

import java.util.HashMap;
import java.util.Map;

public class VorlagenVerwalterMitRenderer {

	private VorlagenRenderer renderer;
	private Map<String, String> vorlagen = new HashMap<String, String>();

	public void setRenderer(VorlagenRenderer renderer) {
		this.renderer = renderer;
	}

	public void definiere(String name, String inhalt) {
		vorlagen.put(name, inhalt);
	}

	public String fuelleAus(String name, Map<String, String> werte) {
		return renderer.fuelleAus(vorlagen.get(name), werte);
	}

}
