package ladder;

import core.NaturalNumber;

class Marker extends NaturalNumber {
	Marker(int number) {
		super(number);
	}

	Marker moveRight() {
		return new Marker(getNumber() + 1);
	}

	Marker moveLeft() {
		return new Marker(getNumber() - 1);
	}
}
