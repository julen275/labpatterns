package observer;

import java.util.Observable;

import domain.Covid19Pacient;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Observable pacient1=new Covid19Pacient("aitor", 35);
		Observable pacient2=new Covid19Pacient("miren", 30);
		new PacientObserverGUI (pacient1);
		Covid19Pacient p1=(Covid19Pacient)pacient1; 
		new PacientSymptomGUI (p1);
		new PacientObserverGUI (pacient2);
		Covid19Pacient p2=(Covid19Pacient)pacient2; 
		new PacientSymptomGUI (p2);
	}


}
