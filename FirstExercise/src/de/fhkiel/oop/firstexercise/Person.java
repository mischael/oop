package de.fhkiel.oop.firstexercise;

public class Person {

	private String PersonalNr;
	private String Anrede;
	private String Vorname;
	private String Nachname;

	public Person(String Personalnummer) {
		
		setPersonalNr(Personalnummer);
		setNachname("Duck");
		setVorname("Daisy");
		setAnrede("Miss");
	}

	public Person(String Anrede, String Personalnummer) {
		
		this(Personalnummer);
		
		if (Anrede.equals("Mister")) {
			
			setNachname("Duck");
			setVorname("Donald");
			setAnrede("Mister");
			setPersonalNr(Personalnummer);
		}

	}

	public Person(String Personalnummer, String Vorname, String Anrede) {

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

}
