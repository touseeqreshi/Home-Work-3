
public class Consonants 
{
		public static void main(String[]args)
	{
			Consonants.printconsonants("i am Student of CUW  ID - 327086");
	}
		static void printconsonants(String s)
		{
			String consonants = "bcdfghjklmnpqrstvwxyz";

			for(int i=0; i < s.length(); i++)
			{
				if (consonants.indexOf(s.charAt(i))!= -1)
				{
					System.out.println(s.charAt(i));
				}
			}
		}
}
