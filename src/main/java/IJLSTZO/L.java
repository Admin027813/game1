package IJLSTZO;

import demo1.Cell;
import demo1.Tetris;
import demo1.Tetromino;

public class L extends Tetromino {
    public L() {
        cells[0] = new Cell(0,4, Tetris.L);
        cells[1] = new Cell(0,3, Tetris.L);
        cells[2] = new Cell(0,5, Tetris.L);
        cells[3] = new Cell(1,3, Tetris.L);
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
