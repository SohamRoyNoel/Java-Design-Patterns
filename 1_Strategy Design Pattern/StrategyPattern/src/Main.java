import controller.ScoreBoard;
import model.Ballon;
import model.Clown;
import model.SquareBallon;

public class Main {

	public static void main(String[] args) {

		ScoreBoard sb = new ScoreBoard();
		// COMPOSITION IN Strategic Design pattern
		sb.algorithmBase = new Ballon();
		sb.showScore(10, 50);
		
		sb.algorithmBase = new Clown();
		sb.showScore(10, 60);
		
		sb.algorithmBase = new SquareBallon();
		sb.showScore(10, 80);
		
	}

}
