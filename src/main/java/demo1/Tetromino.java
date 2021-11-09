package demo1;

import IJLSTZO.*;

/*
* 编写四方格的父类
* 属性：Cell数组用于创建四个小方格
* 方法：左移一个，右移一格，下落一格，变形
*
* */
public class Tetromino {
    protected Cell[] cells = new Cell[4];

    //编写左移方法
    public void moveLeft(){
        for (Cell cell:cells){
            cell.left();
        }
    }
    //编写右移方法
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
    //编写随机生成四方格的方法
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
