package com.moodanalyser;

public class MoodAnalyser {

    private String message;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }
    public String analyseMood(String message) {
        this.message = message;
        return analyseMood();
    }

    public String analyseMood() {
        try {
            if (message.contains("SAD"))
                return "SAD";
            else
                return "Happy";
        } catch (NullPointerException e) {
            return "Happy";
        }
    }
}
