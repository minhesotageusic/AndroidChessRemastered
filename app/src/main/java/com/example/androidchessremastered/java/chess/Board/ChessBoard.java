package com.example.androidchessremastered.java.chess.Board;

import com.example.androidchessremastered.java.chess.Piece.ChessPiece;
import com.example.androidchessremastered.java.chess.Piece.Piece;
import com.example.androidchessremastered.java.chess.Tile.ChessTile;
import com.example.androidchessremastered.java.chess.Tile.IntPair;
import com.example.androidchessremastered.java.chess.Tile.Tile;

public class ChessBoard extends Board<ChessPiece> {

    /**
     * default maximum number of tiles of the board width
     */
    public static final int DEFAULT_MAX_TILE_WIDTH = 8;
    /**
     * default maximum number of tiles of the board height
     */
    public static final int DEFAULT_MAX_TILE_HEIGHT = 8;
    protected int column;
    protected int row;
    protected ChessTile[][] board;
    /**
     * Determine if the given coordinate is valid
     *
     * @param coordinate coordinate to be tested
     * @return true if the coordinate is valid, false otherwise
     */
    @Override
    public boolean IsCoordinateValid(IntPair coordinate) {
        if(coordinate == null){
            return false;
        }
        return (coordinate.value1 >= 0 && coordinate.value2 >= 0 && coordinate.value1 < row && coordinate.value2 < column);
    }
    /**
     * Determine if the given coordinate is valid
     *
     * @param row row to be tested
     * @param column column to be tested
     * @return true if the coordinate is valid, false otherwise
     */
    public boolean IsCoordinateValid(int row, int column){
        return (row >= 0 && column >= 0 && row < this.row && column < this.column);
    }
    /**
     * Get the value stored at the given coordinate.
     *
     * @param coordinate coordinate in which value is stored on
     * @return value associated with the given coordinate
     */
    @Override
    public ChessPiece GetT(IntPair coordinate) {
        if(!IsCoordinateValid(coordinate)){
            return null;
        }
        if(board == null){
            return null;
        }
        return board[coordinate.value1][coordinate.value2].GetPiece();
    }

    /**
     * Add a value t to the given coordinate.
     *
     * @param coordinate coordinate to add t to
     * @param o          value to be stored
     * @return true if the value could be stored, false otherwise.
     */
    @Override
    public boolean AddT(IntPair coordinate, ChessPiece o) {
        if(!IsCoordinateValid(coordinate)){
            return false;
        }
        if(board == null){
            return false;
        }
        if(GetT(coordinate) != null){
            return false;
        }
        board[coordinate.value1][coordinate.value2].SetPiece(o);
        return true;
    }

    /**
     * Remove a value from the given coordinate.
     *
     * @param coordinate coordinate to remove value from
     * @return the value stored.
     */
    @Override
    public ChessPiece RemoveT(IntPair coordinate) {
        if(!IsCoordinateValid(coordinate)){
            return null;
        }
        if(board == null){
            return null;
        }
        return board[coordinate.value1][coordinate.value2].GetPiece();
    }

    /**
     * Remove a value from the board.
     *
     * @param o the value to remove.
     * @return true if the value could be removed, false otherwise.
     */
    @Override
    public boolean RemoveT(ChessPiece o) {
        if(o == null || board == null){
            return false;
        }
        int row = o.GetRow();
        int column = o.GetColumn();
        if(!IsCoordinateValid(row, column)){
            return false;
        }
        board[row][column].SetPiece(null);
        return false;
    }

    /**
     * Get the coordinate of the given value.
     *
     * @param o value to get coordinate from.
     * @return the coordinate associated with the value, null otherwise.
     */
    @Override
    public IntPair GetTCoordinate(ChessPiece o) {
        if(o == null || board == null){
            return null;
        }
        int row = o.GetRow();
        int column = o.GetColumn();
        IntPair pair = new IntPair(row, column);
        return pair;
    }

    /**
     * Convert this board and everything stored into a string for readability.
     *
     * @return a string representation of this board.
     */
    @Override
    public String BoardToString() {
        return null;
    }

    /**
     * Get the size of this board.
     *
     * @return an Integer Pair representing this board, null otherwise.
     */
    @Override
    public IntPair GetBoardSize() {
        return null;
    }
}
