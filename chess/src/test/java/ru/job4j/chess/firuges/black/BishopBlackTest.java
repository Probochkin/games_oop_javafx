package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import org.junit.Assert;
import ru.job4j.chess.firuges.Figure;

public class BishopBlackTest  {
    @Test
    public void testPosition() {
        Figure bishopBlack = new BishopBlack(Cell.C8);
        Assert.assertSame(Cell.C8, bishopBlack.position());
    }

    @Test
    public void testCopy() {
        Figure bishopBlack = new BishopBlack(Cell.C8);
        bishopBlack  = bishopBlack.copy(Cell.E6);
        Assert.assertSame(Cell.E6, bishopBlack.position());
    }

    @Test
    public void whenIsDiagonal() {
        Assert.assertSame(true, new BishopBlack(Cell.C8).isDiagonal(Cell.C8,Cell.H3));
    }

    @Test
    public void whenIsNotDiagonal() {
        Assert.assertSame(false, new BishopBlack(Cell.C8).isDiagonal(Cell.C8,Cell.H5));
    }
}