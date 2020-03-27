package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece{
	
	
	private Color color;

	//Cada pe�a de xadrez possui um tabuleiro e uma cor
	//Ela chama o construtor do super para liga-la a um objeto board ja existente
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	//Acessa a cor da peca de xadrez
	public Color getColor() {
		return color;
	}


	
	
	
}
