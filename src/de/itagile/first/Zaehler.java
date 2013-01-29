package de.itagile.first;

public class Zaehler {

	private static int stand = 0;

	public static int stand() {
		return stand;
	}

	public static void erhoehe() {
		stand++;
	}

}
