package de.itagile.first;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ZeilenZaehler {

	private String fileName;

	public ZeilenZaehler(String fileName) {
		this.fileName = fileName;
	}

	public Integer anzahlZeilen() throws IOException {
		return Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8).size();
	}

}
