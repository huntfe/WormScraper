import org.jsoup.*;
import org.jsoup.helper.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;
import java.io.*;

public class main {

	public static void main(String[] args) throws IOException  {
		
		ContentAndLink cnl;
		Scraper scr = new Scraper();
		
		File book = new File("Worm.html");
		File currChap = new File("Curr.html");

		String link = "https://parahumans.wordpress.com/2011/12/27/tangle-6-5/";
		
		// Time the program
		final long startTime = System.currentTimeMillis();
		
		cnl = scr.Scraper(link);
		
		String title = cnl.getTitle();
		Elements content = cnl.getContent();
		String next = cnl.getLink();
		
		// Write title to file
		BufferedWriter writer = new BufferedWriter(new FileWriter(currChap));
		String headerTitle = "<h2>" + title + "</h2>";
		writer.append(headerTitle);
		writer.append("\n\n");
		writer.append(content.outerHtml());
		
		writer.close();
	     
		/*
		 * Remove the last and next text from each chapter
		 */
		
		// All the important information
		String outputFileName = "Temp.html";
		String lineToRemove = "<p><a title=\"Last Chapter\" href=";
		String line2 = "<p style=\"text-align:right;\"><a title=\"Next Chapter";
		// The traps any possible read/write exceptions which might occur
		try {
		    File outputFile = new File(outputFileName);
		    // Open the reader/writer, this ensure that's encapsulated
		    // in a try-with-resource block, automatically closing
		    // the resources regardless of how the block exists
		    try (BufferedReader reader = new BufferedReader(new FileReader(currChap));
		             BufferedWriter correctionwriter = new BufferedWriter(new FileWriter(outputFile))) {
		        // Read each line from the reader and compare it with
		        // with the line to remove and write if required
		        String line = null;
		        while ((line = reader.readLine()) != null) {
		            if (line.contains(lineToRemove) || line.contains(line2)) { // If it's not the line to remove
		            	System.out.println("Removing: " + line);
		            }else{
		            	correctionwriter.write(line);
		            }
	                correctionwriter.newLine();
		        }
		        reader.close();
		        correctionwriter.close();
		    }
		    
		    // Append the corrected file to the overall book
		    BufferedWriter appendw = new BufferedWriter(new FileWriter(book));
		    BufferedReader appendr = new BufferedReader(new FileReader(outputFile));
		    String str;
	        while ((str = appendr.readLine()) != null) {
	            appendw.write(str);
	        }
	        appendr.close();
	        appendw.close();
		    
		} catch (IOException ex) {
		    // Handle any exceptions
		    ex.printStackTrace();
		}
		
		
		/*
		 * End of removing text
		 */
		
		System.out.println("Title: " + title + "\n\nLink: " + next);
		
		// Time the execution
		final long endTime = System.currentTimeMillis();

		System.out.println("Total execution time: " + (endTime - startTime) );
		
	}
}
