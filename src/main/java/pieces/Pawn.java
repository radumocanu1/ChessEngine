package pieces;

import enums.Color;

import java.awt.*;

public class Pawn extends Piece {


    public Pawn(int pozX, int pozY, Color color, Image image) {
        super(pozX, pozY, color, image);
    }

    public Pawn(Color color, Image image) {
        super(color, image);
    }

    @Override
    public void remove() {

    }

    @Override
    public void getLegalMoves() {

    }
}
