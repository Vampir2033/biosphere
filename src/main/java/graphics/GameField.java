package graphics;

import graphics.blocks.AbstractBlockImage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameField extends JPanel{
    private final int blocksSpacing = 1;
    private final int widthBlocks;
    private final int heightBlocks;
    private final int pixelWidth;
    private final int pixelHeight;

    public GameField(int widthBlocks, int heightBlocks) {
        this.widthBlocks = widthBlocks;
        this.heightBlocks = heightBlocks;
        setBackground(Color.black);
    }

    public int getPixelWidth() {
        return (AbstractBlockImage.getWidth() + blocksSpacing) * widthBlocks + blocksSpacing;
    }

    public int getPixelHeight() {
        return (AbstractBlockImage.getHeight() + blocksSpacing) * heightBlocks + blocksSpacing;
    }

    public void setImage(int posX, int posY, Image image) {

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
//        grid.updateEntities();
//        for(Entity[] entities : grid.getEntitiesGrid()){
//            for(Entity entity : entities){
//                if(entity != null){
//                    g.drawImage(entity.getImage(),
//                            entity.getFlowPoint().x * DOT_SIZE,
//                            entity.getFlowPoint().y*DOT_SIZE,
//                            this);
//                }
//            }
//        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
