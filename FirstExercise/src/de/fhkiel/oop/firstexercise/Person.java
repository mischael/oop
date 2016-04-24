/*
 * test
 */
package de.fhkiel.oop.firstexercise;

public class Person {

	private String PersonalNr;
	private String Anrede;
	private String Vorname;
	private String Nachname;

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

		// m�gliche L�sung
		String s2 = ".....................................................................................................";

		// weitere m�gliche L�sung
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100; i++) {
			sb.append(".");
		}

		// weitere L�sung
		for (int i = 0; i < 100; i++) {
			s.concat(".");
		}

	}

}
