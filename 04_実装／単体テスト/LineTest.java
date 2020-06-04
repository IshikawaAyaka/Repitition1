package tictactoe;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class LineTest {
	public static class testLine_勝敗確認 {

		Line line = new Line();

		@Test
		public void testLine_01CIRCLEが1列以上揃う時() {

			Square square1 = new Square(1, 1);
			Square square2 = new Square(2, 2);
			Square square3 = new Square(3, 3);

			line.setSquare(square1, square2, square3);

			square1.setMark(Mark.CIRCLE);
			square2.setMark(Mark.CIRCLE);
			square3.setMark(Mark.CIRCLE);
			boolean actual = line.judgeWinner();
			boolean expected_result = true;

			assertThat(actual, is(expected_result));

		}

		@Test
		public void testLine_02CROSSが1列以上揃う時() {
			Square square1 = new Square(1, 1);
			Square square2 = new Square(2, 2);
			Square square3 = new Square(3, 3);

			line.setSquare(square1, square2, square3);

			square1.setMark(Mark.CROSS);
			square2.setMark(Mark.CROSS);
			square3.setMark(Mark.CROSS);
			boolean actual = line.judgeWinner();
			boolean expected_result = true;

			assertThat(actual, is(expected_result));
		}

		@Test
		public void testLine_03同じマークがそろわない時() {
			Square square1 = new Square(1, 1);
			Square square2 = new Square(2, 2);
			Square square3 = new Square(3, 3);

			line.setSquare(square1, square2, square3);

			square1.setMark(Mark.CIRCLE);
			square2.setMark(Mark.CROSS);
			square3.setMark(Mark.CIRCLE);
			boolean actual = line.judgeWinner();
			boolean expected_result = false;

			assertThat(actual, is(expected_result));
		}
	}

}
