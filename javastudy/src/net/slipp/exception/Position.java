package net.slipp.exception;

public class Position {
	private int x;
	private int y;
	
    public Position(String position) throws InvalidPositionException {
        if (position.length() != 2) {
            throw new InvalidPositionException(position + "은 위치 값 형식에 맞지 않습니다.");
        }

        x = (int) (position.charAt(0) - 'a');
        y = Integer.parseInt(position.substring(1)) - 1;
    }
    
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
    
    public int getX() {
		return x;
	}
    
    public int getY() {
		return y;
	}
    
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Position [x=" + x + ", y=" + y + "]";
	}
}

