package planes;

import java.util.Scanner;

public class Boeing{
	
	int id;
	String name;
	static String pilot;
	static int pilotsAge[]={24,32,35,41,38,26};
	
	Boeing(int id, String name){
		this.id = id;
		this.name=name;
	}
	public void show(){
		System.out.println("This plane's id is" + " " +id + " " + "and "
				+ "name is" + " " + "" + name);
	}
	public static void main(String args[]){
		Boeing plane1 = new Boeing(119, "Cessna");
		Boeing plane2 = new Boeing(223, "GulfStream");
		plane1.show();
		plane2.show();
		
		System.out.println("The age of the first pilot is" + " " + pilotsAge[0]);
		System.out.println("The age of the second pilot is" + " " + pilotsAge[1]);
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Who is the first pilot?");
		pilot = scan.nextLine();
		System.out.println("The first pilot is" + " " + pilot);
					
	}
			
}	
		
		
	


