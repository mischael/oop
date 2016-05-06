package de.fhkiel.oop.secondexercise;

public class JPerson extends JAdresse {
	private int personalNr;
	private String anrede;
	private String vorname;
	private String nachname;
	private JDatum geburt;
	private JDatum tod;
	private String person1;
	private String person2;
//getter & setter

	public void setGeburt(JDatum geburt) {
		this.geburt = geburt;
	}
	public String getPerson1() {
		return person1;
	}
	public void setPerson1(String person1) {
		this.person1 = person1;
	}
	public String getPerson2() {
		return person2;
	}
	public void setPerson2(String person2) {
		this.person2 = person2;
	}
	public JDatum getGeburt() {
		return geburt;
	}
	public JDatum getTod() {
		return tod;
	}
	public void setTod(JDatum tod) {
		this.tod = tod;
	}
	public void setPersonalNr (int personalNr1){
		this.personalNr=personalNr1;
	}
	public void setAnrede(String anrede1){
		this.anrede=anrede1;
	}
	public void setVorname(String vorname1){
		this.vorname=vorname1;
	}
	public void setNachname(String nachname1){
		this.nachname=nachname1;
	}
	public String getAnrede(){
		return this.anrede;
	}
	public String getVorname(){
		return this.vorname;
	}
	public String getNachname(){
		return this.nachname;
	}
	public int getPersonalNr(){
		return this.personalNr;
	}
//Konstruktoren
 public JPerson(int pNr, String a, String v, String n, String person1){
	 this.setPersonalNr(pNr);
	 this.setAnrede(a);
	 this.setVorname(v);
	 this.setNachname(n);
	 this.setPerson1(person1);
	 if(this.person1.equals("Mutter")){
		 this.setPerson2("Tochter");
	 } else{
		 this.setPerson2("Muttter");
	 }
 }
 public JPerson(int pNr, String a, String n){
	 this(pNr, a,"Daisy", n, "Mutter");
	 
	 if (a.equals("Mister")){
		 this.setPersonalNr(pNr);
		 this.setAnrede(a);
		 this.setVorname("Donald");
		 this.setNachname(n); 
	 } else {
		 this.setPersonalNr(pNr);
		 this.setAnrede(a);
		 this.setVorname("Daisy");
		 this.setNachname(n);
	 } 
}
 public JPerson(int pNr, String a){
	 this(pNr, a,"Daisy","Duck", "Mutter");
	 
	 if (a.equals("Mister")){

		 this.setVorname("Donald");
		 this.setNachname("Duck"); 
	 } else {

		 this.setVorname("Daisy");
		 this.setNachname("Duck"); 
	 }
 }
 public JPerson (int pNr){
	 this(pNr,"Miss","Daisy","Duck", "Mutter");
	 
 }
 public JPerson(String person1){
	 this.setPerson1(person1);	 
 }

 


}
