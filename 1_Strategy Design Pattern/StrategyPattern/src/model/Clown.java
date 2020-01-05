package model;

import controller.ScoreAlgorithnBase;

public class Clown extends ScoreAlgorithnBase {

	@Override
	public int calculateScore(int taps, int multiplier) {
		return (taps * multiplier) - 10;
	}

}
