package tictactoe;

public class Turn {
	
	private Player player;

	private Board board;
	
	private int x;
	private int y;
	
	
	public Turn(Player player) {
		this.player = player;
	}

	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public void setMark() {
		board.setMark(x,y,player.getMark());
	}

	public int[] requestXY(Board board) {
		this.board = board;
		int[] a ;
		while(true){
			a = player.setXY();
			this.x = a[0];
			this.y = a[1];
			if(board.canInput(x,y) == true) {
				break;
			}else if(1<=x && x<=3 && 1<=y && y<=3){
				System.out.println("すでに置かれています");
			}
		}
		return a;
	}
	
}
