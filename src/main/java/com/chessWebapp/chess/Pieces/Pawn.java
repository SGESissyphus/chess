package com.chessWebapp.chess.Pieces;

import com.chessWebapp.chess.ChessPiece;

public class Pawn extends ChessPiece {
    public Pawn (String color) {
        super(color);
    }

    @Override
    public boolean isPathClear(int targetRow, int targetCol) {
        return false;
    }

    @Override
    public boolean isValidMove(int targetRow, int targetCol) {
        black

        //Diagonal Schlagen


        //Vorwärts bewegen


    }

    @Override
    public void move(int targetRow, int targetCol) {

    }
}