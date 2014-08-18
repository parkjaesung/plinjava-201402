package ladder;

import core.NaturalNumber;

public class RandomNaturalNumber extends NaturalNumber {
	public RandomNaturalNumber(int number) {
		super(number);
	}

	public int getPositionOfPerson(int noOfPerson) {
		int remainder = getNumber() % noOfPerson;
		if (remainder == 0) {
			return noOfPerson;
		}
		return remainder;
	}

	public int getPositionOfHeight(int height) {
		double ceilDividende = Math.ceil(getNumber() / (double)height);
		return new Double(ceilDividende).intValue();
	}
	
	public boolean isMultipleOfPerson(int noOfPerson) {
		int remainder = getNumber() % noOfPerson;
		if (remainder == 0) {
			return true;
		}
		return false;
	}
}
