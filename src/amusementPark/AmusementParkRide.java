package amusementPark;

public class AmusementParkRide {

	String rideName;
	double minHeight;
	private String amunsementParkName = "Wonderland";
	
	
	public String getAmunsementParkName() {
		return amunsementParkName;
	}


	public void setAmunsementParkName(String amunsementParkName1, boolean isManagement) {
		if(isManagement) {
			System.out.println("Welcome management, let's change the name");
		amunsementParkName = amunsementParkName1;
		}else {
			System.out.println("Name cannot be changed");
		}
	}


	public AmusementParkRide(String rName,double mHeight){
		rideName = rName;
		minHeight=mHeight;
	}
	
	
	public void eligibiltyForRide(double height) {
		//System.out.println("height : "+height);
		if(height>minHeight) {
			System.out.println("eligible to ride "+rideName);
		}else {
			System.out.println("Hurrr");
		}
		
	}
	
	// public returnType methodName(DataType Arguments)
	public boolean eligibiltyForRide(Person p) {
		
		boolean isEligible=false;
		
		if((p.height>90 && p.height<200)&&(p.weight>15&& p.weight<95)) {
			
			if(p.height<minHeight) {
			isEligible = true;
			}
		}
		return isEligible;
	}
	
//	public void somemethod(double height) {
//		System.out.println("height : "+height);
//	}
}
