package chess;

import boardgame.Board;

public class ChessMatch {
	
	private Board board;
	
	//Eu instancio a minha partida de xadrez instanciando um tabuleiro de 8 linhas e 8 colunas
	//e crio a matriz de pecas de 8 linhas e 8 colunas
	public ChessMatch() {
		board = new Board(8,8);
	}
	
	//Tenho que criar uma matriz de pecas de xadrez igual a matriz de pecas genericas. PORQUE?
	//Pq nao quero que o programa enxergue a peca generica, e para enxergar apenas as pecas de xadrez
	//Pois sao camadas diferentes, assim fica mais seguro e etc
	//EU instancio minhas matriz de pecas de xadrez pegando a quantidade de linhas e colunas do meu
	//tabuleiro que eu instancio logo acima
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i=0; i<board.getRows(); i++) {
			for (int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
	
}
