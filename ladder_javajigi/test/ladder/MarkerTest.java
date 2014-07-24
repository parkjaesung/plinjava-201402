package ladder;

import junit.framework.TestCase;

public class MarkerTest extends TestCase {
	public void testMoveRight() throws Exception {
		Marker marker = new Marker(3);
		assertEquals(new Marker(4), marker.moveRight());
	}
	
	public void testMoveLeft() throws Exception {
		Marker marker = new Marker(3);
		assertEquals(new Marker(2), marker.moveLeft());
	}
	
}
