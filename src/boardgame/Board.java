package boardgame;

public class Board {

	private int rows; // Quantidade de linhas do tabuleiro
	private int columns; // Quantidade de colunas do tabuleiro
	private Piece[][] pieces; // Declarando uma matriz que ira conter um objeto PIECE em cada elemento da matriz

	public Board(int rows, int columns) {
		if (rows < 1 || columns < 1) {
			throw new BoardException("Error na criação do tabuleiro: É necessário pelo menos uma linhas e uma coluna.");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns]; // Cria minha matriz de PECAS GENERICAS
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	// Retorna o OBJETO PEÇA que contem dada linha e coluna
	public Piece piece(int row, int column) {
		if (!positionExists(row, column)) {
			throw new BoardException("Posição não existe no tabuleiro");
		}
		return pieces[row][column];
	}

	// Retorna o OBJETO PEÇA dado uma POSIÇAO INTERNA desse objeto
	public Piece piece(Position position) {
		if (!positionExists(position.getRow(), position.getColumn())) {
			throw new BoardException("Posição não existe no tabuleiro");
		}
		return pieces[position.getRow()][position.getColumn()];
	}

	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("Já tem uma peça nessa posição " + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}
	
	//Ainda nao sei onde vai ser usado
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Posição não existe no tabuleiro");
		}
		return piece(position) != null;
	}

}
