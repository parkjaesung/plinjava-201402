package ladder;

import core.NaturalNumber;

public class LadderCreatorFactory {
	enum Type {
		MANUAL, RANDOM;
	}
	
	
	private LadderCreatorFactory () {
		
	}
	
	public static LadderCreator create(NaturalNumber height, NaturalNumber noOfPerson, Type type) {
		if (type == Type.MANUAL) {
			return new ManuralLadderCreator(height, noOfPerson);
		}
		
		return new RandomLadderCreator(height, noOfPerson);
	}
}