package graphics.blocks;

import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class AbstractBlockImage {
    private final BufferedImage image;
    private final static int width = 16;
    private final static int height = 16;
    private final static int borderWidth = 2;

    public AbstractBlockImage(BufferedImage image) {
        this.image = image;
    }

    public AbstractBlockImage(Color baseColor, Color borderColor) {
        image = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);
        for(int x = 0; x < width; x++) {
            for(int y = 0; y < height; y++) {
                if(x < borderWidth || x >= width - borderWidth || y < borderWidth || y >= height - borderWidth) {
                    image.setRGB(x, y, borderColor.getRGB());
                } else {
                    image.setRGB(x, y, baseColor.getRGB());
                }
            }
        }
    }

    public BufferedImage getImage() {
        return image;
    }

    public static int getWidth() {
        return width;
    }

    public static int getHeight() {
        return height;
    }
}
