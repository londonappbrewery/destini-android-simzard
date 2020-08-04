package com.londonappbrewery.destini;

class Story {
    private int title;
    private int choice1;
    private int choice1Destination;
    private int choice2;
    private int choice2Destination;

    public Story(
      int title,
      int choice1,
      int choice1Destination,
      int choice2,
      int choice2Destination
    ) {
        this.title = title;
        this.choice1 = choice1;
        this.choice1Destination = choice1Destination;
        this.choice2 = choice2;
        this.choice2Destination = choice2Destination;
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public int getChoice1() {
        return choice1;
    }

    public int getChoice1Destination() {
        return choice1Destination;
    }

    public int getChoice2() {
        return choice2;
    }

    public int getChoice2Destination() {
        return choice2Destination;
    }

}
