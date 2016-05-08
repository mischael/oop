package de.fhkiel.oop.secondexercise;
/*Beschreibung: Aufgabe 2
 * Michael Bagsik 926229 ; Jannik Winzenburg 926133 
 * Stand:05.08.2016
 */

public class Person extends Adresse {

	private int PersonalNr;
	private String Anrede;
	private String Vorname;
	private String Nachname;
	private MyDate gTag;
	private MyDate tTag;
	private Person parent;
	private Person child;
	
	
	public Person(int Personalnummer) {

		this(Personalnummer, "Miss", "Daisy", "Duck");

	}

	public Person(int Personalnummer, String Anrede) {

		this(Personalnummer, Anrede, "", "Duck");

		if (Anrede.equals("Mister")) {

			setVorname("Donald");

		} else {

			setVorname("Daisy");
		}

	}

	public Person(int Personalnummer, String Anrede, String vorname) {

		this(Personalnummer, Anrede, vorname, "Duck");

		if (Anrede.equals("Mister")) {
			
			setNachname("NACHNAME");
		}
	}

	public Person(int Personalnummer, String Anrede, String Vorname, String name) {

		setPersonalNr(Personalnummer);
		setAnrede(Anrede);
		setVorname(Vorname);
		setNachname(name);

	}

	@Override
	public void anmelden(Person anwohner){
		super.anmelden(this);
	}
	
	@Override
	public boolean abmelden(Person anwohner){
		return super.abmelden(this);
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
	
	public int getPersonalNr() {
		return this.PersonalNr;
	}

	public void setPersonalNr(int personalNr) {
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

}
