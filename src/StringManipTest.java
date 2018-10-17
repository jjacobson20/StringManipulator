/**
 * 
 * @author jeremy
 *
 */
import java.util.Scanner;

public class StringManipTest
{
	public static void main(String[] args)
	{
		StringManipulator StringManip = new StringManipulator();
		boolean runAgain = true;
		String methodToRun = "";
		Scanner in = new Scanner(System.in);
		
		while(runAgain)
		{
			System.out.print("What method would you like to run? (reverse, no vowels)");
			methodToRun = in.nextLine();
			
			while(!methodToRun.equals("reverse")&& !methodToRun.equals("no vowels"))
			{
				System.out.print("Not a method, try again (reverse, no vowels)");
				methodToRun = in.nextLine();
			}
			
			if(methodToRun.equals("reverse"))
			{
				String strToReverse;
				
				System.out.print("Enter the string you want reversed: ");
				strToReverse = in.nextLine();
				System.out.printf("Reversed string: %s\n", StringManip.reverse(strToReverse));
			}
			
			else if(methodToRun.equals("no vowels"))
			{
				String strNoVowels;
				
				System.out.print("Enter the string you want to have no vowels: ");
				strNoVowels = in.nextLine();
				
				System.out.printf("String with no vowels: %s\n", StringManip.noVowels(strNoVowels));
			}
			
			System.out.print("Would you like to run this program again? (yes, no)");
			String userRunAgain = in.nextLine();
			
			if(userRunAgain.equals("yes"))
			{
				runAgain = true;
			}
			
			else if (userRunAgain.equals("no"))
			{
				runAgain = false;
			}
		}
		
		in.close();
	}
}
