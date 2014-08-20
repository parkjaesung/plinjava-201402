package ladder;

import java.util.Random;

import core.NaturalNumber;

public class RandomLadderCreator {
	private static final double DEFAULT_LINE_RATIO = 0.3;
	
	private Row[] rows;

	private LadderSize ladderSize;

	RandomLadderCreator(NaturalNumber height, NaturalNumber noOfPerson) {
		this.ladderSize = LadderSize.create(height, noOfPerson);
		
		rows = new Row[height.getNumber()];
		
		for (int i = 0; i < height.getNumber(); i++) {
			rows[i] = new Row(noOfPerson);
		}
		
		Position[] startPositions = generateStartPositions();
		for (Position position : startPositions) {
			drawLine(position.getHeight(),
					position.getNthOfPerson());
		}
	}
	
	void drawLine(NaturalNumber height, NaturalNumber startPosition) {
		if (isOverHeight(height)) {
			throw new IllegalArgumentException(String.format("사다리 최대 높이를 넘어섰습니다. 현재 값 : %d", height));
		}
		
		rows[height.toArrayIndex()].drawLine(startPosition);
	}
	
	private boolean isOverHeight(NaturalNumber height) {
		return height.toArrayIndex() > rows.length -1;
	}

	Row[] getLadder() {
		return this.rows;
	}
	
	Position[] generateStartPositions() {
		NaturalNumber[] numbers = generateRandomPositions();
		return toPositions(numbers);
	}
	
	NaturalNumber[] generateRandomPositions() {
		NaturalNumber totalPositions = ladderSize.getTotalPosition();
		int countOfLine = ladderSize.getCountOfLine(DEFAULT_LINE_RATIO);
		NaturalNumber[] startPositions = new NaturalNumber[countOfLine];
		for (int i = 0; i < startPositions.length; i++) {
			startPositions[i] = randInt(1, totalPositions.getNumber());
			System.out.println(String.format("random position : %s", startPositions[i]));
		}
		return startPositions;
	}
	
	Position[] toPositions(NaturalNumber[] positions) {
		Position[] startPositions = new Position[positions.length];
		for (int i = 0; i < positions.length; i++) {
			startPositions[i] = ladderSize.getPosition(positions[i]);
		}
		return startPositions;
	}
	
	static NaturalNumber randInt(int min, int max) {
	    Random rand = new Random();
	    return new NaturalNumber(rand.nextInt((max - min) + 1) + min);
	}
}
