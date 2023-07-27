package pieces;

import enums.Color;

import java.awt.*;

public class Rook extends Piece {


    public Rook(int pozX, int pozY, Color color, Image image) {
        super(pozX, pozY, color, image);
    }


    public Rook(Color color, Image image) {
        super(color, image);
    }

    @Override
    public void remove() {

    }

    @Override
    public void getLegalMoves() {

    }
}
