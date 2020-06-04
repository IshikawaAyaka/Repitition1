package tictactoe;

import org.junit.Before;
import org.junit.Test;

public class TicTacToeTest {

	@Before
	public void setup() {
		TicTacToe ttt = new TicTacToe();
	}

	@Test
	public void test1() {
		TicTacToe ttt = new TicTacToe();
		ttt.game();
	}

	@Test
	public void test2() {
		TicTacToe ttt = new TicTacToe();
		ttt.game();
	}
}
