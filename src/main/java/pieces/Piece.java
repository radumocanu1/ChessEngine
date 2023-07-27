package pieces;

import enums.Color;
import lombok.Getter;
import lombok.Setter;

import java.awt.*;

@Getter
@Setter
public abstract class Piece implements BasicPieceOperations {
    int line;
    int column;
    //TODO separate package for GUI pieces which include x,y and Image
    int x;
    int y;
    Color color;
    Image image;


    public Piece(int line, int column, Color color, Image image) {
        this.line = line;
        this.column = column;
        this.x = line * 80;
        this.y  = column * 80;
        this.color = color;
        this.image = image;
    }

    public Piece(Color color, Image image) {
        this.color = color;
        this.image = image;
        this.x = line * 80;
        this.y  = column * 80;
    }

    public void move(int x, int y){
        line = x*80;
        column = y*80;
    }


}
