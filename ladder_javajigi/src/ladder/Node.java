package ladder;

class Node {
	private enum Direction {
		LEFT, CENTER, RIGHT;
	}

	private Direction direction;

	private Node(Direction direction) {
		this.direction = direction;
	}

	void changeRight() {
		this.direction = Direction.RIGHT;
	}

	void changeLeft() {
		this.direction = Direction.LEFT;
	}
	
	Marker move(Marker marker) {
		if (this.direction == Direction.RIGHT) {
			return marker.moveRight();
		}
		
		if (this.direction == Direction.LEFT) {
			return marker.moveLeft();
		}
		
		return marker;
	}
	
	static Node createCenterNode() {
		return new Node(Direction.CENTER);
	}
	
	static Node createRightNode() {
		return new Node(Direction.RIGHT);
	}
	
	static Node createLeftNode() {
		return new Node(Direction.LEFT);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((direction == null) ? 0 : direction.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (direction != other.direction)
			return false;
		return true;
	}
}
