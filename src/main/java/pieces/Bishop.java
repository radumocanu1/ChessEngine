package pieces;

import enums.Color;

import java.awt.*;

public class Bishop extends Piece{


    public Bishop(int pozX, int pozY, Color color, Image image) {
        super(pozX, pozY, color, image);
    }

    public Bishop(Color color, Image image) {
        super(color, image);
    }

    @Override
    public void remove() {

    }

    @Override
    public void getLegalMoves() {

    }
}
