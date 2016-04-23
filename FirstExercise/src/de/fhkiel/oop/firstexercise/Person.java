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

		this(Personalnummer);

		if (Anrede.equals("Mister")) {
			setNachname("Duck");
			setVorname("Donald");
			setAnrede("Mister");
		}
	}

	public Person(String Personalnummer, String Anrede, String vorname) {

		this(Personalnummer, "Miss", vorname, "Duck");

		if (Anrede.equals("Mister")) {
			setPersonalNr(Personalnummer);
			setAnrede("Mister");
			setVorname(vorname);
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
	
	public void foo(){
		
		//Originalaufgabe
		String s = "";
		
		for (int i = 0; i < 100; i++) {
	
		}
			
		//mögliche Lösung
		String s2 = ".....................................................................................................";
		
		//weitere mögliche Lösung		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100; i++) {
				sb.append(".");
		}
		
		//weitere Lösung
		for (int i = 0; i < 100; i++) {
			s.concat(".");
		}
		
	}

}
