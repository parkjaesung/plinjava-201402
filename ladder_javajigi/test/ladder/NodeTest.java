package ladder;

import junit.framework.TestCase;

public class NodeTest extends TestCase {
	public void testCreateCenter() throws Exception {
		assertEquals(Node.createCenterNode(), Node.createCenterNode());
	}

	public void testChangeRight() throws Exception {
		Node node = Node.createCenterNode();
		node.changeRight();
		assertEquals(Node.createRightNode(), node);
	}

	public void testChangeLeft() throws Exception {
		Node node = Node.createCenterNode();
		node.changeLeft();
		assertEquals(Node.createLeftNode(), node);
	}

	public void testMoveRight() throws Exception {
		Marker marker = Node.createRightNode().move(new Marker(3));
		assertEquals(new Marker(4), marker);
	}

	public void testMoveLeft() throws Exception {
		Marker marker = Node.createLeftNode().move(new Marker(3));
		assertEquals(new Marker(2), marker);
	}

	public void testMoveCenter() throws Exception {
		Node node = Node.createCenterNode();
		assertEquals(new Marker(3), node.move(new Marker(3)));
	}
}
