package ladder;

import junit.framework.TestCase;

public class RandomNaturalNumberTest extends TestCase {
	public void testGetPositionOfPerson() throws Exception {
		RandomNaturalNumber number = new RandomNaturalNumber(4);
		int actual = number.getPositionOfPerson(3);
		// 1 2 3 
		// 4 5 6 => 높이는 2, 사람의 위치는 1
		assertEquals(1, actual);
	}
	
	public void testGetPositionOfHeight() throws Exception {
		RandomNaturalNumber number = new RandomNaturalNumber(4);
		int actual = number.getPositionOfHeight(3);
		// 1 2 3 
		// 4 5 6 => 높이는 2, 사람의 위치는 1
		assertEquals(2, actual);
	}
	
	public void testIsMultipleOfPerson() throws Exception {
		RandomNaturalNumber randomNumber = new RandomNaturalNumber(8);
		assertTrue(randomNumber.isMultipleOfPerson(4));
		
		randomNumber = new RandomNaturalNumber(5);
		assertFalse(randomNumber.isMultipleOfPerson(3));
	}
}
