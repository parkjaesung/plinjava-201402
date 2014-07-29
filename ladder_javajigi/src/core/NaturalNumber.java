package core;

public class NaturalNumber {
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
		return this.number - 1;
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
}
