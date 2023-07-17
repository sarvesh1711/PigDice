package com.aurionpro.model;

import java.util.Scanner;

public class PigDice {
    public static void main(String[] args) {
        int totalScore = 0;
        int turnScore=0;
        int turnCount = 0;
        
        System.out.println("Let's Play PIG!\n");
        Scanner sc = new Scanner(System.in);

        while (totalScore < 20) {
            turnCount++;
            System.out.println("TURN " + turnCount);

            while (true) {
                System.out.print("Roll or hold? (r/h): ");
                String choice = sc.nextLine();

                if (choice.equalsIgnoreCase("r")) {
                    int die = (int) (Math.random() * 6) + 1;
                    System.out.println("Die: " + die);

                    if (die == 1) {
                        System.out.println("Turn over. No score.");
                        break;
                    } else {
                        turnScore += die;
                    }
                } else if (choice.equalsIgnoreCase("h")) {
                    totalScore += turnScore;
                    System.out.println("Score for turn: " + turnScore);
                    System.out.println("Total score: " + totalScore);
                    break;
                }
            }
        }

        System.out.println("\nYou finished in " + turnCount + " turns!\nGame over!");
    }
}