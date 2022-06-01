package graphics;

import graphics.blocks.AbstractBlockImage;

import javax.swing.*;

public class MainWindow extends JFrame {
    private final int blocksSpacing = 1;
    private final int pixelWidth;
    private final int pixelHeight;
    private final int widthBlocks;
    private final int heightBlocks;

    public MainWindow(int widthBlocks, int heightBlocks){
        this.widthBlocks = widthBlocks;
        this.heightBlocks = heightBlocks;
        pixelWidth = (AbstractBlockImage.getWidth() + blocksSpacing) * widthBlocks + blocksSpacing;
        pixelHeight = (AbstractBlockImage.getHeight() + blocksSpacing) * heightBlocks + blocksSpacing;
        setTitle("Biosphere");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(pixelWidth, pixelHeight + 25);
        setLocation(40, 40);
        add(new GameField(widthBlocks, heightBlocks, dotSize));
        setVisible(true);
    }
}
