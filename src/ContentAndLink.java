import org.jsoup.*;
import org.jsoup.helper.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

public class ContentAndLink {
	private final String title; 
	private final Elements content;
	private final String link;
	
	
	public ContentAndLink(String title, Elements content, String link){
		this.title = title;
		this.content = content;
		this.link = link;
	}
	
	public Elements getContent(){
		return this.content;
	}
	
	public String getLink(){
		return this.link;
	}
	
	public String getTitle(){
		return this.title;
	}
}