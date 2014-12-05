class CheckersMove {
	// A CheckersMove object represents a move in the game of Checkers.
	// It holds the row and column of the piece that is to be moved
	// and the row and column of the square to which it is to be moved.
	// (This class makes no guarantee that the move is legal.)
	
	// Position of piece to be moved.
	private int fromRow;
	private int fromCol;
	
	// Square it is to move to.
	private int toRow;
	private int toCol;
	
	// Constructor.  Just set the values of the instance variables.
	public CheckersMove(int r1, int c1, int r2, int c2) {
		fromRow = r1;
		fromCol = c1;
		toRow = r2;
		toCol = c2;
	}
	
	
	// Accessors
	private int getFromRow() {
		return fromRow;
	}
	
	private int getFromCol() {
		return fromCol;
	}
	
	private int getToRow() {
		return toRow;
	}
	
	private int getToCol() {
		return toCol;
	}
	
	private boolean isJump() {
		
		private int temp1 = toRow - fromRow;
		private int temp1 = toCol - fromCol;
		
		if(temp1==2||temp1==-2) {
			if(temp2==2||temp2==-2) {
				return true;
			}
		}
		return false;
	}
	
}   // end class CheckersMove.
