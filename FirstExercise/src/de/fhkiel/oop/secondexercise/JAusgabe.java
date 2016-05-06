package de.fhkiel.oop.secondexercise;


public class JAusgabe {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JPerson t1 = new JPerson(1, "Miss", "Daisy", "Duck", "Mutter");
		JPerson t2 = new JPerson(2, "Miss", "Miny", "Duck","Tochter");
		System.out.println(t1.getAnrede()+" "+ t1.getVorname()+" "+ t1.getNachname()+" ist die "+t1.getPerson1()+ " von "+ t2.getVorname()+" "+ t2.getNachname()+".");
	}

}
