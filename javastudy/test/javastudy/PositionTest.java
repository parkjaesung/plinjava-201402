package javastudy;

import static org.junit.Assert.*;
import net.slipp.exception.InvalidPositionException;
import net.slipp.exception.Position;

import org.junit.Test;

public class PositionTest {

	@Test
	public void validPosition() throws InvalidPositionException {
		Position actual = new Position("c4");
		assertEquals(actual, new Position(2, 3));
	}

}
