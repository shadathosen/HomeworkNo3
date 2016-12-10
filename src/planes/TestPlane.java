package planes;

public class TestPlane {
	
	public static int Sammy = 23;
	public static int John = 43;	
	
		
	public static void main(String[]args) {
	
	GulfStream gulfstream = new GulfStream();
	gulfstream.slowDown();
	gulfstream.speedUp();		
	 
	Learjet learjet = new GulfStream();
	learjet.start();
	learjet.stop();
	
	GulfStream.fly();
	GulfStream.wheels = 12;
	
	System.out.println("GulfStream plane requires atleast" + " " +
	GulfStream.numberOfPilots + " " + "pilots");
	
	if (John > Sammy){
		System.out.println("John is going to fly");
	}
	else{
		System.out.println("John is not going to fly");
	}
	while(Sammy < 30){
		System.out.println("Sammy is a young pilot");
		Sammy++;
	}
	 
  }
	
	
}
		
		
		
		
		
		


