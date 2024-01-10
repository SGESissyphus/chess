package com.chessWebapp.chess.Pieces;

import com.chessWebapp.chess.ChessPiece;

public class Rook extends ChessPiece {



    public Rook(String color) {
        super(color);
    }

    @Override
    public void move(int targetRow, int targetCol) {
        if(isValidMove(targetRow, targetCol)){
            setCurrentRow(targetRow);
            setCurrentCol(targetCol);
        }
    }

    @Override
    public boolean isValidMove(int targetRow, int targetCol) {
        if ((targetRow == getCurrentRow() && targetCol != getCurrentCol()) || (targetRow != getCurrentRow() && targetCol == getCurrentCol()))
            if (isWithinBoard(targetRow, targetCol))
                if (isPathClear(targetRow, targetCol))
                    return true;


        return false;
    }

    public boolean isPathClear(int targetRow, int targetCol) {
        //TODO

        return true;
    }


}
