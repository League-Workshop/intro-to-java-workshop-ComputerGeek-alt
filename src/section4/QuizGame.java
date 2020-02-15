package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		int score = 0;
		// 2. Ask the user a question
		String Q1 = JOptionPane
				.showInputDialog("is the amazon river in north america, south america, or in the pacific ocean?");
		String Q2 = JOptionPane.showInputDialog("is lazar beam the yeetlord?");
		String Q3 = JOptionPane.showInputDialog("is kobe (RIP IN Peace) helicopter pilot an airplane pilot");
		String Q4 = JOptionPane.showInputDialog("is er1C big meme lord");
		// 3. Use an if statement to check if their answer is correct
		if (Q1.equalsIgnoreCase("south america")) {
			score++;
		}
		if (Q2.equalsIgnoreCase("yes")) {
			score++;
		}
		if (Q3.equalsIgnoreCase("no")) {
			score++;
		}
		if (Q4.equalsIgnoreCase("yes")) {
			score += 1000;
		}

		// 4. if the user's answer was correct, add one to their score

		// 5. Create more questions by repeating steps 1, 2, and 3 below.

		// 6. After all the questions have been asked, print the user's score
		JOptionPane.showMessageDialog(null, "bruh, u r no stonks, your score is ," + score);
	}
}
