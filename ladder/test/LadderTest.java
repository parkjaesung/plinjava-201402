import static org.junit.Assert.*;

import org.junit.Test;

public class LadderTest {
	@Test
	public void oneByOne() {
		Ladder ladder = new Ladder(1, 1);
		assertEquals(ladder.run(0), 0);
	}

	@Test
	public void twoByOneWhenNoLine() {
		Ladder ladder = new Ladder(1, 2);
		assertEquals(ladder.run(0), 0);
		assertEquals(ladder.run(1), 1);
	}

	@Test
	public void twoByOneWhenOneLine() {
		Ladder ladder = new Ladder(1, 2);
		ladder.drawLine(0, 0);
		assertEquals(ladder.run(0), 1);
		assertEquals(ladder.run(1), 0);
	}

	@Test
	public void threeByThreeThreeBridge() throws Exception {
		Ladder ladder = new Ladder(3, 3);
		ladder.drawLine(0, 0);
		ladder.drawLine(1, 1);
		ladder.drawLine(2, 0);
		assertEquals(ladder.run(0), 2);
		assertEquals(ladder.run(1), 1);
		assertEquals(ladder.run(2), 0);
	}
}
