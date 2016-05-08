package de.fhkiel.oop.secondexercise;

public class Ausgabe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(1, "Miss", "Daisy","Duck");
		Person p2 = new Person(2,"Mister","Donald", "Duck");
		Adresse a = new Adresse("Musterstraﬂe",1, 12345, "Entenhausen");
		MyDate d1 = new MyDate(1,1,2015);
		MyDate d2 = new MyDate(2,3,2008);
		
		
		System.out.println("Personalnummer"+"\t\t"+"Anrede"+"\t\t"+"Vorname"+"\t\t"+"Name"+"\t\t"+"Geburtsdatum");
		System.out.println(p1.getPersonalNr()+"\t\t\t"+p1.getAnrede()+"\t\t"+p1.getVorname()+"\t\t"+p1.getNachname()+"\t\t"+d1.getTag()+"."+d1.getMonat()+"."+d1.getJahr()+"\t\t");
		System.out.println(p2.getPersonalNr()+"\t\t\t"+p2.getAnrede()+"\t\t"+p2.getVorname()+"\t\t"+p2.getNachname()+"\t\t"+d2.getTag()+"."+d2.getMonat()+"."+d2.getJahr()+"\t\t");
		System.out.println();
		System.out.println();
		System.out.print("Adresse von:"+"\t\t\t");
		System.out.println("Adresse von:");
		System.out.print(p1.getVorname()+" "+ p1.getNachname()+"\t\t\t");
		System.out.println(p2.getVorname()+" "+ p2.getNachname());
		System.out.print(a.getStraﬂe()+" "+ a.getHausnummer()+"\t\t\t");
		System.out.println(a.getStraﬂe()+" "+ a.getHausnummer());
		System.out.print(a.getPlz()+" "+ a.getOrt()+"\t\t");
		System.out.println(a.getPlz()+" "+ a.getOrt());	
	}

}
