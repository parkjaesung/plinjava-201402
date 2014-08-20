package ladder.creator;

import junit.framework.TestCase;
import core.NaturalNumber;

public class RandomLadderCreatorTest extends TestCase {
	public void testGenerateStartPositions() throws Exception {
		ManualLadderCreator manualLadderCreator = new ManualLadderCreator(new NaturalNumber(3), new NaturalNumber(4));
		new RandomLadderCreator(manualLadderCreator);
	}
}
