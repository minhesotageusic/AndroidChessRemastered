package com.example.androidchessremastered.java.chess.Piece;

import com.example.androidchessremastered.java.chess.Board.Board;
import com.example.androidchessremastered.java.chess.Tile.IntPair;

public abstract class ChessPiece extends Piece implements IDrawable{
    /**
     * Owner of this piece.
     * */
    protected int ownerID;
    /**
     * Current coordinate this piece is occupying.
     * */
    protected IntPair currentCoordinate;
    /**
     * Constructor
     * */
    public ChessPiece(int ownerID, IntPair coordinate){
        super();
        this.ownerID = ownerID;
        currentCoordinate = coordinate;
    }
    /**
     * Get the owner's id.
     * @return id of this piece's owner
     * */
    public int GetOwnerID(){
        return ownerID;
    }
    /**
     * Get the row this piece occupy.
     * */
    public int GetRow(){
        if(currentCoordinate == null){
            return 0;
        }
        return currentCoordinate.value1;
    }
    /**
     * Get the column this piece occupy.
     * */
    public int GetColumn(){
        if(currentCoordinate == null){
            return 0;
        }
        return currentCoordinate.value2;
    }
    /**
     * Determine if this piece can move from its current coordinate
     * to another given coordinate.
     *
     * @param targetCoordinate target coordinate
     * @param cb board
     *
     * @return True if the move is legal, false otherwise.
     * */
    public abstract boolean IsMoveLegal(IntPair targetCoordinate, Board cb);
}
