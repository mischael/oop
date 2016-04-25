package de.fhkiel.oop.secondexercise;
/*Beschreibung: Aufgabe 1 a) Aufwärts 
 * Michael Bagsik 926229 ; Jannik Winzenburg 926133 
 * Stand:24.04.2016
 */

public class Person extends Adresse {

	private String PersonalNr;
	private String Anrede;
	private String Vorname;
	private String Nachname;
	private MyDate gTag;
	private MyDate tTag;
	private Person parent;
	private Person child;

	public Person(String Personalnummer) {

		this(Personalnummer, "Miss", "Daisy", "Duck");

	}

	public Person(String Personalnummer, String Anrede) {

		this(Personalnummer, Anrede, "", "Duck");

		if (Anrede.equals("Mister")) {

			setVorname("Donald");

		} else {

			setVorname("Daisy");
		}

	}

	public Person(String Personalnummer, String Anrede, String vorname) {

		this(Personalnummer, Anrede, vorname, "Duck");

		if (Anrede.equals("Mister")) {
			
			setNachname("NACHNAME");
		}
	}

	public Person(String Personalnummer, String Anrede, String Vorname, String name) {

		setPersonalNr(Personalnummer);
		setAnrede(Anrede);
		setVorname(Vorname);
		setNachname(name);

	}

	public void setParent(Person parent){
		
		this.parent = parent;
		this.parent.setChild(this);
		
	}
	
	public Person getParent(){
		return this.parent;
		
	}
	
	public void setChild(Person child){
		this.child = child;
		this.child.setParent(this);
		
	}
	
	public Person getChild(){
		return this.child;
	}
	
	public void setGeburtstag(MyDate gTag){
		this.gTag = gTag;
		
	}
	
	public MyDate getGeburtstag(){
		return this.gTag;
	}
	
	public void setTodestag(MyDate tTag){
		this.tTag = tTag;
	}
	
	public MyDate getTodestag(){
		return this.tTag;
	}
	
	public String getPersonalNr() {
		return this.PersonalNr;
	}

	public void setPersonalNr(String personalNr) {
		PersonalNr = personalNr;
	}

	public String getAnrede() {
		return this.Anrede;
	}

	public void setAnrede(String anrede) {
		Anrede = anrede;
	}

	public String getVorname() {
		return this.Vorname;
	}

	public void setVorname(String vorname) {
		Vorname = vorname;
	}

	public String getNachname() {
		return this.Nachname;
	}

	public void setNachname(String nachname) {
		Nachname = nachname;
	}

	public void foo() {

		// Originalaufgabe es werden 101 String Instanzen erstellt
		String s = "";

		for (int i = 0; i < 100; i++) {

		}

		// mögliche Lösung
		String s2 = ".....................................................................................................";

		// weitere mögliche Lösung
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100; i++) {
			sb.append(".");
		}

		// weitere Lösung
		for (int i = 0; i < 100; i++) {
			s.concat(".");
		}

	}

}
