package html;

public class Node {

	private String tag;

	private String text;
	
	private Node firstChild;
	
	private Node nextSibling;
	
	private Node lastChild;
	
	public Node(String tag1, String text) {
		tag = tag1;
		this.text = text;
	}

	public void addChild(Node child) {
	
		if(firstChild == null) {
			firstChild = child;
			lastChild = child;
		}else{
			lastChild.nextSibling = child;
			lastChild = child;
		}
			
	}
	
	public void removeChild(Node child) {
		
		if(firstChild == child) {
			
			firstChild = firstChild.nextSibling;
			
		}
		
		Node next = firstChild;
		
		while(next.nextSibling != null) {
			
			if(next.nextSibling == child)	
				next.nextSibling = next.nextSibling.nextSibling;
			
			next = next.nextSibling;
				
		}
		
		
	}
	
	public String toString() {
		
		if(text != null) {
			return text;
		}
		
		String result = "<" + tag + ">";
		
		Node next = firstChild;
		while(next != null) {
			
			result += next.toString();
			next = next.nextSibling;
		}
		result += "</" + tag + ">";
		return result;
				
	}
	
}
