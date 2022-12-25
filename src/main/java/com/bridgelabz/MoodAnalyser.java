package com.bridgelabz;

public class MoodAnalyser {
    private  String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }
    public String analyseMood() {
        if (this.message.contains("sad")) {
            return "SAD";
        }else
            return "HAPPY";
    }
    public static void main(String[] args) {
        MoodAnalyser moodAnalyser = new MoodAnalyser("i am sad");
        System.out.println(moodAnalyser.analyseMood());
        MoodAnalyser mood2 = new MoodAnalyser("i am happy");
        System.out.println(mood2.analyseMood());
    }
}
