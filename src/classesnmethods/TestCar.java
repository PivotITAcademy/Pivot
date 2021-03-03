package classesnmethods;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();
		car.brand = "BMW";
		car.color ="Red";
		
		System.out.println("Car details : "+" "+car.color+"  "+car.brand);
		
		car.startTheCar();
		car.applyGear();
		car.accelerate();
		car.applyBreak();
		
		car.stopTheCar();
	}

}
