package planes;

public class GulfStream extends Cessna {
	
	public int learjetSize = 100;
	public static int wheels = 10;
	public final static int numberOfPilots = 2;
	
	public static void fly(){
		System.out.println("The plane will fly now");
	}	 
    public void start(){
     System.out.println("Start the engine of the plane"); 
    }
     public void stop(){
     System.out.println("Stop the engine of the plane "); 
    }	
	public void speedUp(){
		System.out.println("The plane will be speeding");
	}
	@Override
	public void slowDown(){
		System.out.println("The plane will be slowing down");
	}
}

	
	
     



