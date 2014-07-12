package de.itagile.first;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Date;

import org.junit.Test;

public class ObjektMitDatumTest {

    private ObjektMitDatum objekt = new ObjektMitDatum();

    @Test
	public void merktSichWannEsErstelltWurde() throws Exception {
		assertThat(objekt.erstellungsDatum(), is(new Date(System.currentTimeMillis())));
	}
    
    @Test
	public void merktSichWannEsErstelltWurde2() throws Exception {
		System.out.println(objekt.erstellungsDatum());
	}
	
}
