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
    //������Ҫ����ķ���
    private Tetromino currentOne = Tetromino.randomOne();
    //����������Ҫ����ķ���
    private Tetromino nextOne = Tetromino.randomOne();
    //������Ϸ��Ҫ����
    private Cell[][] wall = new Cell[18][9];
    //������Ԫ���ֵΪ48����
    private static final int CELL_SIZE=48;
    //���뷽��ͼƬ
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

        //������Ϸ������
        paintWall(g);
    }
*/
    @Override
    public void paint(Graphics g) {
        g.drawImage(backImage,0,0,null);

        //������Ϸ������
        paintWall(g);
    }

    private void paintWall(Graphics g) {
        for (int i = 0;i < wall.length;i++){
            for(int j=0;j <wall[i].length;j++){
                int x = i*CELL_SIZE;
                int y = j*CELL_SIZE;
                Cell cell = wall[i][j];
                //�ж���f����С���飬���û�л��ƾ��Σ�����С����Ƕ�뵽ǽ��
                if(cell == null){
                    g.drawRect(x,y,CELL_SIZE,CELL_SIZE);
                }else {
                    g.drawImage(cell.getImage(),x,y,null);

                }
            }
        }
    }

    public static void main(String[] args) {
        //����һ�����ڶ���
        JFrame frame = new JFrame("ѼѼ����");
        //������Ϸ����
        Tetris panel = new Tetris();
        //�����Ƕ�뵽������
        frame.add(panel);
        //���ÿɼ�
        frame.setVisible(true);
        //���ô��ڿɼ�
        frame.setSize(810,940);
        //���ô��ھ���
        frame.setLocationRelativeTo(null);
        //���ô��ڹرգ�����ֹͣ���ҹر�
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
