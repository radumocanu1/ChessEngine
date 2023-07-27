package GUI;

import components.Board;
import components.Square;
import lombok.AllArgsConstructor;
import lombok.Getter;
import pieces.Piece;

import javax.swing.*;
import java.awt.*;

@Getter
@AllArgsConstructor
public class BoardGUI extends JPanel {
    Board board;

    int oneSquareSide;

    public BoardGUI(Board board) {
        this.board = board;
    }

    @Override
    public void paint(Graphics g) {

        drawTable(g);
        drawPieces(g);

    }
    private void drawTable(Graphics g){
        boolean WHITE = true;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (WHITE) {
                    g.setColor(new Color(217, 190, 150));
                } else {
                    g.setColor(new Color(125, 99, 49));

                }
                g.fillRect(i * 80, j * 80, 80, 80);
                WHITE ^= true;
            }
            WHITE ^= true;
        }
    }
    private void drawPieces(Graphics g){
        Square[][] squaresOnBoard = board.getChessTableSquares();
        for (int i = 1; i<=8;i++)
            for (int j=1;j<=8;j++){
                if (squaresOnBoard[i][j].HasPiece())
                {
                    Piece pieceOnCurrentSquare = squaresOnBoard[i][j].getPiece();
                    g.drawImage(pieceOnCurrentSquare.getImage(),pieceOnCurrentSquare.getX(),pieceOnCurrentSquare.getY(),this);
                }

        }
    }


}
