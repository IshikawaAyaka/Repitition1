package tictactoe;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Player {

	private Mark mark;

	private String playerName;

	public Player(Mark mark, String name) {
		this.playerName = name;
		this.mark = mark;
	}

	
	public int[] setXY() {
		System.out.println("列と行を、半角スペースで区切って入力して下さい (例：2列目の3行目 → 2 3)");
		int[] ret = new int[2];
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String input = reader.readLine();
			String[] numbersStr = input.split(" ");
			for (int i = 0; i < numbersStr.length; i++) {
				ret[i] = Integer.parseInt(numbersStr[i]);
			}
			return ret;
		}catch(Exception e) {
			ret[0] = -1;
			ret[1] = -1;
			return ret;
		}
		
	}

	public String getName() {
		return playerName;
	}

	public Mark getMark() {
		return mark;
	}



}
