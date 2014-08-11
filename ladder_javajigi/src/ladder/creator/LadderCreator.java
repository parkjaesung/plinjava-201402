package ladder.creator;

import ladder.Row;
import core.NaturalNumber;

public interface LadderCreator {

	void drawLine(NaturalNumber height, NaturalNumber startPosition);

	Row[] getLadder();

}