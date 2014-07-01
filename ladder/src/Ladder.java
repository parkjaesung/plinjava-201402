class Ladder {
	int noOfPerson;
	boolean[][] points;

	Ladder(int rows, int noOfPerson) {
		this.noOfPerson = noOfPerson;
		this.points = new boolean[rows][noOfPerson];
	}

	void drawLine(int row, int order) {
		points[row][order] = true;
		points[row][order + 1] = true;
	}

	int run(int source) {
		for (int i = 0; i < points.length; i++) {
			System.out.println(String.format("index : %d,  source : %d", i,
					source));
			
			if (points[i][source]) {
				if (source - 1 >= 0) {
					if (points[i][source - 1]) {
						source -= 1;
						continue;
					}
				}

				if (source + 1 < noOfPerson) {
					if (points[i][source + 1]) {
						source += 1;
						continue;
					}
				}				
			}
		}

		return source;
	}

}
