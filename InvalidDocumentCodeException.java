/*
Carlos F. Meneses
03/25/2015
Bergen Community College
Advanced Java Programming

Homework Project 3, Phase 1, Problem 2
*/
/**
InvalidDocumentCodeExcepion.java: Creates excpetion class for App. (see 
also: InvalidDocumentCodeApp.java)
*/

public class InvalidDocumentCodeException extends Exception
{
	public InvalidDocumentCodeException()
	{
		super("Incorrect designation. Please try again...");
	}

}
