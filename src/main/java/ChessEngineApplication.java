import GUI.ChessGUI;
import GUI.BoardGUI;
import lombok.extern.slf4j.Slf4j;
import pieces.Piece;
import utils.BoardUtils;
import utils.GameUtils;

import java.util.HashMap;
import java.util.List;

@Slf4j
public class ChessEngineApplication {

    public static void main(String[] args) throws InterruptedException {
        log.info("Chess engine starting...");
        List<Piece> pieces = BoardUtils.getPiecesList();
        HashMap<Character, Integer> positions = BoardUtils.getPositionsMap();
        ChessGUI chessGUI = new ChessGUI(new BoardGUI(GameUtils.generateBoardFromFenPosition("rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR"),80));
        chessGUI.generateBoard();
        chessGUI.showBoard();
        chessGUI.createInteractiveEnvironment();


    }
}
