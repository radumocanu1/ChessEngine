package components;

import pieces.Piece;


public class Square {
    Piece piece;

    boolean hasPiece;

    public Square(boolean hasPiece) {
        this.hasPiece = hasPiece;
    }

    public Square(boolean hasPiece, Piece piece) {
        this.piece = piece;
        this.hasPiece = hasPiece;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public boolean HasPiece() {
        return hasPiece;
    }

    public void setHasPiece(boolean hasPiece) {
        this.hasPiece = hasPiece;
    }
}
