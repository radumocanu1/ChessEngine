package components;

import java.util.Map;

public class Board {
    Square[][] chessTableSquares = new Square[9][9];

    public Board() {
    }

    public Board(Square[][] chessTableSquares) {
        this.chessTableSquares = chessTableSquares;
    }

    public Square[][] getChessTableSquares() {
        return chessTableSquares;
    }

    public void setChessTableSquares(Square[][] chessTableSquares) {
        this.chessTableSquares = chessTableSquares;
    }
}
