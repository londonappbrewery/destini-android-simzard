package com.londonappbrewery.destini;

import android.content.Context;

class StoryBrain {

    private int storyNumber;

    private Context context;

    public StoryBrain(Context context) {
        this.context = context;
    }

    private Story[] stories = new Story[] {
            new Story(R.string.T1_Story, R.string.T1_Ans1, 2, R.string.T1_Ans2, 1),
            new Story(R.string.T2_Story, R.string.T2_Ans1, 2, R.string.T2_Ans2, 3),
            new Story(R.string.T3_Story, R.string.T3_Ans1, 5, R.string.T3_Ans2, 4),
            new Story(R.string.T4_End, R.string.the, 0, R.string.end, 0),
            new Story(R.string.T5_End, R.string.the, 0, R.string.end, 0),
            new Story(R.string.T6_End, R.string.the, 0, R.string.end, 0)
    };

    public void nextStory(String userChoice) {
        if (userChoice.equals(context.getString(stories[storyNumber].getChoice1()))) {
            storyNumber = stories[storyNumber].getChoice1Destination();
        } else if (userChoice.equals(context.getString(stories[storyNumber].getChoice2()))) {
            storyNumber = stories[storyNumber].getChoice2Destination();
        }

    }

    public int getTitle() {
        return stories[storyNumber].getTitle();
    }

    public int getChoice1() {
        return stories[storyNumber].getChoice1();
    }

    public int getChoice2() {
        return stories[storyNumber].getChoice2();
    }

}
