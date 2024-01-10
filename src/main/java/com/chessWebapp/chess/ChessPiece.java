package com.chessWebapp.chess;

public abstract class ChessPiece {
    private String color;

    public ChessPiece(String color) {
        this.color = color;

    }


    public abstract boolean isValidMove(int targetRow, int targetCol);

}

