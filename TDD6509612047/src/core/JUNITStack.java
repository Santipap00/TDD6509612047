package core;

import junit.framework.TestCase;

public class JUNITStack extends TestCase {
	public void testCreateNewEmptyStack() {
		Stack s1 = new Stack();
		int size = s1.getSize();
		
		assertEquals(0, size);
	}
	public void testPushElmToTop() {
		Stack s1 = new Stack();
		s1.push(1);
		Object elm1 = s1.Top();
		
		assertEquals(1,elm1);
				
	}


}
