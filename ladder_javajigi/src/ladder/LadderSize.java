package ladder;

import core.NaturalNumber;

class LadderSize {
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
		return new LadderSize(new NaturalNumber(height), new NaturalNumber(noOfPerson));
	}
	
	static LadderSize create(NaturalNumber height, NaturalNumber noOfPerson) {
		return new LadderSize(height, noOfPerson);
	}
	
	NaturalNumber getPositionOfPerson(NaturalNumber currentTotalPosition) {
		int remainder = currentTotalPosition.getNumber() % noOfPerson.getNumber();
		if (remainder == 0) {
			return noOfPerson;
		}
		return new NaturalNumber(remainder);
	}

	NaturalNumber getPositionOfHeight(NaturalNumber currentTotalPosition) {
		double ceilDividende = Math.ceil(currentTotalPosition.getNumber() / (double)noOfPerson.getNumber());
		return new NaturalNumber(new Double(ceilDividende).intValue());
	}

	Position getPosition(NaturalNumber currentTotalPosition) {
		return Position.create(getPositionOfHeight(currentTotalPosition), getPositionOfPerson(currentTotalPosition));
	}
	
	int getCountOfLine(double ratio) {
		NaturalNumber totalPositions = getTotalPosition();
		return new Double(totalPositions.getNumber() * ratio).intValue();
	}

	NaturalNumber getTotalPosition() {
		NaturalNumber totalPositions = height.multiply(noOfPerson);
		return totalPositions;
	}
}
