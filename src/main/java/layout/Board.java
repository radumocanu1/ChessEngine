package layout;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;


public class Board{

    private static final Logger logger = LoggerFactory.getLogger(Board.class);
    public static JFrame frame= new JFrame();

    public static void createBoard(HashMap<String, Image> pieces, HashMap<Character, Integer> positions){
        logger.debug("Creating chess board...");

        frame.setBounds(600,200,655,678);
        frame.add(new CustomJPanel(pieces,positions));

    }
    public  static void showBoard(){
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
