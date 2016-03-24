
public class Vowels 
{
	public static void main(String[]args)
	{
		Vowels.printvowels("i am Student of CUW  ID - 327086");
	}

	static void printvowels(String x)
	{
		String vowels = "aeiouAEIOU";

		for(int i = 0; i < x.length(); i++)
		{
			if (vowels.indexOf(x.charAt(i))!=-1)
			{
				System.out.println(x.charAt(i));
			}
		}
	}
}

