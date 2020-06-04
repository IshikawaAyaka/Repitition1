package tictactoe;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class BoardTest {
	Board b;

	@Before
	public void setUp() {
		b = new Board();
	}

	@Test
	public void test1_1() {
		b = new Board();
		// 実行
		boolean test_1_1 = b.canInput(1, 1);

		// 検証
		assertThat(test_1_1, is(true));
		// （必要であれば）後処理
	}

	@Test
	public void test1_2() {
		// 実行
		boolean test_1_2 = b.canInput(4, 1);

		// 検証
		assertThat(test_1_2, is(false));
		// （必要であれば）後処理
	}

	@Test
	public void test1_3() {
		// 準備

		b.setMark(1, 1, Mark.CIRCLE);

		// 実行
		boolean test_1_3 = b.canInput(1, 1);

		// 検証
		assertThat(test_1_3, is(false));
		// （必要であれば）後処理
	}

	@Test
	public void test2_1() {
		// 準備
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				b.setMark(i, j, Mark.CIRCLE);
				// Square square = b.getSquare(i, j);
				// square.setMark(Mark.CIRCLE);
			}

		}

		// 実行
		boolean test_2_1 = b.isFull();

		// 検証
		assertThat(test_2_1, is(true));
		// （必要であれば）後処理
	}

	@Test
	public void test2_2() {
		// 準備
		b.setMark(1, 1, Mark.CIRCLE);
		b.setMark(1, 2, Mark.CIRCLE);

		// 実行
		boolean test_2_2 = b.isFull();

		// 検証
		assertThat(test_2_2, is(false));
		// （必要であれば）後処理
	}

	@Test
	public void test3_1() {
		// 準備
		b.setMark(1, 1, Mark.CIRCLE);
		b.setMark(1, 2, Mark.CIRCLE);
		b.setMark(1, 3, Mark.CIRCLE);

		// 実行
		boolean test_3_1 = b.checkLine();

		// 検証
		assertThat(test_3_1, is(true));
		// （必要であれば）後処理
	}

	@Test
	public void test3_2() {
		// 準備

		// 実行
		boolean test_3_2 = b.checkLine();

		// 検証
		assertThat(test_3_2, is(false));
		// （必要であれば）後処理
	}

}
