package GUI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import javax.swing.*;


public class ChessGUI {

    private static final Logger logger = LoggerFactory.getLogger(ChessGUI.class);
    public static JFrame frame= new JFrame();

    BoardGUI position;

    public ChessGUI(BoardGUI boardGUI) {
        this.position = boardGUI;
    }

    public void generateBoard(){
        logger.debug("Creating chess board...");

        frame.setBounds(600,200,655,678);
        frame.add(position);

    }
    public void createInteractiveEnvironment(){
        CustomMouseListener listener = new CustomMouseListener(position,frame);
        frame.addMouseListener(listener);
        frame.addMouseMotionListener(listener);
    }
    public void showBoard() throws InterruptedException {
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
//        Thread.sleep(5000);
//        position.getPieces().remove(4);
//        position.repaint();

    }

}
