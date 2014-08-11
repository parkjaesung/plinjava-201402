package ladder;

import ladder.creator.LadderCreator;
import core.NaturalNumber;

class LadderGame {
	private LadderCreator ladderCreator;

	LadderGame(LadderCreator ladderCreator) {
		this.ladderCreator = ladderCreator;
	}

	void drawLine(NaturalNumber height, NaturalNumber startPosition) {
		ladderCreator.drawLine(height, startPosition);
	}

	Marker run(Marker nthOfPerson) {
		LadderRunner runner = new LadderRunner(ladderCreator.getLadder());
		return runner.run(nthOfPerson);
	}
}
