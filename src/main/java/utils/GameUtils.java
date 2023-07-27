package utils;

import components.Board;
import components.Square;
import enums.Color;
import pieces.*;

public class GameUtils {

    public static Board generateBoardFromFenPosition(String fen){
        Square[][] squaresOnBoard = new Square[9][9];
        int indexLine = 1;
        int indexColumn = 1;
        for (int i=0; i<fen.length();i++){
            char symbol = fen.charAt(i);
            if (symbol == '/'){
                indexColumn = 1;
                indexLine += 1;
                continue;
            }
            if (Character.isDigit(symbol)){
                int symbolValue = symbol - '0';
                for(int j=0 ;j<symbolValue; j++) {
                    squaresOnBoard[indexLine][indexColumn] = new Square(false);
                    indexColumn += 1;
                }

                continue;
            }
            Piece pieceToPlace = generatePiece(symbol);
            pieceToPlace.setLine(indexLine);
            pieceToPlace.setColumn(indexColumn);
            squaresOnBoard[indexLine][indexColumn] = new Square(true,pieceToPlace);
            indexColumn += 1;

        }
        return new Board(squaresOnBoard);
    }
    private static Piece generatePiece(char pieceSymbol){
        if (pieceSymbol == 'q')
            return new Queen(Color.BLACK,PiecesImageUtils.getBlackQueenImage());
        if  (pieceSymbol == 'Q')
            return new Queen(Color.WHITE,PiecesImageUtils.getWhiteQueenImage());
        if (pieceSymbol == 'k')
            return new King(Color.BLACK, PiecesImageUtils.getBlackKingImage());
        if (pieceSymbol == 'K')
            return new King(Color.WHITE, PiecesImageUtils.getWhiteKingImage());
        if (pieceSymbol == 'p')
            return new Pawn(Color.BLACK, PiecesImageUtils.getBlackPawnImage());
        if (pieceSymbol == 'P')
            return new Pawn(Color.WHITE, PiecesImageUtils.getWhitePawnImage());
        if (pieceSymbol == 'r')
            return new Rook(Color.BLACK, PiecesImageUtils.getBlackRookImage());
        if (pieceSymbol == 'R')
            return new Rook(Color.WHITE, PiecesImageUtils.getWhiteRookImage());
        if (pieceSymbol == 'n')
            return new Knight(Color.BLACK, PiecesImageUtils.getBlackKnightImage());
        if (pieceSymbol == 'N')
            return new Knight(Color.WHITE, PiecesImageUtils.getWhiteKnightImage());
        if (pieceSymbol == 'b')
            return new Bishop(Color.BLACK, PiecesImageUtils.getBlackBishopImage());
        return new Bishop(Color.WHITE, PiecesImageUtils.getWhiteBishopImage());




    }

}
