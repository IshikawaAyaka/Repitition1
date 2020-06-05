package Sanmoku;

public class Square {

	private int x;

	private int y;

	private Mark mark = Mark.NONE;
	
	public Square(int x, int y) {
		this.x=x;
		this.y=y;
	}


	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Mark getMark() {
		return mark;
	}

	public boolean canPlace() {
		if(mark == Mark.NONE) {
			return true;
		}else {
			return false;
		}
	}

	public void setMark(Mark mark) {
		this.mark=mark;
	}

	public Square getSquare() {
		return this;
	}


}