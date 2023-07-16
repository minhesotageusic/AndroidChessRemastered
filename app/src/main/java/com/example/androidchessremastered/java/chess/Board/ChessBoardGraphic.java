package com.example.androidchessremastered.java.chess.Board;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import com.example.androidchessremastered.java.chess.Piece.IDrawable;
import com.example.androidchessremastered.java.chess.Tile.ChessTile;

public class ChessBoardGraphic  implements IDrawable {
    protected ChessBoard chessBoard;
    protected Paint fillPaint;
    protected Paint outlinePaint;
    protected Paint color1;
    protected Paint color2;
    protected float pieceScaleFactor;
    protected float boardScaleFactor;
    protected float boardSize;
    protected float SCALE_IN_VIEW;
    protected float marginX;
    protected float marginY;

    public ChessBoardGraphic(ChessBoard chessBoard, float pieceScaleFactor, Paint fillPaint, Paint outlinePaint, Paint color1, Paint color2, float SCALE_IN_VIEW){
        this.chessBoard = chessBoard;
        this.pieceScaleFactor = pieceScaleFactor;
        this.fillPaint = fillPaint;
        this.outlinePaint = outlinePaint;
        this.color1 = color1;
        this.color2 = color2;
        this.SCALE_IN_VIEW = SCALE_IN_VIEW;
    }
    /**
     * Draw the piece on the given tile from the given chessboard
     * */
    public void DrawPiece(Canvas canvas, ChessTile tile){
        if(canvas == null || tile == null || chessBoard == null){
            return;
        }
        int row = tile.Row();
        int column = tile.Column();
        if(!chessBoard.IsCoordinateValid(row, column)){
            return;
        }

        if(tile.GetPiece() == null){
            return;
        }
        tile.GetPiece().Draw(canvas, tile.ScreenCoordinateX(), tile.ScreenCoordinateY(), pieceScaleFactor);
    }
    public void DrawBoardOutLine(Canvas canvas, float x, float y, float boardSize, Paint outlinePaint){
        if(canvas == null){
            return;
        }
        //top line
        canvas.drawLine(x,y,x+boardSize, y, outlinePaint);
        //left line
        canvas.drawLine(x, y, x, y+boardSize, outlinePaint);
        //bottom line
        canvas.drawLine(x, y+boardSize, x+boardSize, y+boardSize, outlinePaint);
        //right line
        canvas.drawLine(x+boardSize, y, x+boardSize, y+boardSize, outlinePaint);
    }

    @Override
    public void Draw(Canvas canvas, float xScreenPosition, float yScreenPosition, float scale) {
        if(canvas == null){
            return;
        }
        int canvasH = canvas.getHeight();
        int canvasW = canvas.getWidth();
        float rectWidth = 0;
        float xDelta = 0;
        float yDelta = 0;
        boolean tileColorToggle = false;
        Paint currColor = color1;
        int minDimension = canvasH;
        if(canvasW < canvasH){
            minDimension = canvasW;
        }
        boardSize = (float)(minDimension) * SCALE_IN_VIEW;
        marginX = (canvasW - boardSize) / 2f;
        marginY = (canvasH - boardSize) / 2f;
        boardScaleFactor = boardSize / 5f;
        rectWidth = boardSize / 8f;
        DrawBoardOutLine(canvas, marginX, marginY, boardSize, outlinePaint);
        canvas.drawRect(marginX, marginY, marginX + boardSize, marginY + boardSize, fillPaint);
        for(int c = 0; c < chessBoard.column; c++){
            for(int r = 0; r < chessBoard.row; r++){
                Paint tempPaint = color1;
                if(tileColorToggle){
                    tempPaint = color2;
                }
                canvas.drawRect(marginX + xDelta, marginY + yDelta, marginX + xDelta + rectWidth, marginY + yDelta + rectWidth, tempPaint);
                xDelta += rectWidth;
                tileColorToggle = !tileColorToggle;
            }
            xDelta = 0;
            yDelta += rectWidth;
            tileColorToggle = !tileColorToggle;
        }
        canvas.save();
        canvas.translate(marginX, marginY);
        canvas.scale(boardScaleFactor, boardScaleFactor);
        canvas.restore();
    }
}
