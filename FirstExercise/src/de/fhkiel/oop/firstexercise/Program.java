package de.fhkiel.oop.firstexercise;

public class Program {

	public static void main(String[] args) {
		
		//kostenintensive Aufgabe
		String s1 = "";
		for(int i = 0; i < 100; ++i)
		{s1 = s1 + ".";}
		
		//mögliche Lösung
		String s2 = ".....................................................................................................";
		
		//weitere mögliche Lösung		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100; i++) {
			sb.append(".");
		}
		
	}
	
}
