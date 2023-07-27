package pieces;

import enums.Color;

import java.awt.*;

public class King extends Piece{


    public King(int pozX, int pozY, Color color, Image image) {
        super(pozX, pozY, color, image);
    }

    public King(Color color, Image image) {
        super(color, image);
    }

    @Override
    public void remove() {

    }

    @Override
    public void getLegalMoves() {

    }
}
