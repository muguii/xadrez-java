package boardgame;

public class Board {

	private int rows; // Quantidade de linhas do tabuleiro
	private int columns; // Quantidade de colunas do tabuleiro
	private Piece[][] pieces; // Declarando uma matriz que ira conter um objeto PIECE em cada elemento da matriz

	public Board(int rows, int columns) {
		if (rows < 1 || columns < 1) {
			throw new BoardException("Error na criacao do tabuleiro: E necessario pelo menos uma linha e uma coluna");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns]; // Cria a matriz de PECAS GENERICAS
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	// Retorna o OBJETO PEÇA que contem na matriz, dada linha e coluna
	public Piece piece(int row, int column) {
		if (!positionExists(row, column)) {
			throw new BoardException("Posicao nao existe no tabuleiro");
		}
		return pieces[row][column];
	}

	// Retorna o OBJETO PEÇA, dada uma POSIÇAO INTERNA desse objeto
	public Piece piece(Position position) {
		if (!positionExists(position.getRow(), position.getColumn())) {
			throw new BoardException("Posicao nao existe no tabuleiro");
		}
		return pieces[position.getRow()][position.getColumn()];
	}

	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("Ja tem uma peca nessa posiçao" + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	public Piece removePiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Posicao nao existe no tabuleiro");
		}
		if (piece(position) == null) {
			return null;
		}
		Piece aux = piece(position);
		aux.position = null;
		pieces[position.getRow()][position.getColumn()] = null;
		return aux;
	}
	
	
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Posicao nao existe no tabuleiro");
		}
		return piece(position) != null;
	}

}
