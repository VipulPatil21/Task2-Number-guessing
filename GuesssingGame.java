package internship;
import java.util.Scanner;
import java.util.Random;
public class GuesssingGame {
	
	public static void main(String[] args) {
		int ans,guess;
		final int max=50;
		
		Scanner s=new Scanner(System.in);
		Random rand=new Random();
		
		ans=rand.nextInt(max);
		//System.out.println("answer is :"+ans);
		int count=0;
		for (int i = 0; ; i++) {
			System.out.println("Enter the Guess :");
			guess=s.nextInt();
			count++;
			
			if (guess==ans) {
				System.out.println("you got answer,at count :"+count);
				break;
				
			} else if(guess<ans) {
				System.out.println("your guess is minimum than answer");

			}
			else {
				System.out.println("your guess is maximum than answer");
			}
			
		}
		if (count ==1) {
			System.out.println("Bset");
			
		} else if(count<5){
			System.out.println("Good");

		}else {
			System.out.println("Looser");
		}
		
	}

}

	


