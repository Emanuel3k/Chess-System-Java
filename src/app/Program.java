package app;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

         while (true) {
            Ui.PrintBoard(chessMatch.getPieces());
            System.out.println();
            System.out.println("Source: ");
            ChessPosition source = Ui.readChessPosition(sc);

            System.out.println();
            System.out.println("Target: ");
            ChessPosition target = Ui.readChessPosition(sc);

            ChessPiece capturedPiece = chessMatch.performeChessMove(source, target);
         }

    }
}
