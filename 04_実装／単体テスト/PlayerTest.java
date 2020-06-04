package tictactoe;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Before;
import org.junit.Test;


public class PlayerTest {
	Player player;



	@Before
	public void setup() {
	}

	@Test
	public void testInputXY_1() {
		Player player = new Player();
		int[] expected_XY = {1,1};
		int[] actual = player.setXY();
		assertThat(actual, is(expected_XY));
	}
	//junit matchers
	//hasItems
	//配列を１つずつ比較

	@Test
	public void testInputXY_2() {
		Player player = new Player();
		int[] expected_XY = {-1,-1};
		int[] actual = player.setXY();
		assertThat(actual, is(expected_XY));
	}

	@Test
	public void testGetName() {
		Mark mark = Mark.CIRCLE;
		String name = "A";
		Player player = new Player(mark,name);
		String actualName = player.getName();
		String expected_name = "A";
		assertThat(actualName, is(expected_name));
	}

	@Test
	public void testGetMark_1() {
		Mark mark = Mark.CIRCLE;
		String name = "A";
		Player player = new Player(mark,name);
		Mark actualMark = player.getMark();
		Mark expected_mark = Mark.CIRCLE;
		assertThat(actualMark, is(expected_mark));
	}

	@Test
	public void testGetMark_2() {
		Mark mark = Mark.CROSS;
		String name = "A";
		Player player = new Player(mark,name);
		Mark actualMark = player.getMark();
		Mark expected_mark = Mark.CROSS;
		assertThat(actualMark, is(expected_mark));
	}

	@Test
	public void testGetMark_3() {
		Mark mark = Mark.NONE;
		String name = "A";
		Player player = new Player(mark,name);
		Mark actualMark = player.getMark();
		Mark expected_mark = Mark.NONE;
		assertThat(actualMark, is(expected_mark));
	}
}
