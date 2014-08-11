package ladder.creator;

import ladder.LadderSize;
import ladder.Row;
import core.NaturalNumber;

public class ManualLadderCreator implements LadderCreator {
	private Row[] rows;
	
	private LadderSize ladderSize;

	public ManualLadderCreator(NaturalNumber height, NaturalNumber noOfPerson) {
		this.ladderSize = LadderSize.create(height, noOfPerson);
		
		rows = new Row[height.getNumber()];
		
		for (int i = 0; i < height.getNumber(); i++) {
			rows[i] = new Row(noOfPerson);
		}
	}
	
	public LadderSize getLadderSize() {
		return ladderSize;
	}
	
	/* (non-Javadoc)
	 * @see ladder.LadderCreator#drawLine(core.NaturalNumber, core.NaturalNumber)
	 */
	@Override
	public void drawLine(NaturalNumber height, NaturalNumber startPosition) {
		if (isOverHeight(height)) {
			throw new IllegalArgumentException(String.format("사다리 최대 높이를 넘어섰습니다. 현재 값 : %d", height));
		}
		
		rows[height.toArrayIndex()].drawLine(startPosition);
	}
	
	private boolean isOverHeight(NaturalNumber height) {
		return height.toArrayIndex() > rows.length -1;
	}

	/* (non-Javadoc)
	 * @see ladder.LadderCreator#getLadder()
	 */
	@Override
	public Row[] getLadder() {
		return this.rows;
	}
}
