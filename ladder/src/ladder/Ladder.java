package ladder;

class Ladder {
	private Row[] rows;

	Ladder(int countOfRow, int noOfPerson) {
		rows = new Row[countOfRow];
		
		for (int i = 0; i < countOfRow; i++) {
			rows[i] = new Row(noOfPerson);
		}
	}

	void drawLine(int noOfRow, int startPosition) {
		if (noOfRow < 0) {
			throw new IllegalArgumentException(String.format("사다리 높이는 0이상이어야 합니다. 현재 값 : %d", noOfRow));
		}
		
		if (noOfRow > rows.length -1) {
			throw new IllegalArgumentException(String.format("사다리 최대 높이를 넘어섰습니다. 현재 값 : %d", noOfRow));
		}
		
		rows[noOfRow].drawLine(startPosition);
	}

	int run(int nthOfPerson) {
		for (int i = 0; i < rows.length; i++) {
			Row row = rows[i];
			nthOfPerson = row.move(nthOfPerson);
		}

		return nthOfPerson;
	}
}
