package ladder;

import ladder.LadderCreatorFactory.Type;
import core.NaturalNumber;

class LadderGame {
	private LadderCreator ladderCreator;
	
	LadderGame(NaturalNumber height, NaturalNumber noOfPerson, Type type) {
		ladderCreator = LadderCreatorFactory.create(height, noOfPerson, type);
	}
	
	void drawLine(NaturalNumber height, NaturalNumber startPosition) {
		ladderCreator.drawLine(height, startPosition);
	}

	Marker run(Marker nthOfPerson) {
		LadderRunner runner = new LadderRunner(ladderCreator.getLadder());
		return runner.run(nthOfPerson);
	}
}
