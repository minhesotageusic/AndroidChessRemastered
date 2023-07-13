package com.example.androidchessremastered.java.chess.Board;

import com.example.androidchessremastered.java.chess.Tile.IntPair;

public abstract class Board<T> {
    /**
     * Construct the board.
     * */
    public Board(){ }
    /**
     * Determine if the given coordinate is valid
     * @param coordinate coordinate to be tested
     * @return true if the coordinate is valid, false otherwise
     * */
    public abstract boolean IsCoordinateValid(IntPair coordinate);
    /**
     * Get the value stored at the given coordinate.
     * @param coordinate coordinate in which value is stored on
     * @return value associated with the given coordinate
     * */
    public abstract T GetT(IntPair coordinate);
    /**
     * Add a value t to the given coordinate.
     * @param coordinate coordinate to add t to
     * @param t value to be stored
     * @return true if the value could be stored, false otherwise.
     * */
    public abstract boolean AddT(IntPair coordinate, T t);
    /**
     * Remove a value from the given coordinate.
     * @param coordinate coordinate to remove value from
     * @return the value stored.
     * */
    public abstract T RemoveT(IntPair coordinate);
    /**
     * Remove a value from the board.
     * @param t the value to remove.
     * @return true if the value could be removed, false otherwise.
     * */
    public abstract boolean RemoveT(T t);
    /**
     * Get the coordinate of the given value.
     * @param t value to get coordinate from.
     * @return the coordinate associated with the value, null otherwise.
     * */
    public abstract IntPair GetTCoordinate(T t);
    /**
     * Convert this board and everything stored into a string for readability.
     * @return a string representation of this board.
     * */
    public abstract String BoardToString();
    /**
     * Get the size of this board.
     * @return an Integer Pair representing this board, null otherwise.
     * */
    public abstract IntPair GetBoardSize();
}
