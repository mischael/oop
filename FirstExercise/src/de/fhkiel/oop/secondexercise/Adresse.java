package de.fhkiel.oop.secondexercise;

public class Adresse {
	
	private String straﬂe;
	private String hausnummer;
	private int plz;
	private String ort;
	private Person[] anwohner;
	private final int LIMITANWOHNER = 50;
	
	public Adresse(){
		anwohner = new Person[this.LIMITANWOHNER];
		
	}
	
	public Adresse(String straﬂe, String hausnummer, int plz, String ort){
		
		this();
		
		setStraﬂe(straﬂe);
		setHausnummer(hausnummer);
		setPlz(plz);
		setOrt(ort);
	}
	
	public void addAnwohner(Person anwohner){
		int i = 0;
		
		
	}
	
	
	
	public String getStraﬂe() {
		return straﬂe;
	}
	public void setStraﬂe(String straﬂe) {
		this.straﬂe = straﬂe;
	}
	public String getHausnummer() {
		return hausnummer;
	}
	public void setHausnummer(String hausnummer) {
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
