public class Boolean {
	
	public static void main(String[] args){
	
		double myFirstvalue = 20.00d;
		double mySecondValue = 80.00d;
		
		double myTotalValue = ((myFirstvalue + mySecondValue) * 100.00d);
		
		System.out.println(myTotalValue);
		
		double myRemainderValue = myTotalValue % 38.00d;
		
		System.out.println(myRemainderValue);
		
		boolean isThereRemainer = (myRemainderValue == 0) ? true : false;
		
		System.out.println(isThereRemainer);
		
		if (!isThereRemainer){
			System.out.println("Got some remainder");
		}	
		
	}
	
}