package com.learntocode;

public class TestStatistics {
    public static void main(String[] args) {
        int[] scores = {85, 87, 91, 72, 80, 95, 83, 96, 79, 86};
        // create a variables
        double sum = 0;
        int highScore = scores[0];
        int lowScore  = scores[0];

        // loop to get sum
        for (double num: scores) {
            sum += num;
        }
        // calculation for average
        double avg = sum / scores.length;
        System.out.println("The average is: " + avg);

        for (int i = 0; i < scores.length; i++){

        }
        // loop for highest score
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > highScore) {
                highScore = scores[i];
            }
            if(scores[i] < lowScore){
                lowScore = scores[i];
            }
        }

        System.out.println("The highest score is: " + highScore);
        System.out.println("The lowest score is: " + lowScore);
    }
}
