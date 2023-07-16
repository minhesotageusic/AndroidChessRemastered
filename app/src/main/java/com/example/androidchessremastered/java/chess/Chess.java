package com.example.androidchessremastered.java.chess;

import android.content.Context;
import android.graphics.Canvas;

import com.example.androidchessremastered.java.chess.Board.ChessBoard;

public class Chess {
    protected ChessBoard chessBoard;
    public Chess(Context context){
        chessBoard = new ChessBoard();
    }
    public void Draw(Canvas canvas){
        chessBoard.DrawBoard(canvas);
    }
}
