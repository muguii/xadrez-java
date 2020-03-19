package boardgame;

public class Board {
	
	private int rows;     //Tabuleiro possui linhas e
	private int columns;  //colunas
	private Piece[][] pieces;  //E possui uma matriz de pecas
	
	//Instaciando um tabuleiro eu preciso do numero de linhas e colunas do mesmo, e crio a matriz de
	//pecas com base no tabuleiro
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
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
	
	// Retorna a peca na matriz 
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	//Retorna a posicao da peca na matriz
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
}
