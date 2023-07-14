package utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class BoardUtils {
    private static final Logger logger = LoggerFactory.getLogger(BoardUtils.class);
    public static HashMap<String, Image> getPiecesMap() {
        logger.debug("Generating pieces...");
        HashMap<String,Image> pieces = new HashMap<>();
        BufferedImage originalImage = getOriginalImage("src/main/resources/ChessPieces.png");
        pieces.put("whiteKing", originalImage.getSubimage(0,0,200,200).getScaledInstance(80,80,BufferedImage.SCALE_SMOOTH));
        pieces.put("whiteQueen", originalImage.getSubimage(200,0,200,200).getScaledInstance(80,80,BufferedImage.SCALE_SMOOTH));
        pieces.put("whiteBishop", originalImage.getSubimage(400,0,200,200).getScaledInstance(80,80,BufferedImage.SCALE_SMOOTH));
        pieces.put("whiteKnight", originalImage.getSubimage(600,0,200,200).getScaledInstance(80,80,BufferedImage.SCALE_SMOOTH));
        pieces.put("whiteRook", originalImage.getSubimage(800,0,200,200).getScaledInstance(80,80,BufferedImage.SCALE_SMOOTH));
        pieces.put("whitePawn", originalImage.getSubimage(1000,0,200,200).getScaledInstance(80,80,BufferedImage.SCALE_SMOOTH));
        pieces.put("blackKing", originalImage.getSubimage(0,200,200,200).getScaledInstance(80,80,BufferedImage.SCALE_SMOOTH));
        pieces.put("blackQueen", originalImage.getSubimage(200,200,200,200).getScaledInstance(80,80,BufferedImage.SCALE_SMOOTH));
        pieces.put("blackBishop", originalImage.getSubimage(400,200,200,200).getScaledInstance(80,80,BufferedImage.SCALE_SMOOTH));
        pieces.put("blackKnight", originalImage.getSubimage(600,200,200,200).getScaledInstance(80,80,BufferedImage.SCALE_SMOOTH));
        pieces.put("blackRook", originalImage.getSubimage(800,200,200,200).getScaledInstance(80,80,BufferedImage.SCALE_SMOOTH));
        pieces.put("blackPawn", originalImage.getSubimage(1000,200,200,200).getScaledInstance(80,80,BufferedImage.SCALE_SMOOTH));

        return pieces;

    }
    public static HashMap<Character, Integer> getPositionsMap(){
        HashMap<Character, Integer> positionsMap = new HashMap<>();
        positionsMap.put('a', 0);
        positionsMap.put('b', 80);
        positionsMap.put('c', 160);
        positionsMap.put('d', 240);
        positionsMap.put('e', 320);
        positionsMap.put('f', 400);
        positionsMap.put('g', 480);
        positionsMap.put('h', 560);
        positionsMap.put('1', 560);
        positionsMap.put('2', 480);
        positionsMap.put('3', 400);
        positionsMap.put('4', 320);
        positionsMap.put('5', 240);
        positionsMap.put('6', 260);
        positionsMap.put('7', 80);
        positionsMap.put('8', 0);
        return positionsMap;
    }

    private static BufferedImage getOriginalImage(String path){
        try {
            return ImageIO.read( new File(path));
        } catch (IOException e) {
            logger.error("Error while reading the pieces image!");
            throw new RuntimeException(e);
        }

    }
}
