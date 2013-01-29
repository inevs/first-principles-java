package de.itagile.first;

import java.util.Date;

public class ObjektMitDatum {
	
	private Date erstellungsDatum = new Date(System.currentTimeMillis());

	public Date erstellungsDatum() {
		return erstellungsDatum;
	}

}
