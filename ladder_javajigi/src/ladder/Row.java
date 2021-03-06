package ladder;

class Row {
	private enum Direction {
		LEFT(-1),
		CENTER(0),
		RIGHT(1);
		
		private int no;
		
		private Direction(int no) {
			this.no = no;
		}
		
		int getNo() {
			return no;
		}
	}
	
	private int[] persons;

	Row(int noOfPersons) {
		if (noOfPersons < 1) {
			throw new IllegalArgumentException(String.format("사람 수는 한 명 이상이어야 합니다. 현재 값은 : %d", noOfPersons));
		}
		persons = new int[noOfPersons];
	}

	void drawLine(int startPosition) {
		if (startPosition < 0) {
			throw new IllegalArgumentException(String.format("시작점은 0이상이어야 합니다. 현재 값 : %d", startPosition));
		}
		
		if (startPosition >= persons.length - 1) {
			throw new IllegalArgumentException(String.format("시작점은 %d 미만이어야 합니다. 현재 값 : %d", persons.length - 1, startPosition));
		}
		
		if (persons[startPosition] == -1) {
			throw new IllegalArgumentException("선을 그을 수 없는 위치입니다.");
		}
		
		persons[startPosition] = Direction.RIGHT.getNo();
		persons[startPosition + 1] = Direction.LEFT.getNo();
	}

	int move(int startMarker) {
		if (startMarker < 0) {
			throw new IllegalArgumentException(String.format("사다리 시작 위치는 0 이상이어야 합니다. 현재 값은 : %d", startMarker));
		}
		
		if (isNoLine(startMarker)) {
			return startMarker;
		}
		
		if (isRightDirection(startMarker)) {
			return startMarker + 1;
		}
		
		return startMarker - 1;
	}

	private boolean isRightDirection(int nthOfPerson) {
		return persons[nthOfPerson] == Direction.RIGHT.getNo();
	}

	private boolean isNoLine(int nthOfPerson) {
		return persons[nthOfPerson] == Direction.CENTER.getNo();
	}
}
