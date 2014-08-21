package ladder;

import core.NaturalNumber;

interface LadderCreator {

	void drawLine(NaturalNumber height, NaturalNumber startPosition);

	Row[] getLadder();

}