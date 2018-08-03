import java.util.Scanner;
public class TwentyOne 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		String answer;
		//computer's roll
		int compSum=0;
		while(compSum<=17)
		{
			Die computer = new Die(6);
			computer.roll();
			int compDie=computer.getValue();
			compSum+=compDie;
		}	
		//user's turn to roll
		Die user = new Die(6);
		user.roll();
		int userDie1=user.getValue();
		int sumUser=userDie1;
		System.out.println("You got " + sumUser +". ");	
		System.out.print("Would you like to roll the dice to accumulate pounts? Type yes or no. ");
		answer = keyboard.nextLine();
		while(answer.equalsIgnoreCase("y")&&sumUser<21)
		{
			user.roll();
			userDie1=user.getValue();
			sumUser+=userDie1;
			System.out.println("You now have a sum of " + sumUser +". ");
			if(sumUser>21)
			{
				System.out.println("You went over 21. You lost your money.");
				break;
			}
			System.out.print("Would you like to roll the dice to accumulate more pounts? Type yes or no. ");
			answer = keyboard.nextLine();
		}
		if(answer.equalsIgnoreCase("n"))
		{
			System.out.println("Your sum is " + sumUser +". ");
			System.out.println("The computer got " + compSum+". ");
			if(compSum>21)
				System.out.println("You win!");
			else if(sumUser>compSum)
				System.out.println("You win!");
			else if(sumUser<compSum)
				System.out.println("You lost!");
			else if (sumUser==compSum)
				System.out.println("Tie.");
		}
	}
}
