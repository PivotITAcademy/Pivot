package amusementPark;

public class AmusementParkMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//Toy Train ride
		AmusementParkRide toyTrain = new AmusementParkRide("Toy Train",100);
		
		AmusementParkRide rollerCoaster = new AmusementParkRide("Roller Coaster", 110);
		
		
		System.out.println("Park Name : "+toyTrain.getAmunsementParkName());
		
		rollerCoaster.setAmunsementParkName("LALALand",true);
		
		System.out.println("Park Name : "+rollerCoaster.getAmunsementParkName());
		
		Person p = new Person();
		
	}

}
