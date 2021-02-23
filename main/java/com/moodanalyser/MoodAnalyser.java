package com.moodanalyser;

public class MoodAnalyser {
    public String analyseMood(String message) {
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
