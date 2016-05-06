package de.fhkiel.oop.secondexercise;

public class JDatum {
	private int t;
	private int m;
	private int j;
	
	//Getter
	public int getTag(){
		return this.t;
	}
	public int getMonat(){
		return this.m;
	}
	public int getJahr(){
		return this.j;
	}
	//Setter
	public void setTag(int tag){
		this.t=tag;
	}
	public void setMonat(int monat){
		this.m=monat;
	}
	public void setJahr(int jahr){
		this.j=jahr;
	}
	//Konstruktoren
	public JDatum(int tag, int monat, int jahr){
		
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
	
	public JDatum (int tag, int monat){
		this(tag, monat, 2015);

	}
	public JDatum(int tag){
		this(tag, 1, 2015);
	}
	public JDatum(){
		this(1, 1, 2015);
	}
}
