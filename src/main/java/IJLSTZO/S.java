package IJLSTZO;

import demo1.Cell;
import demo1.Tetris;
import demo1.Tetromino;

public class S extends Tetromino {
    public S() {
        cells[0] = new Cell(0,4, Tetris.S);
        cells[1] = new Cell(0,5, Tetris.S);
        cells[2] = new Cell(1,3, Tetris.S);
        cells[3] = new Cell(1,4, Tetris.S);
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
