package boardgame;

public abstract class Piece {
	
	protected Position position; //Cada peca tem seu objeto posicao
	private Board board;         //Cada peca terá apenas um tabuleiro (o mesmo objeto board)
	
	
	//Quando tiver instanciando a PECA GENERICA eu tenho que dizer qual e o tabuleiro
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	
	//Retorna o tabuleiro da peca
	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i=0; i<mat.length; i++) {
			for (int j=0;j<mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
