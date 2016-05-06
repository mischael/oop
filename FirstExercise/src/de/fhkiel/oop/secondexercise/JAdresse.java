package de.fhkiel.oop.secondexercise;

public class JAdresse {
	private String strasse;
	private int plz;
	private int hausnummer;
	private String ort;
	
	// getter & setter Methoden
	public String getStrasse() {
		return strasse;
	}
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	public int getPlz() {
		return plz;
	}
	public void setPlz(int plz) {
		this.plz = plz;
	}
	public int getHausnummer() {
		return hausnummer;
	}
	public void setHausnummer(int hausnummer) {
		this.hausnummer = hausnummer;
	}
	public String getOrt() {
		return ort;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
	
	//Konstruktoren
	public JAdresse (String strasse, int hausnummer, int plz, String ort){
		this ();
		this.setStrasse(strasse);
		this.setHausnummer(hausnummer);
		this.setPlz(plz);
		this.setOrt(ort);	
	}
	public JAdresse() {
	}
}
	
