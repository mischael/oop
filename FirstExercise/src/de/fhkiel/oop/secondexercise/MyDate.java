package de.fhkiel.oop.secondexercise;

/*Beschreibung: Aufgabe 2
 * Michael Bagsik 926229 ; Jannik Winzenburg 926133 
 * Stand:05.08.2016
 */
public class MyDate {
	
	private int tag;
	private int monat;
	private int jahr;
	
	public int getTag() {
		return tag;
	}

	public void setTag(int tag) {
		this.tag = tag;
	}

	public int getMonat() {
		return monat;
	}

	public void setMonat(int monat) {
		this.monat = monat;
	}

	public int getJahr() {
		return jahr;
	}

	public void setJahr(int jahr) {
		this.jahr = jahr;
	}

	public MyDate(){
		
		setTag(1);
		setMonat(1);
		setJahr(2000);
	}
	
	public MyDate(int tag, int monat, int jahr){
		
		switch (monat) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if(tag > 0 && tag <= 31){
				
				setTag(tag);
				setMonat(monat);
				
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if(tag > 0 && tag <= 30){
				setTag(tag);
				setMonat(monat);
			}
			break;
		case 2:
			
			if(tag > 0 && tag <= 29){
				setTag(tag);
				setMonat(monat);
			}
			break;
		default:
			break;
		}
		
		if((tag != 0) && (tag > 0) && (tag < 31)){
			
			
			
		}
		setTag(tag);
		setMonat(monat);
		setJahr(jahr);
		
	}

}
