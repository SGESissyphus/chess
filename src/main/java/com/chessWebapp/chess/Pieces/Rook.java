package com.chessWebapp.chess.Pieces;

import com.chessWebapp.chess.ChessPiece;

public class Rook extends ChessPiece {

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

    public Rook(String color) {
        super(color);
    }

    @Override
    public boolean isValidMove(int targetRow, int targetCol) {
        if(targetRow == currentRow && targetRow  ){

        }
    }


}
