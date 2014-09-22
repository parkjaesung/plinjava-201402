package ladder;

import java.util.ArrayList;

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
	
	public RandomNaturalNumber before() {
		return new RandomNaturalNumber(toArrayIndex());
	}

	public RandomNaturalNumber next() {
		return new RandomNaturalNumber(getNumber() + 1);
	}
	
	public ArrayList<RandomNaturalNumber> checkedNatualNumbers(NaturalNumber noOfPerson) {
		ArrayList<RandomNaturalNumber> naturalNumbers = new ArrayList<RandomNaturalNumber>();
		int remainder = getNumber() % noOfPerson.getNumber();
		if (!isFirst(remainder)) {
			naturalNumbers.add(before());
		}
		naturalNumbers.add(this);
		naturalNumbers.add(next());
		return naturalNumbers;
	}
}
