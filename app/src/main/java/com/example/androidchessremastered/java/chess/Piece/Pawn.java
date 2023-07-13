package com.example.androidchessremastered.java.chess.Piece;

import com.example.androidchessremastered.java.chess.Board.Board;
import com.example.androidchessremastered.java.chess.Tile.IntPair;

public class Pawn extends ChessPiece{
    /**
     * a boolean value indicates whether this piece has moved
     */
    protected boolean firstMove = true;

    /**
     * a boolean value shows whether the last move was first time moving
     */
    protected boolean lastMoveWasFirstMove = false;

    /**
     * a boolean value refers to specific player's piece
     */
    protected boolean moveUp = false;
    /**
     * an integer keeps track of number of movements made
     */
    protected int moved = 0;

    /**
     * determines if the last movement was first time moving for this piece
     *
     * @return true if last movement was the first one, otherwise false
     */
    public boolean WasLastMoveFirstMove() {
        return lastMoveWasFirstMove;
    }

    /**
     * constructor
     *
     * @param owner the player who holds this piece
     * @param moveUp indicates if this piece should move up or down
     */
    public Pawn(int owner, IntPair coordinate, boolean moveUp) {
        super(owner, coordinate);
        this.name = "p";
        this.moveUp = moveUp;
    }
    /**
     * check whether the condition for using En Passant gets fulfilled
     *
     * @param row row of captured pawn
     * @param col column of captured pawn
     * @param currentOwner player who uses enPassant
     * @param cb chessboard
     * @return true if the current player can use enPassant, other false
     */
    public boolean conditionForEnPassant (int row, int col, int currentOwner, Board cb) {
        /*if(cb == null){
            return false;
        }
        Piece piece = cb.getPiece(row, col);
        if (piece == null || !(piece instanceof Pawn) || piece.ownerID == currentOwner) {
            return false; // captured pawn does not exist
        }
        Pawn pawn = (Pawn)piece;
        Pair lastMovedPiece = cb.lastPieceMoved();
        if (lastMovedPiece.x != row || lastMovedPiece.y != col) return false; // the captured pawn was not the most recently moved one
        if (!pawn.wasLastMoveFirstMove() || pawn.numberOfMoves() != 2) return false; // The captured pawn's last move was not a jump two square
        return true;*/
        return false;
    }
    public boolean IsMoveLegal(IntPair targetCoordinate, Board cb){
        return false;
    }
}
