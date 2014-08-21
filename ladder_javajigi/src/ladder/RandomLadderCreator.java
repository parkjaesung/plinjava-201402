package ladder;

import java.util.Random;

import core.NaturalNumber;

public class RandomLadderCreator extends ManuralLadderCreator implements LadderCreator {
	private static final double DEFAULT_LINE_RATIO = 0.3;
	
	private LadderSize ladderSize;

	RandomLadderCreator(NaturalNumber height, NaturalNumber noOfPerson) {
		super(height, noOfPerson);
		
		this.ladderSize = LadderSize.create(height, noOfPerson);
		
		Position[] startPositions = generateStartPositions();
		for (Position position : startPositions) {
			drawLine(position.getHeight(),
					position.getNthOfPerson());
		}
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
