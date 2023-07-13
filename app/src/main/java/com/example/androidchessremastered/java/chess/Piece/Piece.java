package com.example.androidchessremastered.java.chess.Piece;

import com.example.androidchessremastered.java.chess.Board.Board;
import com.example.androidchessremastered.java.chess.Tile.IntPair;

public abstract class Piece {
    protected String name;
    public Piece(){ }
    /**
     * Get the name of the piece
     * */
    public String ToString(){
        return name;
    }
}
