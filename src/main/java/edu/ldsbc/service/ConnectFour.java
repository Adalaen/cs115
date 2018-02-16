package edu.ldsbc.service;

import java.util.Arrays;

public class ConnectFour {
    private String[][] grid = new String[7][6];

    public void addToken(int x, String playerColor){

        int y = findOpenSlot(x);
        grid[x][y] = playerColor;
    }

    int findOpenSlot (int x){
        String[] yArray = grid[x];
        int y = 0;
        while (y<yArray.length){
            if(!(yArray[y]==null)){
                break;
            }
            y++;
        }
        return y -1;
        /*
        String[] yArray = grid[x];
        boolean done = false;
        int result = 6;
        while (!done){
            result--;
            if(result== -1 || !(yArray[result]==null)){
                done = true;
            }
        }
        return result -1;
        */
    }

    //do we have a winner
    public boolean haveWinner(String color){
        return checkVertical(color) || checkHorizontal(color) || checkDiagonal(color);
    }

    boolean checkVertical(String color){
        boolean winner = checkColumn(0, color);
                winner = winner || checkColumn(1, color);
                winner = winner || checkColumn(2, color);
                winner = winner || checkColumn(3, color);
                winner = winner || checkColumn(4, color);
                winner = winner || checkColumn(5, color);
                winner = winner || checkColumn(6, color);
        return winner;
    }

    boolean checkColumn(int columnIndex, String color){
        String[] column = grid[columnIndex];
        return checkStringArray(column, color);
    }

    boolean checkHorizontal(String color){
        boolean winner = checkRow(0, color);
                winner = winner || checkRow(1, color);
                winner = winner || checkRow(2, color);
                winner = winner || checkRow(3, color);
                winner = winner || checkRow(4, color);
                winner = winner || checkRow(5, color);
        return winner;
    }

    boolean checkRow(int rowIndex, String color){
        String[] row = getRow(rowIndex);
        return checkStringArray(row, color);
    }

    String[] getRow(int rowIndex){
        String[] row = new String[6];
        for (int i = 0; i<row.length;i++){
            row[i]=grid[i][rowIndex];
        }
        return row;
    }

    boolean checkDiagonal(String color){
        boolean winner = checkAngel(0, 0, color, 1, 1);
                winner = winner || checkAngel(1, 0, color, 1, 1);
                winner = winner || checkAngel(2, 0, color, 1, 1);
                winner = winner || checkAngel(2, 6, color, 1, -1);
                winner = winner || checkAngel(3, 0, color, 1, 1);
                winner = winner || checkAngel(3, 6, color, 1, -1);
                winner = winner || checkAngel(3, 6, color, -1, -1);
                winner = winner || checkAngel(3, 0, color, -1, 1);
                winner = winner || checkAngel(4, 6, color, -1, -1);
                winner = winner || checkAngel(4, 0, color, -1, 1);
                winner = winner || checkAngel(5, 0, color, -1, 1);
                winner = winner || checkAngel(6, 0, color, -1, 1);
        return winner;
    }

    boolean checkAngel(int columnIndex, int rowIndex, String color, int columnDirection, int rowDirection){
        String[] angel = getAngel(columnIndex, rowIndex, columnDirection, rowDirection);
        return checkStringArray(angel, color);
    }

    String[] getAngel(int columnIndex, int rowIndex, int columnDirection, int rowDirection){
        int angelLength = GetLength(columnIndex);
        String[] angel = new String[angelLength];
        for (int i = 0; i<angel.length; i++){
            angel[i]=grid[columnIndex+(i*columnDirection)][rowIndex+(i*rowDirection)];
        }
        return angel;
    }

    int GetLength(int columnIndex){
        int angelLength = 0;
        switch (columnIndex) {
            case 0:
                return angelLength = 6;
            case 1:
                return angelLength = 6;
            case 2:
                return angelLength = 5;
            case 3:
                return angelLength = 4;
            case 4:
                return angelLength = 5;
            case 5:
                return angelLength = 6;
            case 6:
                return angelLength = 6;
        }
        return 0;
    }
    boolean checkStringArray(String[] sArray, String color){
        String angleStr = Arrays.toString(sArray);
        return angleStr.contains(color + ", " + color + ", " + color + ", " + color);
    }

    //print out the grid
    public void print(){

    }
}
