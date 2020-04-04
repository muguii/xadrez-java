package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public  abstract class ChessPiece extends Piece{
	
	
	private Color color;
	private int moveCount;

	//Cada peça de xadrez possui um tabuleiro e uma cor
	//Ele chama o construtor do super para liga-la a um objeto board ja existente
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	//Acessa a cor da peca de xadrez
	public Color getColor() {
		return color;
	}
	
	public int getMoveCount() {
		return moveCount;
	}
	
	public void increaseMoveCount() {
		moveCount++;
	}
	
	public void decreaseMoveCount() {
		moveCount--;
	}

	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p != null && p.getColor() != color;
	}
	
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}
	
}
