package ladder.creator;

import java.util.ArrayList;
import java.util.Random;

import ladder.LadderSize;
import ladder.Position;
import ladder.RandomNaturalNumber;
import ladder.Row;
import core.NaturalNumber;

public class RandomLadderCreator implements LadderCreator {
	private static final double DEFAULT_LINE_RATIO = 0.3;
	
	private LadderSize ladderSize;

	private LadderCreator ladderCreator;

	public RandomLadderCreator(LadderCreator ladderCreator) {
		this.ladderCreator = ladderCreator;
		this.ladderSize = ladderCreator.getLadderSize();
		
		ArrayList<Position> startPositions = generateStartPositions();
		for (Position position : startPositions) {
			ladderCreator.drawLine(position.getHeight(), position.getNthOfPerson());
		}
	}
	
	public void drawLine(NaturalNumber height, NaturalNumber startPosition) {
		throw new UnsupportedOperationException("RandomLadderCreator에서는 drawLine 메서드를 호출할 수 없습니다.");
	}
	
	public Row[] getLadder() {
		return ladderCreator.getLadder();
	}
	
	public LadderSize getLadderSize() {
		return this.ladderSize;
	}
	
	ArrayList<Position> generateStartPositions() {
		ArrayList<RandomNaturalNumber> numbers = generateRandomPositions();
		return toPositions(numbers);
	}
	
	ArrayList<RandomNaturalNumber> generateRandomPositions() {
		NaturalNumber totalPositions = ladderSize.getTotalPosition();
		int countOfLine = ladderSize.getCountOfLine(DEFAULT_LINE_RATIO);
		System.out.println(String.format("countOfLine : %d", countOfLine));
		ArrayList<RandomNaturalNumber> randomPositions = new ArrayList<RandomNaturalNumber>();
		
		int i = 0;
		do {
			RandomNaturalNumber randomPosition = randInt(1, totalPositions.getNumber());
			System.out.println(String.format("random position : %s", randomPosition));
			if (ladderSize.isMultipleOfPerson(randomPosition)) {
				continue;
			}
			
			if (randomPositions.contains(randomPosition)) {
				continue;
			}
			
			if (randomPositions.contains(new RandomNaturalNumber(randomPosition.getNumber() + 1))) {
				continue;
			}
			
			if (randomPosition.equals(new RandomNaturalNumber(1))) {
				randomPositions.add(randomPosition);
				System.out.println(String.format("added random position : %s", randomPosition));
				i++;				
			} else {
				if (randomPositions.contains(new RandomNaturalNumber(randomPosition.toArrayIndex()))) {
					continue;
				}
				
				randomPositions.add(randomPosition);
				System.out.println(String.format("added random position : %s", randomPosition));
				i++;				
			}
		} while (i < countOfLine);
		
		return randomPositions;
	}
	
	ArrayList<Position> toPositions(ArrayList<RandomNaturalNumber> randomNumbers) {
		ArrayList<Position> positions = new ArrayList<Position>(randomNumbers.size());
		for (RandomNaturalNumber randomNumber : randomNumbers) {
			positions.add(ladderSize.getPosition(randomNumber));
		}
		return positions;
	}
	
	static RandomNaturalNumber randInt(int min, int max) {
	    Random rand = new Random();
	    return new RandomNaturalNumber(rand.nextInt((max - min) + 1) + min);
	}
}
