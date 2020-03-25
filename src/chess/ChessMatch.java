package chess;

import boardgame.Board;

public class ChessMatch {
	
	private Board board;
	
	//Crio um objeto board de 8 linhas e 8 colunas e crio a matriz de PEÇAS GENERICAS[8][8]
	//Essa matriz esta salva dentro deste objeto board criado
	
	public ChessMatch() {
		board = new Board(8,8);
	}
	
	//Tenho que criar uma matriz de PECAS DE XADREZ igual a matriz de PECAS GENERICAS. PORQUE?
	//Pq nao quero que o programa enxergue a PECA GENERICA, é para enxergar apenas as PECAS DE XADREZ
	//Pois sao camadas diferentes, assim fica mais seguro e etc
	
	//Converto a matriz de PEÇAS GENERICAS criada anteriormente em uma matriz de PEÇAS DE XADREZ
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
