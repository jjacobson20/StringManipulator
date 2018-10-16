/**
 * 
 * @author jeremy
 *
 */

public class StringManipulator
{

	public String noVowels(String inputString)
	{
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		String noVowelStr = "";
		for(int i = 0; i<=inputString.length() - 1; i++)
		{
			for(char vowel: vowels)
			{
				if (inputString.charAt(i) == vowel)
				{
					noVowelStr += "*";
					i++;
					break;
				}
			}
			
			noVowelStr += inputString.charAt(i);
		}
		return noVowelStr;
	}
	
	public String reverse(String inputString)
	{
		String reverseStr = "";
		for(int i = inputString.length() - 1; i != -1; i--)
		{
			reverseStr += inputString.charAt(i);
		}
		
		return reverseStr;
	}
}
