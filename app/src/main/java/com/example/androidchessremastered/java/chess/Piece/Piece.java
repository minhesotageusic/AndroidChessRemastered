package com.example.androidchessremastered.java.chess.Piece;

import com.example.androidchessremastered.java.chess.Board.ChessBoard;

public abstract class Piece {
    protected int ownerID;
    protected String name;
    public Piece(int ownerID){
        this.ownerID = ownerID;
    }
    /**
     * Determine if this piece can move from the given coordinate
     * to another given coordinate. It is assumed that the two
     * coordinates are valid.
     *
     * @param currRow Current Row
     * @param currCol Current Column
     * @param newRow New Row
     * @param newCol New Column
     * @param cb Chessboard
     *
     * @return True if the move is legal, false otherwise.
     * */
    public abstract boolean IsMoveLegal(int currRow, int currCol, int newRow, int newCol, ChessBoard cb);
    /**
     * Get the id of the owner of this piece
     * */
    public int GetOwner(){
        return ownerID;
    }
    /**
     * Get the name of the piece
     * */
    public String ToString(){
        return name;
    }
}
