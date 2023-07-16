package com.example.androidchessremastered.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.example.androidchessremastered.R;

public class ChessActivityNonNetwork extends ChessActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_nonnetwork);
        //chessBoardView = findViewById(R.id.chessBoard);
    }

    @Override
    public void Resign(View view) {

    }

    @Override
    public void RequestDraw(View view) {

    }

    @Override
    public void Record(View view) {

    }

    @Override
    public void UndoMove(View view) {

    }
}
