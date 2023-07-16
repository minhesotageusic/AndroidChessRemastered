package com.example.androidchessremastered.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidchessremastered.R;

public class PlaySelectionActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_selection);
        ConfigurePvPButton();
        ConfigureVsComputer();
        ConfigureBackButton();
    }
    private void ConfigureBackButton(){
        Button backButton = (Button) findViewById(R.id.backBtn);
        backButton.setOnClickListener(view -> finish());
    }
    private void ConfigurePvPButton(){
        Button pvpButton = findViewById(R.id.pvpButton);
        pvpButton.setOnClickListener(view -> startActivity(new Intent(PlaySelectionActivity.this, ChessActivityNonNetwork.class)));
    }
    private void ConfigureVsComputer(){
        Button pvpButton = findViewById(R.id.vsComputerBtn);
        pvpButton.setOnClickListener(view -> startActivity(new Intent(PlaySelectionActivity.this, ChessActivityNonNetwork.class)));
    }
}
