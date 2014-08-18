package ladder;

import core.NaturalNumber;

public class LadderSize {
	private NaturalNumber height;
	private NaturalNumber noOfPerson;

	private LadderSize(NaturalNumber height, NaturalNumber noOfPerson) {
		this.height = height;
		this.noOfPerson = noOfPerson;
	}
	
	NaturalNumber getHeight() {
		return height;
	}
	
	NaturalNumber getNoOfPerson() {
		return noOfPerson;
	}

	static LadderSize create(int height, int noOfPerson) {
		return create(new NaturalNumber(height), new NaturalNumber(noOfPerson));
	}
	
	public static LadderSize create(NaturalNumber height, NaturalNumber nthOfPerson) {
		return new LadderSize(height, nthOfPerson);
	}
	
	public Position getPosition(RandomNaturalNumber randomNaturalNumber) {
		int positionOfPerson = randomNaturalNumber.getPositionOfPerson(noOfPerson.getNumber());
		int positionOfHeight = randomNaturalNumber.getPositionOfHeight(height.getNumber());
		return Position.create(positionOfPerson, positionOfHeight);
	}
	
	public int getCountOfLine(double ratio) {
		NaturalNumber totalPositions = getTotalPosition();
		return new Double(totalPositions.getNumber() * ratio).intValue();
	}

	public NaturalNumber getTotalPosition() {
		NaturalNumber totalPositions = height.multiply(noOfPerson);
		return totalPositions;
	}

	public boolean isMultipleOfPerson(RandomNaturalNumber randomPosition) {
		return randomPosition.isMultipleOfPerson(noOfPerson.getNumber());
	}
}
