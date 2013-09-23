package de.itagile.first.vorlagen3;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class VorlagenVerwalterTestKollaborativDekomponiert {

	@Test
	public void benutztRenderer() throws Exception {
		VorlagenRenderer stubRenderer = mock(VorlagenRenderer.class);
		
		VorlagenVerwalterMitRenderer verwalter = new VorlagenVerwalterMitRenderer();
		verwalter.setRenderer(stubRenderer);
		
		doReturn("result").when(stubRenderer).fuelleAus(anyString(), any(Map.class));
		
		verwalter.definiere("name", "inhalt");
		assertThat(verwalter.fuelleAus("name", new HashMap<String, String>()), is("result"));
	}
}
