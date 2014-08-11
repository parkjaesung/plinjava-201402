package ladder.creator;

import junit.framework.TestCase;
import ladder.Position;
import ladder.creator.RandomLadderCreator;
import core.NaturalNumber;

public class RandomLadderCreatorTest extends TestCase {
	public void testGenerateStartPositions() throws Exception {
		RandomLadderCreator creator = new RandomLadderCreator(new NaturalNumber(3), new NaturalNumber(4));
		Position[] positions = creator.generateStartPositions();
		for (int i = 0; i < positions.length; i++) {
			System.out.println(String.format("position : %s", positions[i]));
		}
	}
	
	public void testIsExisted() throws Exception {
		NaturalNumber[] startPositions = {new NaturalNumber(2), new NaturalNumber(3)};
		assertTrue(RandomLadderCreator.isExisted(startPositions, new NaturalNumber(2)));
		assertFalse(RandomLadderCreator.isExisted(startPositions, new NaturalNumber(4)));
	}
}
