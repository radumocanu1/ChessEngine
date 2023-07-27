package GUI;

import components.Square;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pieces.Piece;


import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.List;


public class CustomMouseListener implements MouseListener, MouseMotionListener {

    private static final Logger logger = LoggerFactory.getLogger(CustomMouseListener.class);

    BoardGUI boardGUI;

    Piece movingPiece;

    Square initialSquare;

    Square targetSquare;

    int initialX;

    int initialY;

    JFrame frame;

    public CustomMouseListener(BoardGUI position, JFrame frame) {
        this.boardGUI = position;
        this.frame = frame;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        movingPiece = getPieceOnClickedSquare(e.getY(),e.getX());
        if (movingPiece == null)
            logger.debug("There is no piece on the clicked square");
        else{
            initialX = movingPiece.getLine();
            initialY = movingPiece.getColumn();
        }



    }

    @Override
    public void mouseReleased(MouseEvent e) {
//        if (checkIfItIsLegalMove((e.getX()/80) * 80, (e.getY()/80) *80))
//            movingPiece.move(e.getX()/80, e.getY()/80);
//        else
//            revertMove(movingPiece,initialX,initialY);
//        frame.repaint();
//        movingPiece = null;
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (movingPiece!=null){
            movingPiece.setLine(e.getY()+1) ;
            movingPiece.setColumn(e.getX()+1);
            frame.repaint();
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    private Piece getPieceOnClickedSquare(int x, int y){
        int line = (x/80) + 1;
        int column = (y/80) + 1;
        initialSquare = boardGUI.getBoard().getChessTableSquares()[line][column];
        if (initialSquare.HasPiece())
            return initialSquare.getPiece();
        return null;
    }

//    private boolean checkIfItIsLegalMove(int x, int y){
//        List<Piece> pieces = position.getPieces();
//        for (Piece piece : pieces){
//            if (piece.getPozX() == x && piece.getPozY() == y)
//                if (movingPiece.getColor() == piece.getColor())
//                {
//                    logger.debug("Can't capture piece of same color!");
//                    return false;
//                }
//                else{
//                    pieces.remove(piece);
//                    return true;
//                }
//
//
//
//        }
//        return true;
//    }
//
//    private void revertMove(Piece piece, int x, int y){
//        piece.setPozX(x);
//        piece.setPozY(y);
//    }
}