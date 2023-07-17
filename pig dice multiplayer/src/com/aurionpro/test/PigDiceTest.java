package com.aurionpro.test;
import com.aurionpro.model.PigGame;
public class PigDiceTest {

	public static void main(String[] args) {
		
		System.out.println("turn of player 1");
		PigGame player1 = new PigGame();
		player1.playGame();
		System.out.println("----------------------------------");
		System.out.println("turn of player 2");
		PigGame player2 = new PigGame();
		player2.playGame();
		System.out.println("----------FINAL RESULT-----------");
		if(player1.getTurns()<player2.getTurns()) {
			System.out.println("player 1 WINS");
		}
		else if(player1.getTurns()==player2.getTurns()){
			System.out.println("GAME DRAWN ");
		}
		else {
			System.out.println("player 2 WINS");
		}
	}
}