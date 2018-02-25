

import org.jsoup.*;
import org.jsoup.helper.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

import java.io.*; // Only needed if scraping a local File.

public class Scraper {

	/***
	 * 
	 * Connects to a certain single page and takes information from it
	 * 
	 * I want to call this method several times with a different URL each time
	 *  - First link will be known, subsequent links can be found as a certain element on the page that will always be the same
	 * 
	 * Connect to current page, scrape all body text, scrape link to next chapter
	 * Create a class to pass both back together
	 * 
	 */
	
	public Scraper(String link) {

		Document doc = null;

		try {
			doc = Jsoup.connect(link).get();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		//Get title
		Elements title = doc.select(".entry-header > .entry-title");
		
		//Convert title to string, print to test
		String t = title.text();
		System.out.println("Got title: " + t + "\n \n");
		
		// Get chapter content, print to test
		Elements content = doc.select(".entry-content p").not("a[title=Last Chapter]").not("a[title=Next Chapter]");
		String cont = content.text();
		System.out.println(cont);
		
		// Get next chapter link
		Elements next = doc.select("#content > #nav-single > .nav-next a[href]");
		String nxt = next.attr("abs:href");
		System.out.println("\n \n" + nxt);
		
	}
}
	