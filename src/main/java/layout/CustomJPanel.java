package layout;

import javax.swing.*;
import java.awt.*;

import java.util.HashMap;
import java.util.Map;

public class CustomJPanel extends JPanel {
    HashMap<String, Image> pieces;
    Map<Character, Integer> positions;

    public CustomJPanel(HashMap<String, Image> pieces, Map<Character, Integer> positions) {
        this.pieces = pieces;
        this.positions = positions;
    }

    @Override
    public void paint(Graphics g){

        boolean white = true;
        for (int i=0 ; i<8;i++){
            for (int j=0; j<8;j++){
                if (white){
                    g.setColor(new Color(217, 190, 150));
                }
                else{
                    g.setColor(new Color(125, 99, 49));

                }
                g.fillRect(i*80, j*80, 80 ,80 );
                white ^= true;
            }
            white ^= true;
        }
        g.drawImage(pieces.get("whiteRook"),positions.get('a'),positions.get('1'),this);
        g.drawImage(pieces.get("whiteKnight"),positions.get('b'),positions.get('1'),this);
        g.drawImage(pieces.get("whiteBishop"),positions.get('c'),positions.get('1'),this);
        g.drawImage(pieces.get("whiteQueen"),positions.get('d'),positions.get('1'),this);
        g.drawImage(pieces.get("whiteKing"),positions.get('e'),positions.get('1'),this);
        g.drawImage(pieces.get("whiteBishop"),positions.get('f'),positions.get('1'),this);
        g.drawImage(pieces.get("whiteKnight"),positions.get('g'),positions.get('1'),this);
        g.drawImage(pieces.get("whiteRook"),positions.get('h'),positions.get('1'),this);
        g.drawImage(pieces.get("whitePawn"),positions.get('a'),positions.get('2'),this);
        g.drawImage(pieces.get("whitePawn"),positions.get('b'),positions.get('2'),this);
        g.drawImage(pieces.get("whitePawn"),positions.get('c'),positions.get('2'),this);
        g.drawImage(pieces.get("whitePawn"),positions.get('d'),positions.get('2'),this);
        g.drawImage(pieces.get("whitePawn"),positions.get('e'),positions.get('2'),this);
        g.drawImage(pieces.get("whitePawn"),positions.get('f'),positions.get('2'),this);
        g.drawImage(pieces.get("whitePawn"),positions.get('g'),positions.get('2'),this);
        g.drawImage(pieces.get("whitePawn"),positions.get('h'),positions.get('2'),this);
        g.drawImage(pieces.get("blackRook"),positions.get('a'),positions.get('8'),this);
        g.drawImage(pieces.get("blackKnight"),positions.get('b'),positions.get('8'),this);
        g.drawImage(pieces.get("blackBishop"),positions.get('c'),positions.get('8'),this);
        g.drawImage(pieces.get("blackQueen"),positions.get('d'),positions.get('8'),this);
        g.drawImage(pieces.get("blackKing"),positions.get('e'),positions.get('8'),this);
        g.drawImage(pieces.get("blackBishop"),positions.get('f'),positions.get('8'),this);
        g.drawImage(pieces.get("blackKnight"),positions.get('g'),positions.get('8'),this);
        g.drawImage(pieces.get("blackRook"),positions.get('h'),positions.get('8'),this);
        g.drawImage(pieces.get("blackPawn"),positions.get('a'),positions.get('7'),this);
        g.drawImage(pieces.get("blackPawn"),positions.get('b'),positions.get('7'),this);
        g.drawImage(pieces.get("blackPawn"),positions.get('c'),positions.get('7'),this);
        g.drawImage(pieces.get("blackPawn"),positions.get('d'),positions.get('7'),this);
        g.drawImage(pieces.get("blackPawn"),positions.get('e'),positions.get('7'),this);
        g.drawImage(pieces.get("blackPawn"),positions.get('f'),positions.get('7'),this);
        g.drawImage(pieces.get("blackPawn"),positions.get('g'),positions.get('7'),this);
        g.drawImage(pieces.get("blackPawn"),positions.get('h'),positions.get('7'),this);

    }


}
