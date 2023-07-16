package com.example.androidchessremastered.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.androidchessremastered.R;
import com.example.androidchessremastered.java.chess.ChessView;

public abstract class ChessActivity extends Activity {
    protected ChessView chessBoardView;
    protected TextView playerTurnText;
    protected TextView upgradeText;
    protected Button confirmButton;
    protected Button undoMoveButton;
    protected Button resignButton;
    public abstract void Resign(View view);
    public abstract void RequestDraw(View view);
    public abstract void Record(View view);
    public abstract void UndoMove(View view);
}
