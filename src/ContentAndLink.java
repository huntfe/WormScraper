import org.jsoup.*;
import org.jsoup.nodes.*;

public class ContentAndLink {
	private final String title; 
	private final Element content;
	private final String link;
	
	
	public ContentAndLink(String title, Element content, String link){
		this.title = title;
		this.content = content;
		this.link = link;
	}
	
	public Element getContent(){
		return this.content;
	}
	
	public String getLink(){
		return this.link;
	}
	
	public String getTitle(){
		return this.title;
	}
}