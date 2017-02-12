package com.johnsandroidstudiotutorials.soundbuttonclick;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer catSoundMediaPlayer = MediaPlayer.create(this, R.raw.cat_sound);

        final Button playCatMeow = (Button) this.findViewById(R.id.play_cat_meow);

        playCatMeow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                catSoundMediaPlayer.start();
            }
        });

    }
}
