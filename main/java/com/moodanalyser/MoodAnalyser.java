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

    public String analyseMood()  {
        try {
            return analyseMoodAgain();
        } catch (MoodAnalysisException e) {
            return "Happy";
        }
    }

    public String analyseMoodAgain() throws MoodAnalysisException {
        try {
            if(message.length()==0)
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,"Please enter proper messsage");
            if (message.contains("SAD"))
                return "SAD";
            else
                return "Happy";
        }catch (NullPointerException a){
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL,"Please enter proper messsage");
        }
    }
}
