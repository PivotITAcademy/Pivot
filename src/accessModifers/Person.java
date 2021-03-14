package accessModifers;

public class Person {

	public double height;
	double weight;
	private int pinNumber=1122 ;
	
	private int sinCardNumber;
	
	public int getSinCardNumber() {
		return sinCardNumber;
	}

	public void setSinCardNumber(int sinCardNumber, boolean isCRA, int pinNo) {
		
		if(isCRA ) {
			
			if(pinNumber==pinNo) {
				
				this.sinCardNumber = sinCardNumber;
			}
				System.out.println("CRA has changed your sin number");
		}else {
			System.out.println("Pin is incorrect or you are not authorized");
		}
		
	}

	 Person(){
		
	}
	
	public Person(double  h, double w,int sin ){
		height =h;
		weight = w;
		sinCardNumber = sin;
		
	}
}
