import org.jsoup.*;
import org.jsoup.helper.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;
import java.io.*;

public class main {

	public static void main(String[] args) throws IOException  {
		System.out.println("Testing, testing, 1, 2, 3...");
		
		ContentAndLink cnl;
		Scraper scr = new Scraper();
		
		File book = new File("Worm.html");

		
		
		cnl = scr.Scraper("https://parahumans.wordpress.com/2011/06/14/gestation-1-2/");
		
		String title = cnl.getTitle();
		Elements content = cnl.getContent();
		String next = cnl.getLink();
		
		// Write title to file
			BufferedWriter writer = new BufferedWriter(new FileWriter("Worm.html"));
			String headerTitle = "<h2>" + title + "</h2>";
			writer.append(headerTitle);
			writer.append("\n\n");
			writer.append(content.outerHtml());
			
		    writer.close();
	     
		
		//System.out.println("Title: " + title + "\n\nContent:\n" + content + "\n\nLink: " + next);
		
		/*** Create a file and put something in it
		 * 
		 * final File f = new File("filename.html");
         * FileUtils.writeStringToFile(f, doc.outerHtml(), "UTF-8");
		 * 
		 */
		
	}

}
