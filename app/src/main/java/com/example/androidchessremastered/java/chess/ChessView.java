package com.example.androidchessremastered.java.chess;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

public class ChessView extends View {
    protected Chess chess;
    public ChessView (Context context){
        super(context);
        initialize(null, 0);
    }
    public ChessView (Context context, AttributeSet attrs){
        super(context);
        initialize(attrs, 0);
    }
    public ChessView (Context context, AttributeSet attrs, int defStyle){
        super(context);
        initialize(attrs, defStyle);
    }
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        chess.Draw(canvas);
    }
    private void initialize(AttributeSet attrs, int defStyle){
        chess = new Chess(getContext());
    }
}
