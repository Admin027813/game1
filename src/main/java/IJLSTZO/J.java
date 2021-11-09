package IJLSTZO;

import demo1.Cell;
import demo1.Tetris;
import demo1.Tetromino;

public class J extends Tetromino {
    public J() {
        cells[0] = new Cell(0,4, Tetris.J);
        cells[1] = new Cell(0,3, Tetris.J);
        cells[2] = new Cell(0,5, Tetris.J);
        cells[3] = new Cell(1,5, Tetris.J);
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
