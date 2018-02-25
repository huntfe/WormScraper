import org.jsoup.*;
import org.jsoup.helper.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

public class main {

	public static void main(String[] args) {
		System.out.println("Testing, testing, 1, 2, 3...");
		
		ContentAndLink cnl;
		
		Scraper scr = new Scraper();
		
		cnl = scr.Scraper("https://parahumans.wordpress.com/2011/06/11/1-1/");
		
		String title = cnl.getTitle();
		Elements content = cnl.getContent();
		String next = cnl.getLink();
		
		System.out.println("Title: " + title + "\n\nContent:\n" + content + "\n\nLink: " + next);
	}

}
