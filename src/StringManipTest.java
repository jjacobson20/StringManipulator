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
		StringManipulator stringManip = new StringManipulator();
		Scanner in = new Scanner(System.in);
		
		System.out.print("What method would you like to run?");
		
		
		System.out.println(stringManip.reverse("cool text"));
		System.out.println(stringManip.noVowels("test these vowels"));
	}
}
