package controller;

public class ScoreBoard {

	// instance Variable
	public ScoreAlgorithnBase algorithmBase;
	
	public void showScore(int taps, int multiplier) {
		System.out.println(algorithmBase.calculateScore(taps, multiplier));
	}
}
