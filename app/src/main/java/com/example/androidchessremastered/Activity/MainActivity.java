package com.example.androidchessremastered.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidchessremastered.R;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConfigurePlayButton();
        ConfigureReplayButton();
    }
    private void ConfigurePlayButton(){
        Button playButton = (Button) findViewById(R.id.playBtn);
        playButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                startActivity(new Intent(MainActivity.this, PlaySelectionActivity.class));
            }
        });
    }
    private void ConfigureReplayButton(){
        Button playButton = (Button) findViewById(R.id.replayBtn);
        playButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                startActivity(new Intent(MainActivity.this, ReplaySelectionActivity.class));
            }
        });
    }
}
