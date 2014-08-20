package ladder;

import core.NaturalNumber;

class LadderGame {
	private ManuralLadderCreator ladderCreator;

	LadderGame(NaturalNumber height, NaturalNumber noOfPerson) {
		ladderCreator = new ManuralLadderCreator(height, noOfPerson);
	}
	
	void drawLine(NaturalNumber height, NaturalNumber startPosition) {
		ladderCreator.drawLine(height, startPosition);
	}

	Marker run(Marker nthOfPerson) {
		LadderRunner runner = new LadderRunner(ladderCreator.getLadder());
		return runner.run(nthOfPerson);
	}
}
