package IJLSTZO;

import demo1.Cell;
import demo1.Tetris;
import demo1.Tetromino;

public class O extends Tetromino {
    public O() {
        cells[0] = new Cell(0,4, Tetris.O);
        cells[1] = new Cell(0,5, Tetris.O);
        cells[2] = new Cell(1,4, Tetris.O);
        cells[3] = new Cell(1,5, Tetris.O);
    }

    @Override
    public void moveLeft() {
        super.moveLeft();
    }

    @Override
    public void moveRight() {
        super.moveRight();
    }

    @Override
    public void softDrop() {
        super.softDrop();
    }

}
