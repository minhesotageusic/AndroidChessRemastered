package com.example.androidchessremastered.java.chess.Tile;

import com.example.androidchessremastered.java.chess.Piece.Piece;

public class Tile {
    protected Piece piece;
    protected IntPair boardCoordinate;
    public Tile(int row, int column){
        piece = null;
        boardCoordinate = new IntPair(row, column);
    }
    public Tile(int row, int column, Piece piece){
        this.piece = piece;
        boardCoordinate = new IntPair(row, column);
    }
    /**
     * Set the given piece to occupy this tile
     * @param piece piece to occupy this tile
     */
    public void SetPiece(Piece piece){
        this.piece = piece;
    }
    /**
     * Get the piece occupying this tile
     */
    public Piece GetPiece(){
        return piece;
    }
    /**
     * Get the row of this tile
     */
    public int Row(){
        return boardCoordinate.value1;
    }

    /**
     * Get the column of this tile
     */
    public int Column(){
        return boardCoordinate.value2;
    }
}
