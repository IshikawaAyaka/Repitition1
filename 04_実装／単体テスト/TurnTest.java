package Sanmoku;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class TurnTest {
	Player firstPlayer=new Player(Mark.CIRCLE, "先攻");
	Player secondPlayer=new Player(Mark.CROSS, "後攻");
	@Test
	public void test1_1(){
		Turn turn = new Turn(firstPlayer);
		Player a = turn.getPlayer();
		assertThat(a,is(firstPlayer));
	}
	
	@Test
	public void test1_2(){
		Turn turn = new Turn(secondPlayer);
		Player a = turn.getPlayer();
		assertThat(a,is(secondPlayer));
	}
	
	@Test
	public void test2_1(){
		Turn turn = new Turn(firstPlayer);
		Board board = new Board();
		board.setMark(1, 1, Mark.CIRCLE);
		turn.requestXY(board);
	}
	
	@Test
	public void test3_1(){
		Turn turn = new Turn(firstPlayer);
		Board board = new Board();
		turn.requestXY(board);
		turn.setMark();
		Square s=board.getSquare(1, 1);
		Mark m=s.getMark();
		assertThat(m,is(Mark.CIRCLE));
	}
}
