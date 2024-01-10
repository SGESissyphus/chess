package com.chessWebapp.chess.Pieces;

import com.chessWebapp.chess.ChessPiece;

public class King extends ChessPiece {

    public King(String color) {
        super(color);
    }

    public void move(int targetRow, int targetCol) {
        if(isValidMove(targetRow, targetCol)){
            setCurrentRow(targetRow);
            setCurrentCol(targetCol);
        }
    }

    @Override
    public boolean isPathClear(int targetRow, int targetCol) {
        return true;
        //TODO
    }

    @Override
    public boolean isValidMove(int targetRow, int targetCol) {
        if(!isWithinBoard(targetRow, targetCol))
            return false;

        if(!isPathClear(targetRow, targetCol))
            return false;

        // Überprüfe auf gültige Bewegung
        int rowDiff = Math.abs(targetRow - getCurrentRow());
        int colDiff = Math.abs(targetCol - getCurrentCol());

        // König kann ein Feld horizontal, vertikal oder diagonal bewegen
        return (rowDiff == 1 && colDiff == 0) || // vertikal
                (rowDiff == 0 && colDiff == 1) || // horizontal
                (rowDiff == 1 && colDiff == 1);   // diagonal

    }

}
