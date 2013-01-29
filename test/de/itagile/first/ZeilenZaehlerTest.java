package de.itagile.first;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.FileOutputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

import org.junit.Test;

public class ZeilenZaehlerTest {

	@Test
	public void zaehltZeilen() throws Exception {
		URL website = new URL("http://agileinaflash.blogspot.com/feeds/posts/default");
	    ReadableByteChannel rbc = Channels.newChannel(website.openStream());
	    FileOutputStream fos = new FileOutputStream("rss.xml");
	    fos.getChannel().transferFrom(rbc, 0, 1 << 24);
	    fos.close();
	    
	    ZeilenZaehler zaehler = new ZeilenZaehler("rss.xml");
	    assertThat(zaehler.anzahlZeilen(), is(1));
	}
}
