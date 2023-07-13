package com.example.androidchessremastered.java.chess.Tile;

import com.example.androidchessremastered.java.chess.Piece.ChessPiece;

public class ChessTile extends Tile{
    public ChessTile(int row, int column) {
        super(row, column);
    }
    public ChessTile(int row, int column, ChessPiece piece){
        super(row, column, piece);
    }
    /**
     * Set the given piece to occupy this tile
     * @param piece piece to occupy this tile
     */
    public void SetPiece(ChessPiece piece){
        super.SetPiece(piece);
    }
    /**
     * Get the piece occupying this tile
     */
    @Override
    public ChessPiece GetPiece(){
        return (ChessPiece) super.GetPiece();
    }
}
