package planes;

public abstract class Cessna implements Learjet{

	public void start(){
		System.out.println("The Cessna can start it's engine");
	}	
	public void stop(){
		System.out.println("The Cessna can stop it's engine");
	}
	public abstract void speedUp();
	
	public abstract void slowDown();
	
	
}


	
	
	
