package core;

public class NaturalNumber {
	private static final int FIRST_OF_NATURAL_NUMBER = 1;
	private static final int INTERVAL = 1;
	
	private int number;

	public NaturalNumber(int number) {
		if (number < 1) {
			throw new IllegalArgumentException(String.format("자연수는 1 이상이어야 한. 현재 값은 : %d", number));
		}
		this.number = number;
	}

	public int getNumber() {
		return this.number;
	}

	public int toArrayIndex() {
		return this.number - INTERVAL;
	}
	
	public static NaturalNumber createFromArrayIndex(int index) {
		return new NaturalNumber(index + INTERVAL);
	}
	
	public NaturalNumber multiply(NaturalNumber operand) {
		return new NaturalNumber(this.number * operand.number);
	}
	
	public boolean isFirst() {
		return isFirst(getNumber());
	}
	
	public boolean isFirst(int number) {
		return number == FIRST_OF_NATURAL_NUMBER;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
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
		NaturalNumber other = (NaturalNumber) obj;
		if (number != other.number)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "NaturalNumber [number=" + number + "]";
	}
}
