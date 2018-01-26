import java.util.Scanner;

public class LabFive {

	public static void main(String[] args) {
	randNUmGen();
		
	}
	public static void randNUmGen() { 
		Scanner scnr = new Scanner(System.in);
			
		int userSides;
		String yesNO;
			
		System.out.println("Welcome to the Grand Circus Casino");
		System.out.println("How many sides should each die have? Enter here: ");
		userSides = scnr.nextInt();
		
		do {
		System.out.println("Are you ready to roll those die? Yes/No");
		yesNO = scnr.next();
		//System.out.println(yesNO);
		
		if(yesNO.equalsIgnoreCase("Yes")) {
			
		int ranDie1 = (int) (Math.random() * userSides +1); 
		int ranDie2 = (int) (Math.random() * userSides +1);
		
		if(ranDie1 == 1 && ranDie2 == 1) {
			System.out.println(ranDie1 + " " + ranDie2 + " Snake Eyes!");
		}
		else if(ranDie1 ==6 && ranDie2 ==6) {
			System.out.println(ranDie1 + " " + ranDie2 + " Box Cars!");
		}
		else if(ranDie1 + ranDie2 == 7 || ranDie1 + ranDie2 == 11 ) {
			System.out.println(ranDie1 +" " + ranDie2 + " CRAPS!");
		}
		
		else {	
		System.out.println(ranDie1 + " " + ranDie2);
		}
		}
		}while (yesNO.equalsIgnoreCase("yes"));

		
	//main {
	}
	
		
}