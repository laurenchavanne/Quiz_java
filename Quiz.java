// Filename: Quiz.java
// Author: Lauren
// Date: 2/5/19
// Simple quiz application that will ask the user 5 questions, the user can pick from a set list of 5 possible answers. Display a congratulatory message if the user guesses right, an error message if they get it wrong. Tally up all correct guesses and display score message at the end. 

import javax.swing.JOptionPane;

public class Quiz
{
	public static void main(String[] args)
	{
		// Variables and constants
		int answer; // for the user's response 
		int correct = 0;
		
		// Variables for the questions 
		String q1 = "Who is buried in Grant's tomb?";
		String q2 = "Who wrote Beethoven's 5th symphony?";
		String q3 = "Who is honored by the Lincoln Memorial?";
		String q4 = "Who lives in the White House?";
		String q5 = "Who discovered Haley's Comet?";
		
		// Variables for the answers 
		String a1 = "Grant";
		String a2 = "Beethoven";
		String a3 = "Lincoln";
		String a4 = "The President";
		String a5 = "Haley";
		
		// Variable for the answer list 
		String answerList = "(1)  " + a1 + "\n" +
							"(2)  " + a2 + "\n" +
							"(3)  " + a3 + "\n" +
							"(4)  " + a4 + "\n" +
							"(5)  " + a5 + "\n";
		
		// Constant for number questions in the quiz 
		final int TOTAL_Q = 5;
		
		// ------------- QUESTION 1 ---------------
		answer = Integer.parseInt(JOptionPane.showInputDialog(null, q1 + "\n" + answerList));
		
		// while loop that checks for valid responses 
		while(answer < 1 || answer > 5)
		{
			answer = Integer.parseInt(JOptionPane.showInputDialog(null, "Please choose a valid answer.\n" + q1 + "\n" + answerList));
		}
		
		// if statement that checks for a correct response 
		if(answer == 1)
		{
			JOptionPane.showMessageDialog(null, "Congrats! you got that one right!");
			correct++; // Adds one point to the user's score 
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Sorry you got that one wrong! \nThe correct answer was " + a1);
		}
		
		// --------------- QUESTION 2 ----------------
		answer = Integer.parseInt(JOptionPane.showInputDialog(null, q2 + "\n" + answerList));
		
		// while loop that checks for valid responses 
		while(answer < 1 || answer > 5)
		{
			answer = Integer.parseInt(JOptionPane.showInputDialog(null, "Please choose a valid answer.\n" + q2 + "\n" + answerList));
		}
		
		// if statement that checks for a correct response 
		if(answer == 2)
		{
			JOptionPane.showMessageDialog(null, "Congrats! you got that one right!");
			correct++; // Adds one point to the user's score 
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Sorry you got that one wrong! \nThe correct answer was " + a2);
		}
		
		// ----------------- QUESTION 3 ----------------
		answer = Integer.parseInt(JOptionPane.showInputDialog(null, q3 + "\n" + answerList));
		
		// while loop that checks for valid responses 
		while(answer < 1 || answer > 5)
		{
			answer = Integer.parseInt(JOptionPane.showInputDialog(null, "Please choose a valid answer.\n" + q3 + "\n" + answerList));
		}
		
		// if statement that checks for a correct response 
		if(answer == 3)
		{
			JOptionPane.showMessageDialog(null, "Congrats! you got that one right!");
			correct++; // Adds one point to the user's score 
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Sorry you got that one wrong! \nThe correct answer was " + a3);
		}
		
		// ------------------- QUESTION 4 --------------
		answer = Integer.parseInt(JOptionPane.showInputDialog(null, q4 + "\n" + answerList));
		
		// while loop that checks for valid responses 
		while(answer < 1 || answer > 5)
		{
			answer = Integer.parseInt(JOptionPane.showInputDialog(null, "Please choose a valid answer.\n" + q4 + "\n" + answerList));
		}
		
		// if statement that checks for a correct response 
		if(answer == 4)
		{
			JOptionPane.showMessageDialog(null, "Congrats! you got that one right!");
			correct++; // Adds one point to the user's score 
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Sorry you got that one wrong! \nThe correct answer was " + a4);
		}
		
		// ----------------- QUESTION 5 ---------------
		answer = Integer.parseInt(JOptionPane.showInputDialog(null, q5 + "\n" + answerList));
		
		// while loop that checks for valid responses 
		while(answer < 1 || answer > 5)
		{
			answer = Integer.parseInt(JOptionPane.showInputDialog(null, "Please choose a valid answer.\n" + q5 + "\n" + answerList));
		}
		
		// if statement that checks for a correct response 
		if(answer == 5)
		{
			JOptionPane.showMessageDialog(null, "Congrats! you got that one right!");
			correct++; // Adds one point to the user's score 
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Sorry you got that one wrong! \nThe correct answer was " + a5);
		}
		
		// Quiz is over, ouput a summary of the score 
		JOptionPane.showMessageDialog(null, "QUIZ COMPLETE \nYou got " + correct + " questions right out of " + TOTAL_Q + "\nYour score was " + (correct * 100 / TOTAL_Q) + "%");
		
	}
}