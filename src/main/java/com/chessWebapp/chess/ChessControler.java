package com.chessWebapp.chess;

import org.springframework.stereotype.Controller;

@Controller
public class ChessControler {
    public String showChessboard(){
        return "chessboard";
    }
}
