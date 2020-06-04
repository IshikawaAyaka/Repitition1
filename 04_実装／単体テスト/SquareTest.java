package Sanmoku;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class SquareTest {
	
	@Test
	public void test1_1(){
		Square square =new Square(1,1);
		boolean a= square.canPlace();
		
		assertThat(a,is(true));
	}
	
	
	@Test
	public void test1_2(){
		Square square =new Square(1,1);
		square.setMark(Mark.CIRCLE);
		boolean a= square.canPlace();
		
		assertThat(a,is(false));
	}
	
	@Test
	public void test1_3(){
		Square square =new Square(1,1);
		square.setMark(Mark.CROSS);
		boolean a= square.canPlace();
		
		assertThat(a,is(false));
	}
	
	@Test
	public void test2_1(){
		Square square =new Square(1,1);
		square.setMark(Mark.CIRCLE);
		
		assertThat(square.getMark(),is(Mark.CIRCLE));
	}
	
	@Test
	public void test2_2(){
		Square square =new Square(1,1);
		square.setMark(Mark.CROSS);
		
		assertThat(square.getMark(),is(Mark.CROSS));
	}
}
