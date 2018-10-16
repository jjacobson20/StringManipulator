
public class StringManipTest
{
	public static void main(String[] args)
	{
		StringManipulator stringManip = new StringManipulator();
		
		System.out.println(stringManip.reverse("cool text"));
		System.out.println(stringManip.noVowels("test these vowels"));
	}
}
