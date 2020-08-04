package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView storyTextView;
    private Button topButton;
    private Button bottomButton;


    private StoryBrain storyBrain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        storyBrain = new StoryBrain(this);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyTextView = findViewById(R.id.storyTextView);
        topButton = findViewById(R.id.buttonTop);
        bottomButton = findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitButton(true);
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitButton(false);
            }
        });


        updateUI();
    }

    private void hitButton(boolean whichButton) {
        if (whichButton) {
            storyBrain.nextStory(String.valueOf(topButton.getText()));
        } else {
            storyBrain.nextStory(String.valueOf(bottomButton.getText()));
        }

        updateUI();
    }

    private void updateUI() {
        storyTextView.setText(storyBrain.getTitle());
        topButton.setText(storyBrain.getChoice1());
        bottomButton.setText(storyBrain.getChoice2());
    }
}
