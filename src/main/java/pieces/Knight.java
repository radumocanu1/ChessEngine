package pieces;

import enums.Color;

import java.awt.*;

public class Knight extends Piece {


    public Knight(int pozX, int pozY, Color color, Image image) {
        super(pozX, pozY, color, image);
    }

    public Knight(Color color, Image image) {
        super(color, image);
    }

    @Override
    public void remove() {

    }

    @Override
    public void getLegalMoves() {

    }
}
