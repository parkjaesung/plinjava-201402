package ladder.creator;

import ladder.LadderSize;
import ladder.Row;
import core.NaturalNumber;

public interface LadderCreator {

	void drawLine(NaturalNumber height, NaturalNumber startPosition);
	
	LadderSize getLadderSize();

	Row[] getLadder();

}