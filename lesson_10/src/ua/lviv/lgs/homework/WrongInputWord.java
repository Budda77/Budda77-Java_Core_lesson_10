package ua.lviv.lgs.homework;

public class WrongInputWord extends Exception{
	
	String message; 

	public WrongInputWord(String message) {
		super(message);
	}

}
