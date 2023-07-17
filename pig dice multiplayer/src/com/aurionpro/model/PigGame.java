package com.aurionpro.model;
import java.util.Scanner;
public class PigGame {
	Scanner sc = new Scanner(System.in);
	private int totalScore=0;
	private int turns=1;
	private int scoreOfTurn=0;
	private int totalTurns=0;
	public void playGame() {
		System.out.println("lets start");
		while(totalScore<20) {
			scoreOfTurn =0;
			boolean turnOver = false;
			System.out.println("TURN : "+turns);
			while(!turnOver) {
				System.out.println("Roll or Hold? (r/h) : ");
				String choice = sc.nextLine();
				if(choice.equalsIgnoreCase("r")) {
					int numberOnDie = rollDie();
					System.out.println("DIE : "+numberOnDie);
					if(numberOnDie==1) {
						scoreOfTurn=0;
						turnOver = true;
						System.out.println("TURN OVER......NO SCORE");
						System.out.println("************************************");
					}
					else {
						scoreOfTurn=scoreOfTurn+numberOnDie;
					}
					
				}
				else if(choice.equalsIgnoreCase("h")) {
					totalScore=totalScore+scoreOfTurn;
					turnOver = true;
					System.out.println("scored in turn "+turns+" is : "+scoreOfTurn);
					System.out.println("total score "+totalScore);
					System.out.println("************************************");
				}
			}
			turns++;
		}
		totalTurns=turns-1;
		System.out.println("you scored : "+totalScore);
		System.out.println("game over......you win");
		System.out.println("turns taken to win : "+totalTurns);
	}
	public static int rollDie() {
		int number = (int) (Math.random()*6)+1;
		return number;
	}
	public int getTurns() {
		return totalTurns;
	}
}