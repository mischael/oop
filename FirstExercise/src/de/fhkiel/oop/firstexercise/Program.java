package de.fhkiel.oop.firstexercise;

public class Program {

	public static void main(String[] args) {
		
		//kostenintensive Aufgabe
		String s1 = "";
		for(int i = 0; i < 100; ++i)
		{s1 = s1 + ".";}
		
		//m�gliche L�sung
		String s2 = ".....................................................................................................";
		
		//weitere m�gliche L�sung		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100; i++) {
			sb.append(".");
		}
		
	}
	
}
