package de.itagile.first.vorlagen3;

import java.util.Map;

public class MustacheRenderer implements VorlagenRenderer {

	@Override
	public String fuelleAus(String vorlage, Map<String, String> werte) {
		String result = vorlage;
		for (String placeholder: werte.keySet()) {
			result = result.replace(String.format("{%s}", placeholder), werte.get(placeholder).toString());
		}
		return result;
	}

}
