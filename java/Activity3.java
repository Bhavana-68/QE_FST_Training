package activities;

public class Activity3 {
	public static void main(String[] args) {
		double Seconds = 1000000000;
		
		double EarthSeconds = 31557600;
		double MercurySeconds = 0.2408467;
		double VenusSeconds = 0.61519726;
		double MarsSeconds = 1.8808158;	
		double JupiterSeconds = 11.862615;
		double saturnSeconds = 29.447498;
		double uranusSeconds = 84.816846;
		double neptuneSeconds = 164.79132;
		System.out.println(" Age on Mercury : "+Seconds/EarthSeconds/MercurySeconds + "years");
		System.out.println(" Age on Venus : "+Seconds/EarthSeconds/VenusSeconds + "years");
		System.out.println(" Age on Mars : "+Seconds/EarthSeconds/MarsSeconds + "years");
		System.out.println(" Age on Jupiter : "+Seconds/EarthSeconds/JupiterSeconds + "years");
		System.out.println(" Age on Saturn : "+Seconds/EarthSeconds/saturnSeconds + "years");
		System.out.println(" Age on uranus : "+Seconds/EarthSeconds/uranusSeconds + "years");
		System.out.println(" Age on neptune : "+Seconds/EarthSeconds/neptuneSeconds + "years");
		


		
		
	}
	
	

}
