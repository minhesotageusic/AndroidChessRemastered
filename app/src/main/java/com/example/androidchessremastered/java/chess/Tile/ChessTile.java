package com.example.androidchessremastered.java.chess.Tile;

import com.example.androidchessremastered.java.chess.Piece.ChessPiece;

public class ChessTile extends Tile{
    public static final float DEFAULT_TILE_SIZE = 1;
    protected FloatPair screenCoordinate;
    protected float tileSize;
    public ChessTile(int row, int column) {
        super(row, column);
        screenCoordinate = new FloatPair(0, 0);
        tileSize = DEFAULT_TILE_SIZE;
    }
    public ChessTile(int row, int column, ChessPiece piece){
        super(row, column, piece);
        screenCoordinate = new FloatPair(0, 0);
        tileSize = DEFAULT_TILE_SIZE;
    }
    public ChessTile(int row, int column, ChessPiece piece, float screenYPos, float screenXPos, float tileSize){
        super(row, column, piece);
        screenCoordinate = new FloatPair(screenYPos, screenXPos);
        this.tileSize = tileSize;
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
    /**
     * Get the x position on the screen
     * */
    public float ScreenCoordinateX(){
        if(screenCoordinate == null){
            return 0;
        }
        return screenCoordinate.value2;
    }
    /**
     * Get the y position on the screen
     * */
    public float ScreenCoordinateY(){
        if(screenCoordinate == null){
            return 0;
        }
        return screenCoordinate.value1;
    }
    /**
     * Determine if the given value of y,x is in this tile
     * @return true if it is, false otherwise.
     * */
    public boolean InTile(float y, float x){
        float halfTileSize = tileSize / 2f;
        float screenX = ScreenCoordinateX();
        float screenY = ScreenCoordinateY();
        float lowX = screenX - halfTileSize;
        float lowY = screenY - halfTileSize;
        float highX = screenX + halfTileSize;
        float highY = screenY + halfTileSize;
        return x >= lowX && y >= lowY && x <= highX && y <= highY;
    }
}
