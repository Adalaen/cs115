package edu.ldsbc.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConnectFourTest {
    @Test
    public void addToken() throws Exception {
    }

    @Test
    public void findOpenSlot() throws Exception {
        ConnectFour c = new ConnectFour();

        assertEquals(5, c.findOpenSlot(0));
        assertEquals(5, c.findOpenSlot(1));
        assertEquals(5, c.findOpenSlot(2));
        assertEquals(5, c.findOpenSlot(3));
        assertEquals(5, c.findOpenSlot(4));
        assertEquals(5, c.findOpenSlot(5));
        assertEquals(5, c.findOpenSlot(6));

        c.addToken(0, "R");

        assertEquals(4, c.findOpenSlot(0));
        assertEquals(5, c.findOpenSlot(1));
        assertEquals(5, c.findOpenSlot(2));
        assertEquals(5, c.findOpenSlot(3));
        assertEquals(5, c.findOpenSlot(4));
        assertEquals(5, c.findOpenSlot(5));
        assertEquals(5, c.findOpenSlot(6));

        c.addToken(0, "R");

        assertEquals(3, c.findOpenSlot(0));
        assertEquals(5, c.findOpenSlot(1));
        assertEquals(5, c.findOpenSlot(2));
        assertEquals(5, c.findOpenSlot(3));
        assertEquals(5, c.findOpenSlot(4));
        assertEquals(5, c.findOpenSlot(5));
        assertEquals(5, c.findOpenSlot(6));

        c.addToken(0, "R");

        assertEquals(2, c.findOpenSlot(0));
        assertEquals(5, c.findOpenSlot(1));
        assertEquals(5, c.findOpenSlot(2));
        assertEquals(5, c.findOpenSlot(3));
        assertEquals(5, c.findOpenSlot(4));
        assertEquals(5, c.findOpenSlot(5));
        assertEquals(5, c.findOpenSlot(6));

        c.addToken(0, "R");

        assertEquals(1, c.findOpenSlot(0));
        assertEquals(5, c.findOpenSlot(1));
        assertEquals(5, c.findOpenSlot(2));
        assertEquals(5, c.findOpenSlot(3));
        assertEquals(5, c.findOpenSlot(4));
        assertEquals(5, c.findOpenSlot(5));
        assertEquals(5, c.findOpenSlot(6));

        c.addToken(0, "R");

        assertEquals(0, c.findOpenSlot(0));
        assertEquals(5, c.findOpenSlot(1));
        assertEquals(5, c.findOpenSlot(2));
        assertEquals(5, c.findOpenSlot(3));
        assertEquals(5, c.findOpenSlot(4));
        assertEquals(5, c.findOpenSlot(5));
        assertEquals(5, c.findOpenSlot(6));

        c.addToken(0, "R");

        assertEquals(-1, c.findOpenSlot(0));
        assertEquals(5, c.findOpenSlot(1));
        assertEquals(5, c.findOpenSlot(2));
        assertEquals(5, c.findOpenSlot(3));
        assertEquals(5, c.findOpenSlot(4));
        assertEquals(5, c.findOpenSlot(5));
        assertEquals(5, c.findOpenSlot(6));
    }

    @Test
    public void haveWinner() throws Exception {
        ConnectFour c = new ConnectFour();

        c.addToken(0, "R");
        c.addToken(0, "R");
        c.addToken(0, "R");
        c.addToken(0, "R");
        assertEquals(true, c.haveWinner("R"));

        c = new ConnectFour();

        c.addToken(0, "B");
        c.addToken(0, "B");
        c.addToken(0, "B");
        c.addToken(0, "B");
        assertEquals(true, c.haveWinner("B"));

        c = new ConnectFour();

        c.addToken(0, "B");
        c.addToken(0, "R");
        c.addToken(0, "B");
        c.addToken(0, "B");
        c.addToken(0, "B");
        assertEquals(false, c.haveWinner("B"));

        c = new ConnectFour();

        c.addToken(0, "B");
        c.addToken(1, "B");
        c.addToken(2, "B");
        c.addToken(3, "B");
        assertEquals(true, c.haveWinner("B"));

        c = new ConnectFour();

        c.addToken(0, "B");
        c.addToken(0, "B");
        c.addToken(0, "B");
        c.addToken(1, "R");
        c.addToken(1, "R");
        c.addToken(1, "B");
        c.addToken(2, "B");
        c.addToken(2, "B");
        c.addToken(2, "B");
        c.addToken(3, "R");
        c.addToken(3, "R");
        c.addToken(3, "B");
        assertEquals(true, c.haveWinner("B"));
    }

    @Test
    public void checkVertical() throws Exception {
    }

    @Test
    public void checkColumn() throws Exception {
    }

    @Test
    public void checkHorizontal() throws Exception {
    }

    @Test
    public void checkRow() throws Exception {
    }

    @Test
    public void getRow() throws Exception {
    }

    @Test
    public void checkDiagonal() throws Exception {
    }

    @Test
    public void checkAngel() throws Exception {
    }

    @Test
    public void getAngel() throws Exception {
    }

    @Test
    public void GetLength() throws Exception {
    }

    @Test
    public void checkStringArray() throws Exception {
    }

    @Test
    public void print() throws Exception {
    }
}