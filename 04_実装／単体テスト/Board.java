package tictactoe;
public class Board {
	private Line[] lines = new Line[8];
	private Square[][] squares = new Square[3][3];

	public Board() {

		// Squareオブジェクトを９個生成する。
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				this.squares[i - 1][j - 1] = new Square(i, j);
			}
		}

		// Lineオブジェクトを８本生成する。箱を用意する。
		for (int i = 0; i < 8; i++) {
			lines[i] = new Line();
		}
		// 横ライン ３本
		lines[0].setLine(squares[0][0], squares[0][1], squares[0][2]);
		lines[1].setLine(squares[1][0], squares[1][1], squares[1][2]);
		lines[2].setLine(squares[2][0], squares[2][1], squares[2][2]);
		// 縦ライン ３本
		lines[3].setLine(squares[0][0], squares[1][0], squares[2][0]);
		lines[4].setLine(squares[1][0], squares[1][1], squares[1][2]);
		lines[5].setLine(squares[2][0], squares[2][1], squares[2][2]);
		// 斜めのライン ２本
		lines[6].setLine(squares[0][0], squares[1][1], squares[2][2]);
		lines[7].setLine(squares[2][0], squares[1][1], squares[0][2]);
	}

	// 座標を指定し、マークを記入できるか確認する。できる=true,できない=false
	public boolean canInput(int x, int y) {
		boolean result = false;
		if (x < 1 || y < 1 || 3 < x || 3 < y) {
			System.out.println("1から3の数字を選択してください");
			return result;
		} else {
			result = squares[x - 1][y - 1].canPlace();
			return result;
		}
	}

	// 一列が揃っているか確認し、勝者の有無を確認する。
	// 勝者がいる→true
	public boolean checkLine() {
		for (int i = 0; i < 8; i++) {
			if (lines[i].judgeWinner()) {
				return true;
			}
		}
		return false;
	}

	// Square型の
	public void setMark(int x, int y, Mark mark) {
		squares[x - 1][y - 1].setMark(mark);
	}

	// Tictactoaから呼び出す。やつ
	public Square getSquare(int x, int y) {

		return squares[x - 1][y - 1];
	}

	// 盤面を表示する
	// ---------
	// | | | |
	// ---------
	// | | | |
	// ---------
	// | | | |
	// ---------
	// getSquare()ってシーケンス図に書いてあるけど、getMark();を使いました合ってる？
	public void showBoard() {

		System.out.println("-------");
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				// １マスずつマークを取得。オブジェクトを上記２次元配列で指定する。
				// これ座標指定の情報足りてる？getSquare で出して、オブジェクトから座標を入れ替える必要はあるか。
				Mark mark = squares[i-1][j-1].getMark();
				if (mark == Mark.CIRCLE) {
					System.out.print("|");
					System.out.print("○");
				} else if (mark == Mark.CROSS) {
					System.out.print("|");
					System.out.print("×");
				} else { // NONEの場合
					System.out.print("|");
					System.out.print(" ");
				}
				
			}
			System.out.println("|");
			System.out.println("-------");
		}
	}

	// 全てのマスが埋まっているかどうかの確認
	// getSquare();メソッドの指定だけど、canPlace()メソッドを利用した。
	// canPlace→空いてたら(null)でtrueを返す。
	public boolean isFull() {
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if (squares[i - 1][j - 1].canPlace()) {
					return false; // breakしなくてよい？ここで止まるかな
				}
			}
		}
		return true;
	}

}