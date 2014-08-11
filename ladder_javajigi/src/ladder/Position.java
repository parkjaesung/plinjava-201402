package ladder;

import core.NaturalNumber;

public class Position {
	private NaturalNumber height;
	private NaturalNumber nthOfPerson;

	private Position(NaturalNumber height, NaturalNumber nthOfPerson) {
		this.height = height;
		this.nthOfPerson = nthOfPerson;
	}
	
	public NaturalNumber getHeight() {
		return height;
	}
	
	public NaturalNumber getNthOfPerson() {
		return nthOfPerson;
	}

	static Position create(int height, int nthOfPerson) {
		return create(new NaturalNumber(height), new NaturalNumber(nthOfPerson));
	}
	
	static Position create(NaturalNumber height, NaturalNumber nthOfPerson) {
		return new Position(height, nthOfPerson);
	}	

	static Position createFromArrayIndex(int height, int nthOfPerson) {
		return new Position(NaturalNumber.createFromArrayIndex(height),
				NaturalNumber.createFromArrayIndex(nthOfPerson));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((height == null) ? 0 : height.hashCode());
		result = prime * result
				+ ((nthOfPerson == null) ? 0 : nthOfPerson.hashCode());
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
		Position other = (Position) obj;
		if (height == null) {
			if (other.height != null)
				return false;
		} else if (!height.equals(other.height))
			return false;
		if (nthOfPerson == null) {
			if (other.nthOfPerson != null)
				return false;
		} else if (!nthOfPerson.equals(other.nthOfPerson))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Position [height=" + height + ", nthOfPerson=" + nthOfPerson
				+ "]";
	}
}
