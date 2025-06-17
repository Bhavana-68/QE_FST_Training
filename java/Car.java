package activities;

public class Car {
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;

	public Car(String color, String transmission, int make) {
		this.color = color;
		this.transmission = transmission;
		this.make = make;
		this.tyres = 4;
		this.doors = 4;
	}

	public void displayCharacteristics() {
		System.out.println("Color of the car is: " + this.color);
		System.out.println(" Transmission type is:" + this.transmission);
		System.out.println(" Car was made in :" + this.make);
		System.out.println("Car tyres " + this.tyres);
		System.out.println("Car doors" + this.doors);
	}

	public void accelerate() {
		System.out.println("CAr is moving forward");
	}

	public void brake() {
		System.out.println("Stop the car");
	}
}
