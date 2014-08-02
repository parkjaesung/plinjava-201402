package ladder;

import junit.framework.TestCase;
import core.NaturalNumber;

public class RandomLadderCreatorTest extends TestCase {
	public void testGenerateStartPositions() throws Exception {
		RandomLadderCreator creator = new RandomLadderCreator(new NaturalNumber(3), new NaturalNumber(4));
		Position[] positions = creator.generateStartPositions();
		for (int i = 0; i < positions.length; i++) {
			System.out.println(String.format("position : %s", positions[i]));
		}
	}
	
	public void testCountOfLine() throws Exception {
		int countOfLine = RandomLadderCreator.getCountOfLine(new NaturalNumber(20), 0.3);
		assertEquals(6, countOfLine);
		
		countOfLine = RandomLadderCreator.getCountOfLine(new NaturalNumber(5), 0.3);
		assertEquals(1, countOfLine);
	}
	
	public void test총위치값을_2차원배열위치값으로_변환() throws Exception {
		Position position = RandomLadderCreator.convertTotalPositionsToPosition(new NaturalNumber(8), new NaturalNumber(4), new NaturalNumber(5));
		assertEquals(Position.create(2, 3), position);
	}
	
	public void test사람위치() throws Exception {
		NaturalNumber positionOfPerson = RandomLadderCreator.getPositionOfPerson(new NaturalNumber(10), new NaturalNumber(3));
		assertEquals(new NaturalNumber(1), positionOfPerson);
	}
	
	public void test높이위치() throws Exception {
		NaturalNumber positionOfHeight = RandomLadderCreator.getPositionOfHeight(new NaturalNumber(10), new NaturalNumber(3));
		assertEquals(new NaturalNumber(4), positionOfHeight);
	}
}
