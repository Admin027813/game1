package demo1;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Tetris extends JPanel {
    //声明正要下落的方块
    private Tetromino currentOne = Tetromino.randomOne();
    //声明接下来要下落的方块
    private Tetromino nextOne = Tetromino.randomOne();
    //声明游戏主要区域
    private Cell[][] wall = new Cell[18][9];
    //声明单元格的值为48像素
    private static final int CELL_SIZE=48;
    //载入方块图片
    public static BufferedImage I;
    public static BufferedImage J;
    public static BufferedImage L;
    public static BufferedImage O;
    public static BufferedImage S;
    public static BufferedImage T;
    public static BufferedImage Z;
    public static BufferedImage backImage;
    static {
        try {
            I = ImageIO.read(new File("images/I.png"));
            J = ImageIO.read(new File("images/I.png"));
            L = ImageIO.read(new File("images/I.png"));
            O = ImageIO.read(new File("images/I.png"));
            S = ImageIO.read(new File("images/I.png"));
            T = ImageIO.read(new File("images/I.png"));
            Z = ImageIO.read(new File("images/I.png"));
            backImage= ImageIO.read(new File("images/back.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   // @Override
   /* public void print(Graphics g) {
        g.drawImage(backImage,0,0,null);

        //绘制游戏主区域
        paintWall(g);
    }
*/
    @Override
    public void paint(Graphics g) {
        g.drawImage(backImage,0,0,null);

        //绘制游戏主区域
        paintWall(g);
    }

    private void paintWall(Graphics g) {
        for (int i = 0;i < wall.length;i++){
            for(int j=0;j <wall[i].length;j++){
                int x = i*CELL_SIZE;
                int y = j*CELL_SIZE;
                Cell cell = wall[i][j];
                //判断是f否有小方块，如果没有绘制矩形，否则将小方块嵌入到墙中
                if(cell == null){
                    g.drawRect(x,y,CELL_SIZE,CELL_SIZE);
                }else {
                    g.drawImage(cell.getImage(),x,y,null);

                }
            }
        }
    }

    public static void main(String[] args) {
        //创建一个窗口对象
        JFrame frame = new JFrame("鸭鸭方块");
        //创建游戏界面
        Tetris panel = new Tetris();
        //将面板嵌入到窗口中
        frame.add(panel);
        //设置可见
        frame.setVisible(true);
        //设置窗口可见
        frame.setSize(810,940);
        //设置窗口剧中
        frame.setLocationRelativeTo(null);
        //设置窗口关闭，程序停止并且关闭
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
