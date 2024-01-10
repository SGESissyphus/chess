package com.chessWebapp.chess;

public abstract class ChessPiece {
    private String color;

    private int currentRow;
    private int currentCol;

    public int getCurrentRow(){
        return currentRow;
    }
    public void setCurrentRow(int newRow){
        currentRow = newRow;
    }
    public int getCurrentCol(){
        return currentCol;
    }
    public void setCurrentCol(int newCol){
        currentCol = newCol;
    }

    public ChessPiece(String color) {
        this.color = color;

    }
    public abstract boolean isPathClear(int targetRow, int targetCol);

    protected static boolean isWithinBoard(int row, int col) {
        return row >= 0 && row < 8 && col >= 0 && col < 8;
    }

    public abstract boolean isValidMove(int targetRow, int targetCol);

    public abstract void move(int targetRow, int targetCol);

    public String getColor() {
        return color;
    }
}

