package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		Scanner scan = new Scanner(System.in);
		
		
		while (true) {
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.print("Origem: ");
			ChessPosition source = UI.readChessPosition(scan);
			
			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(scan);
			
			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
			System.out.println(capturedPiece);
			
			
		}
	
		
		
		
	}

}
