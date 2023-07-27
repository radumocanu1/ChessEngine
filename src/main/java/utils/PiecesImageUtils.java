package utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PiecesImageUtils {

    private static final Logger logger = LoggerFactory.getLogger(BoardUtils.class);

    private static final BufferedImage originalImage;


    static {
        try {
            originalImage = ImageIO.read( new File("src/main/resources/ChessPieces.png"));
        } catch (IOException e) {
            logger.error("Error while reading the pieces image!");
            throw new RuntimeException(e);
        }
    }

    public static Image getBlackPawnImage(){
        return originalImage.getSubimage(1000,200,200,200).getScaledInstance(80,80,BufferedImage.SCALE_SMOOTH);
    }

    public static Image getWhitePawnImage(){
        return originalImage.getSubimage(1000,0,200,200).getScaledInstance(80,80,BufferedImage.SCALE_SMOOTH);
    }
    public static Image getWhiteKingImage(){
        return originalImage.getSubimage(0,0,200,200).getScaledInstance(80,80,BufferedImage.SCALE_SMOOTH);
    }
    public static Image getBlackKingImage(){
        return originalImage.getSubimage(0,200,200,200).getScaledInstance(80,80,BufferedImage.SCALE_SMOOTH);
    }
    public static Image getWhiteQueenImage(){
        return originalImage.getSubimage(200,0,200,200).getScaledInstance(80,80,BufferedImage.SCALE_SMOOTH);
    }
    public static Image getBlackQueenImage(){
        return originalImage.getSubimage(200,200,200,200).getScaledInstance(80,80,BufferedImage.SCALE_SMOOTH);
    }
    public static Image getWhiteRookImage(){
        return originalImage.getSubimage(800,0,200,200).getScaledInstance(80,80,BufferedImage.SCALE_SMOOTH);
    }
    public static Image getBlackRookImage(){
        return originalImage.getSubimage(800,200,200,200).getScaledInstance(80,80,BufferedImage.SCALE_SMOOTH);
    }
    public static Image  getWhiteKnightImage(){
        return originalImage.getSubimage(600,0,200,200).getScaledInstance(80,80,BufferedImage.SCALE_SMOOTH);
    }
    public static Image  getBlackKnightImage(){
        return originalImage.getSubimage(600,200,200,200).getScaledInstance(80,80,BufferedImage.SCALE_SMOOTH);
    }
    public static Image  getWhiteBishopImage(){
        return originalImage.getSubimage(400,0,200,200).getScaledInstance(80,80,BufferedImage.SCALE_SMOOTH);
    }
    public static Image  getBlackBishopImage(){
        return originalImage.getSubimage(400,200,200,200).getScaledInstance(80,80,BufferedImage.SCALE_SMOOTH);
    }

}
