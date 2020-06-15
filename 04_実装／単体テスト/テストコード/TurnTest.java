package sanmoku;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class TurnTest {
	@Test
	public void test1() {
		Board b1=new Board();
		Turn t1=new Turn();
		t1.setPosition(b1,0,0,"×");
		
		Turn t2=new Turn();
		boolean i=t2.setPosition(b1,0,0,"〇");
		
		assertThat(i, is(false));
	}
	
	@Test
	public void test2() {
		Board b1=new Board();
		Turn t1=new Turn();
		boolean i=t1.setPosition(b1,0,3,"〇");
		
		//Turn t2=new Turn();
		//boolean i=t2.setPosition(b1,0,0,"〇");
		
		assertThat(i, is(false));
	}
	
	@Test
	public void test3() {
		Board b1=new Board();
		Turn t1=new Turn();
		boolean i=t1.setPosition(b1,0,0,"〇");
		
		//Turn t2=new Turn();
		//boolean i=t2.setPosition(b1,0,0,"〇");
		
		assertThat(i, is(true));
		}
}
