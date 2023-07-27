package pieces;

import enums.Color;
import lombok.RequiredArgsConstructor;

import java.awt.*;


public class Queen extends Piece {


    public Queen(int pozX, int pozY, Color color, Image image) {
        super(pozX, pozY, color, image);
    }

    public Queen(Color color, Image image) {
        super(color, image);
    }


    @Override
    public void remove() {

    }

    @Override
    public void getLegalMoves() {

    }
}
