package de.itagile.first;

public class Buch {

	private boolean ausleihbar = true;

	public void leiheAus() {
		ausleihbar = false;
	}

	public boolean istAusleihbar() {
		return ausleihbar;
	}

	public void gibZurueck() {
		ausleihbar = true;
	}

}
