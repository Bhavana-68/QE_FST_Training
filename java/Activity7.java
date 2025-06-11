package activities;

interface BicycleParts {
	int tyres = 2;
	int maxSpeed = 20;
}

interface BicycleOperations {
	void applyBrake(int decrementValue);

	void speedUp(int incrementValue);
}

class Bicycle implements BicycleOperations, BicycleParts {
	int gears;
	int currentSpeed;

	Bicycle(int gears, int currentSpeed) {
		this.gears = gears;
		this.currentSpeed = currentSpeed;
	}

	@Override
	public void applyBrake(int decrementValue) {
		if (currentSpeed != 0) {
			currentSpeed -= decrementValue;
		} else {
			System.out.println("Cycle Stopped");
		}
	}

	@Override
	public void speedUp(int incrementValue) {
		if (currentSpeed != maxSpeed) {
			currentSpeed -= incrementValue;
		} else {
			System.out.println("Cycle at max speed");
		}
	}

	public void bicycleDesc() {
		System.out.println("Bicycle has" + gears + "gears" + tyres + "tyres and maximum speed of " + maxSpeed);
		System.out.println("It's current speed is " + currentSpeed);
	}
}

class MountainBike extends Bicycle {
	int seatHeight;

	MountainBike(int gears, int currentSpeed, int seatHeight) {
		super(gears, currentSpeed);
		this.seatHeight = seatHeight;
	}

	public void setSeatHeight(int newValue) {
		this.seatHeight = newValue;
	}

	@Override
	public void bicycleDesc() {
		System.out.println("Mountain bike has " + gears + " gears " + tyres + "tyres and maxSpeed of " + maxSpeed);
		System.out.println("Current seat height : " + seatHeight);
		System.out.println("Current speed is : " + currentSpeed);
	}
}

class Activity7 {
	public static void main(String[] args) {
		Bicycle mb = new MountainBike(3, 0, 25);
		mb.bicycleDesc();
		mb.speedUp(20);
		mb.applyBrake(5);
		mb.bicycleDesc();
		
	}
}