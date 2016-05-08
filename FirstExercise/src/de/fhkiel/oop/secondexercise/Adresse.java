package de.fhkiel.oop.secondexercise;
/*Beschreibung: Aufgabe 2
 * Michael Bagsik 926229 ; Jannik Winzenburg 926133 
 * Stand:05.08.2016
 */

public class Adresse extends MyDate {

	private String straﬂe;
	private int hausnummer;
	private int plz;
	private String ort;
	private Person[] anwohner;
	private final int LIMITANWOHNER = 50;

	public Adresse() {
		anwohner = new Person[this.LIMITANWOHNER];

	}

	public Adresse(String straﬂe, int hausnummer, int plz, String ort) {

		this();

		setStraﬂe(straﬂe);
		setHausnummer(hausnummer);
		setPlz(plz);
		setOrt(ort);
	}

	public void anmelden(Person anwohner) {

		if (this.anwohner.length < this.LIMITANWOHNER) {
			this.anwohner[this.anwohner.length + 1] = anwohner;
		}
	}

	public boolean abmelden(Person anwohner) {

		for (int i = 0; i < this.anwohner.length; i++) {
			return (this.anwohner[i] == anwohner) ? true : false;
		}

		return false;
	}

	public String getStraﬂe() {
		return straﬂe;
	}

	public void setStraﬂe(String straﬂe) {
		this.straﬂe = straﬂe;
	}

	public int getHausnummer() {
		return hausnummer;
	}

	public void setHausnummer(int hausnummer) {
		this.hausnummer = hausnummer;
	}

	public int getPlz() {
		return plz;
	}

	public void setPlz(int plz) {
		this.plz = plz;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

}
