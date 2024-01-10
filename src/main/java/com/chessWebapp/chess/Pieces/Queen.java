package com.chessWebapp.chess.Pieces;

import com.chessWebapp.chess.ChessPiece;

public class Queen extends ChessPiece {

    public Queen(String color) {
        super(color);
    }

    @Override
    public boolean isValidMove(int targetRow, int targetCol) {
        if(isWithinBoard(targetRow, targetCol))
            if (isPathClear(targetRow, targetCol))
                return targetRow == getCurrentRow() || targetCol == getCurrentCol() || Math.abs(targetRow - getCurrentRow()) == Math.abs(targetCol - getCurrentCol());

        return false;
    }

    @Override
    public void move(int targetRow, int targetCol) {
        if(isValidMove(targetRow, targetCol)){
            setCurrentCol(targetCol);
            setCurrentRow(targetRow);
        }
    }
    public boolean isPathClear(int targetRow, int targetCol) {
        //TODO

        return true;
    }
}
