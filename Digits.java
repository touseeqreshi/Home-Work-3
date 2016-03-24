
public class Digits 
{
		public static void main(String[]args)
		{
			Digits.printdigits("i am Student of CUW  ID - 327086");
		}
		
		static void printdigits(String x)
		{
			String digits = "0123456789";

			for(int i = 0; i < x.length(); i++)
			{
				if (digits.indexOf(x.charAt(i))!=-1)
				{
					System.out.println(x.charAt(i));
				}
			}
		}
}
