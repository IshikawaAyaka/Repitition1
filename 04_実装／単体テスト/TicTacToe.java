package tictactoe;

import java.util.ArrayList;
import java.util.List;

public class TicTacToe {

	private Board board;
	private List<Turn> turns = new ArrayList<Turn>();
	Player firstPlayer;
	Player secondPlayer;
	
	public TicTacToe() {
		board = new Board();
		firstPlayer = new Player(Mark.CIRCLE,"先攻");
		secondPlayer = new Player(Mark.CROSS,"後攻");
	}

	public void game() {
		int[] xy = new int[2];
		Player player = firstPlayer;
		boolean winner = false;
		boolean isFull = false;
		
		//空の盤面を表示
		board.showBoard();
		
		//
		while(true) {
			//ターンを生成
			Turn turn = new Turn(player);
			//入力を促す
			xy = turn.requestXY(board);
			int x = xy[0];
			int y = xy[1];
			//マスの取得
			board.getSquare(x, y);
			// 取得したマスの中にマークを記入
			turn.setMark();
			turns.add(turn);
			//盤を表示
			board.showBoard();
			//勝利者がいるかどうかを確認
			winner = board.checkLine();
			if (winner) {
				showWinner(player);
				break;
			}
			//すべてのマスが埋まっているかを確認
			isFull = board.isFull();
			if(isFull) {
				showDraw();
				break;
			}
			//プレイヤーの交代
			player = playerChange(player);
			
		}
		showHistory();
	}

	public void showWinner(Player player) {
		if(board.checkLine()) {
			System.out.println("勝者:" + player.getName());
		}
	}

	public void showHistory() {
		System.out.println("<ターン履歴>");
		for (Turn t : turns) {
			System.out.print(t.getPlayer().getName() + ":(" + t.getX() + "," + t.getY() + ")");
			if(t.getPlayer().getMark() == Mark.CIRCLE) {
				System.out.println("○");
			}else {
				System.out.println("×");
			}
		}
	}

	public Player playerChange(Player player) {
		if (player == firstPlayer) {
			return secondPlayer;
		}else {
			return firstPlayer;
		}
	}

	public void showDraw() {
		System.out.println("引き分け");
	}

}