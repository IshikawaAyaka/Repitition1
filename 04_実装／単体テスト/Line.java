package tictactoe;

public class Line {
	private Square[] squares = new Square[3];

	public Line() {

	}

	public boolean judgeWinner() {
		if (squares[0].getMark() == Mark.CIRCLE && squares[1].getMark() == Mark.CIRCLE
				&& squares[2].getMark() == Mark.CIRCLE) {
			return true;
		}

		if (squares[0].getMark() == Mark.CROSS && squares[1].getMark() == Mark.CROSS
				&& squares[2].getMark() == Mark.CROSS) {
			return true;
		}
		return false;
	}

	public void setSquare(Square square1, Square square2, Square square3) {
		squares[0] = square1;
		squares[1] = square2;
		squares[2] = square3;
	}

}
