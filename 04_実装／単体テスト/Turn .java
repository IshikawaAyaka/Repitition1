

public class Turn {
	
	private Player player;

	private Board board;
	
	
	public Turn(Player player) {
		this.player = player;
	}

	public void setMark() {
		
		board.setMark(player.getMark());

	}

	public int[] requestXY(Board board) {
		int X;
		int Y;
		this.board = board;
		
		int[] a ;
		
		while(true){
			 a = player.setXY();
			X = a[0];
			Y = a[1];
			if(board.canInput(X,Y) == true) {
				break;
			}else {
				System.out.println("Šù‚É’u‚©‚ê‚Ä‚¢‚Ü‚·");
			}
		}
		
		
		return a;
	}


}
