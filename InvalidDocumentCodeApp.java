/*
Carlos F. Meneses
03/25/2015
Bergen Community College
Advanced Java Programming

Homework Project 3, Phase 1, Problem 2
*/
/**
InvalidDocumentCodeApp.java: Throws InvalidDocumentCodeException when an 
improper designation for a document (neither unclassified, confidential, or 
proprietary) is encountered during processing. If a document designation is 
encountered that doesn’t fit that description, the exception is thrown. (see 
also: InvalidDocumentCodException.java)
*/

import java.util.Scanner;

public class InvalidDocumentCodeApp 
{
	public static void main(String[] args) 
	{
		String doneString = "done";
		String inputMsg = "Enter a two-character designation starting with " + 
						  "either U, C, P. Type " + doneString.toUpperCase() + 
						  " to finish > ";
		String userInput = "";
		String userInputUpper = "";
		boolean done = false;
		String byeMsg = "Have a great day!";
		Scanner scan = new Scanner(System.in);
			
		while(!done)
		{
			try
			{
				System.out.print(inputMsg);
				userInput = scan.nextLine();
			
				if (doneString.equalsIgnoreCase(userInput))
				{
					done = true;
				}
				
				userInputUpper = userInput.toUpperCase();
				if (userInputUpper.charAt(0) != 'U' && 
					userInputUpper.charAt(0) != 'C' && 
					userInputUpper.charAt(0) != 'P' || 
					userInputUpper.length() != 2)
					throw (new InvalidDocumentCodeException());
				
					else System.out.println("Correct designation. [Thumbs up] ... ");

			}
			
			catch(InvalidDocumentCodeException idce)
			{
				System.out.println(idce);
			}
		}
		
		System.out.println(byeMsg);
	}
		
}
