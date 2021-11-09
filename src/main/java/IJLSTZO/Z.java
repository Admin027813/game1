package IJLSTZO;

import demo1.Cell;
import demo1.Tetris;
import demo1.Tetromino;

public class Z extends Tetromino {
    public Z() {
        cells[0] = new Cell(1,4, Tetris.Z);
        cells[1] = new Cell(0,3, Tetris.Z);
        cells[2] = new Cell(0,4, Tetris.Z);
        cells[3] = new Cell(1,5, Tetris.Z);
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
