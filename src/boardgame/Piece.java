package boardgame;

public class Piece {
	
	protected Position position; //Cada peca tem sua posicao
	private Board board;         //Cada peca tem apenas um tabuleiro
	
	
	//Quando tiver instanciando a peca eu tenho que dizer qual e o tabuleiro e a posicao inicial
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	
	//Retorna o tabuleiro da peca
	protected Board getBoard() {
		return board;
	}
	
}
