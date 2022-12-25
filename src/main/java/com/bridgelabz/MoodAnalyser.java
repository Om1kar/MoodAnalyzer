package com.bridgelabz;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser() {}
    /*
    Refactor->MoodAnalyser will have 2 Constructors –
              Default - MoodAnalyser() and with
              Parameters – MoodAnalyser(message)
     */
   public MoodAnalyser(String message) {
            this.message = message;
        }
        public String analyseMood () {
            if (this.message.contains("sad")) {
                return "SAD";
            } else
                return "HAPPY";
        }
        public static void main (String[]args){
            MoodAnalyser moodAnalyser1 = new MoodAnalyser("I am Happy");
            System.out.println(moodAnalyser1.analyseMood());
            MoodAnalyser moodAnalyser2 = new MoodAnalyser("I am Sad");
            System.out.println(moodAnalyser2.analyseMood());

        }
    }

