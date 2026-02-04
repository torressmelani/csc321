//Melanie Torres
/*
 *
 *csc 321
 *lab #4
 */
 import java.util.Scanner;
 public class mtorres4{
	public static void main(String[] args){
		Scanner input = new Scanner System.in);
		System.out.println("Enter a number to get a joke:");
		System.out.println("1. Ant joke \n2. Pig joke \n3. Fruit Joke\n4.Reptile Joke:");
		int user = input.nextInt();
		
		switch (user){
			case 1:	
 				System.out.println("Why can't male ants sink?.... Because they are buoy-ant.");
				break;
			case 2: 
                                System.out.println("What do you call a pig that dose karate?.... Pork Chop.");
                                break;
			case 3: 
                                System.out.println("Why did the strawberry cry?... They found themself in a jam.");
                                break;
			case 4: 
                                System.out.println("Whats the difference between an aligator and a corodile.... its about whether you see one later or in while.");
                                break;
			default:
				System.out.println("Invalid choice, select a number from 1 - 4");
				break;}


}
}
