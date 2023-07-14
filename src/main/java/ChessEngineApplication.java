import layout.Board;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.BoardUtils;

import java.awt.*;
import java.io.IOException;
import java.util.HashMap;

public class ChessEngineApplication {

    private static final Logger logger = LoggerFactory.getLogger(ChessEngineApplication.class);
    public static void main(String[] args) throws IOException {
        logger.info("Chess engine starting...");
        HashMap<String, Image> pieces = BoardUtils.getPiecesMap();
        HashMap<Character, Integer> positions = BoardUtils.getPositionsMap();
        Board.createBoard(pieces,positions);
       // Board.reverseFrame();
        Board.showBoard();


    }
}
