package demo1;

import IJLSTZO.*;

/*
* ��д�ķ���ĸ���
* ���ԣ�Cell�������ڴ����ĸ�С����
* ����������һ��������һ������һ�񣬱���
*
* */
public class Tetromino {
    protected Cell[] cells = new Cell[4];

    //��д���Ʒ���
    public void moveLeft(){
        for (Cell cell:cells){
            cell.left();
        }
    }
    //��д���Ʒ���
    public void moveRight(){
        for (Cell cell:cells){
            cell.right();
        }
    }
    public void softDrop(){
        for (Cell cell:cells){
            cell.drop();
        }
    }
    //��д��������ķ���ķ���
    public  static  Tetromino randomOne(){
        int num =(int) (Math.random()*7);
        Tetromino tetromino = null;
        switch (num){
            case 0: tetromino = new I();
                break;
            case 1: tetromino = new T();
                break;
            case 2: tetromino = new Z();
                break;
            case 3: tetromino = new S();
                break;
            case 4: tetromino = new O();
                break;
            case 5: tetromino = new J();
                break;
            case 6: tetromino = new L();
                break;
        }
        return tetromino;
    }
}
