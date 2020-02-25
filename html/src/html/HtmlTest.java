package html;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sun.org.apache.bcel.internal.classfile.Node;

class HtmlTest {

	@Test
	void test() {

		Node html = new Node("html", null);
		
		Node head = new Node("head", null);
		html.addChild(head);
		Node title = new Node("title", null);
		head.addChild(title);
		Node titleText = new Node(null, "JLearner");
		title.addChild(titleText);
		
		Node body = new Node("body", null);
		html.addChild(body);
		Node h1 = new Node("h1", null);
		body.addChild(h1);		
		Node h1Text = new Node(null, "JLearner");
		h1.addChild(h1Text);

		Node nonsens = new Node("nonsense", null);
		body.addChild(nonsens);
		body.removeChild(nonsens);
		
		
		assertEquals(html.toString(), "<html><head><title>JLearner</title></head><body><h1>JLearner</h1></body></html>");
				
		
	}

}
