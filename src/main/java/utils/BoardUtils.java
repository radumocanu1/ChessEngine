package utils;

import enums.Color;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pieces.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BoardUtils {
    private static final Logger logger = LoggerFactory.getLogger(BoardUtils.class);
    public static List<Piece> getPiecesList() {
        logger.debug("Generating pieces...");
        List<Piece> pieces = new ArrayList<>();
        HashMap<Character,Integer> positions = getPositionsMap();
        BufferedImage originalImage = getOriginalImage("src/main/resources/ChessPieces.png");
        pieces.add(new King(positions.get('e'),positions.get('1'),Color.WHITE,originalImage.getSubimage(0,0,200,200).getScaledInstance(80,80,BufferedImage.SCALE_SMOOTH)));
        pieces.add(new King(positions.get('e'),positions.get('8'),Color.BLACK,originalImage.getSubimage(0,200,200,200).getScaledInstance(80,80,BufferedImage.SCALE_SMOOTH)));
        pieces.add(new Queen(positions.get('d'),positions.get('1'),Color.WHITE,originalImage.getSubimage(200,0,200,200).getScaledInstance(80,80,BufferedImage.SCALE_SMOOTH)));
        pieces.add(new Queen(positions.get('d'),positions.get('8'),Color.BLACK,originalImage.getSubimage(200,200,200,200).getScaledInstance(80,80,BufferedImage.SCALE_SMOOTH)));
        pieces.add(new Bishop(positions.get('c'),positions.get('1'),Color.WHITE,originalImage.getSubimage(400,0,200,200).getScaledInstance(80,80,BufferedImage.SCALE_SMOOTH)));
        pieces.add(new Bishop(positions.get('f'),positions.get('1'),Color.WHITE,originalImage.getSubimage(400,0,200,200).getScaledInstance(80,80,BufferedImage.SCALE_SMOOTH)));
        pieces.add(new Bishop(positions.get('c'),positions.get('8'),Color.BLACK,originalImage.getSubimage(400,200,200,200).getScaledInstance(80,80,BufferedImage.SCALE_SMOOTH)));
        pieces.add(new Bishop(positions.get('f'),positions.get('8'),Color.BLACK,originalImage.getSubimage(400,200,200,200).getScaledInstance(80,80,BufferedImage.SCALE_SMOOTH)));
        pieces.add(new Knight(positions.get('b'),positions.get('1'),Color.WHITE,originalImage.getSubimage(600,0,200,200).getScaledInstance(80,80,BufferedImage.SCALE_SMOOTH)));
        pieces.add(new Knight(positions.get('g'),positions.get('1'),Color.WHITE,originalImage.getSubimage(600,0,200,200).getScaledInstance(80,80,BufferedImage.SCALE_SMOOTH)));
        pieces.add(new Knight(positions.get('b'),positions.get('8'),Color.BLACK,originalImage.getSubimage(600,200,200,200).getScaledInstance(80,80,BufferedImage.SCALE_SMOOTH)));
        pieces.add(new Knight(positions.get('g'),positions.get('8'),Color.BLACK,originalImage.getSubimage(600,200,200,200).getScaledInstance(80,80,BufferedImage.SCALE_SMOOTH)));
        pieces.add(new Rook(positions.get('a'),positions.get('1'),Color.WHITE,originalImage.getSubimage(800,0,200,200).getScaledInstance(80,80,BufferedImage.SCALE_SMOOTH)));
        pieces.add(new Rook(positions.get('h'),positions.get('1'),Color.WHITE,originalImage.getSubimage(800,0,200,200).getScaledInstance(80,80,BufferedImage.SCALE_SMOOTH)));
        pieces.add(new Rook(positions.get('a'),positions.get('8'),Color.BLACK,originalImage.getSubimage(800,200,200,200).getScaledInstance(80,80,BufferedImage.SCALE_SMOOTH)));
        pieces.add(new Rook(positions.get('h'),positions.get('8'),Color.BLACK,originalImage.getSubimage(800,200,200,200).getScaledInstance(80,80,BufferedImage.SCALE_SMOOTH)));
        for (Character letter : List.of('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h')){
            pieces.add(new Pawn(positions.get(letter), positions.get('2'), Color.WHITE, originalImage.getSubimage(1000,0,200,200).getScaledInstance(80,80,BufferedImage.SCALE_SMOOTH)));
        }
        for (Character letter : List.of('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h')){
            pieces.add(new Pawn(positions.get(letter), positions.get('7'), Color.BLACK, originalImage.getSubimage(1000,200,200,200).getScaledInstance(80,80,BufferedImage.SCALE_SMOOTH)));
        }



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

    public static Character convertFileNumberToCharacter (int file){
        if (file == 0)
            return 'a';
        if (file == 1)
            return 'b';
        if (file == 2)
            return 'c';
        if (file == 3)
            return 'd';
        if (file == 4)
            return 'e';
        if (file == 5)
            return 'f';
        if (file == 6)
            return 'g';
        if (file == 7)
            return 'h';
        return null;
    }
}
