package boardgame;

public class Piece {
	
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
	
}
