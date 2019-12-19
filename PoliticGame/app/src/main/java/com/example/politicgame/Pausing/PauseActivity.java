package com.example.politicgame.Pausing;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.politicgame.Character.SpriteSetter;
import com.example.politicgame.GameActivity;
import com.example.politicgame.PopUpActivity;
import com.example.politicgame.R;

public class PauseActivity extends PopUpActivity {

  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_pause);

    setTitle("Paused");

    final ImageView pauseImage = findViewById(R.id.pause_menu_image);

    // Set the sprite for the pause menu
    SpriteSetter ss = new SpriteSetter(app);
    ss.setSprite(pauseImage);

    // Resume button
    final Button resumeB = findViewById(R.id.resume);
    resumeB.setOnClickListener(
        new View.OnClickListener() {
          public void onClick(View v) {
            returnRequest(GameActivity.RESUME_CODE);
          }
        });

    // Quit to main menu button
    final Button loggedInB = findViewById(R.id.pause_main_menu);
    loggedInB.setOnClickListener(
        new View.OnClickListener() {
          public void onClick(View v) {
            returnRequest(GameActivity.QUIT_TO_MENU_CODE);
          }
        });
  }
}
