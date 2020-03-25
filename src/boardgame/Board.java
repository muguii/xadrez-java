package boardgame;

public class Board {

	private int rows; // Quantidade de linhas do tabuleiro
	private int columns; // Quantidade de colunas do tabuleiro
	private Piece[][] pieces; // Declarando uma matriz que ira conter um objeto PIECE em cada elemento da matriz

	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns]; // Cria minha matriz de PECAS GENERICAS
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	// Retorna o OBJETO PEÇA que contem dada linha e coluna
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}

	// Retorna o OBJETO PEÇA dado uma POSIÇAO INTERNA desse objeto
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}

	public void placePiece(Piece piece, Position position) {
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}

}
