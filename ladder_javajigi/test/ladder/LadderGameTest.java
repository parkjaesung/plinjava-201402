package ladder;

import junit.framework.TestCase;
import core.NaturalNumber;

public class LadderGameTest extends TestCase {
	public void testRunBigLadder() throws Exception {
		LadderGame ladder = LadderGameFactory.randomLadderGame(new NaturalNumber(10), new NaturalNumber(6));
		Marker result = ladder.run(new Marker(2));
		System.out.println(result);
	}
	
	public void testRunWhenRandomLadder() throws Exception {
		LadderGame ladder = LadderGameFactory.randomLadderGame(new NaturalNumber(3), new NaturalNumber(4));
		Marker result = ladder.run(new Marker(2));
		System.out.println(result);
	}
	
	public void testRunWhenManualLadder() throws Exception {
		LadderGame ladder = LadderGameFactory.manualLadderGame(new NaturalNumber(3), new NaturalNumber(4));
		ladder.drawLine(new NaturalNumber(1), new NaturalNumber(1));
		ladder.drawLine(new NaturalNumber(2), new NaturalNumber(2));
		ladder.drawLine(new NaturalNumber(3), new NaturalNumber(3));

		assertEquals(new Marker(4), ladder.run(new Marker(1)));
		assertEquals(new Marker(1), ladder.run(new Marker(2)));
		assertEquals(new Marker(2), ladder.run(new Marker(3)));
		assertEquals(new Marker(3), ladder.run(new Marker(4)));
	}
	
	public void testDrawLineWhenOverNoOfRows() throws Exception {
		try {
			LadderGame ladder = LadderGameFactory.manualLadderGame(new NaturalNumber(3), new NaturalNumber(4));
			ladder.drawLine(new NaturalNumber(4), new NaturalNumber(4));
			fail("IllegalArgumentException 에러가 발생해야 한다.");
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		}
	}
}
