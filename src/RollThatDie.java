import java.util.Scanner;

public class RollThatDie {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int user1 = 10;
		int user2 = 10;
		int die1;
		int die2;
		String userAnswer;
		
		do {
		
		System.out.println("Do you wanna play some Dice? (y/n) ");
		userAnswer = scnr.next();
			
				
		System.out.println("Player one Score\tPlayer two Score");
		System.out.println(user1 + "\t\t" + user2);
		
		die1 = (int) (Math.random() * 6 + 1);
		die2 = (int) (Math.random() * 6 + 1);
		
		System.out.println("Die1\tDie2");
		System.out.println(die1 + "\t\t" + die2);
		
		if(die1 + die2 == 7 || die1 + die2 == 11) {
			user1 = user1 + 1;
			user2 = user2 - 1;
//			System.out.println("Player one\tPlayer two");
//			System.out.println(user1 + "\t" + user2);
		}
		else if (die1 + die2 == 2 || die1 + die2 == 12) {
			user1 = user1 - 1;
			user2 = user2 + 1;
//			System.out.println("Player one\tPlayer two");
//			System.out.println(user1 + "\t" + user2);
		}
		do {
			if(die1 + die2 != 2 && die1 + die2 != 12 && die1 + die2 != 7 && die1 + die2 != 11) {
				die1 = (int) (Math.random() * 6 + 1);
				die2 = (int) (Math.random() * 6 + 1);
				user1 = user1 + 1;
				user2 = user2 - 1;
			}
			
		}while(die1 + die2 != 2 && die1 + die2 != 12 && die1 + die2 != 7 && die1 + die2 != 11 );
		
		
		
		
		
		}while (userAnswer.equalsIgnoreCase("y")); 
		
		
	
	
	
	
	
	}
				
	}