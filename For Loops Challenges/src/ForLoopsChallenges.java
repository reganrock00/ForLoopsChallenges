
public class ForLoopsChallenges 
{

	public static void main(String[] args) 
	{
		Donuts();
		Ascending();
		Multiples();
		Range();
		Draw();
	}

	private static void Donuts() 
	{
		int x =0;
		for (x = 0; x < 5; x++)
			{
				System.out.println("I love donuts!");
			}
		System.out.println(" ");
	}

	private static void Ascending() 
	{
		int number = 0;
		for ( int i = 0; i < 10; i++)
			{
				if (i < 5)
					{
						number = i + 1;
					}
				if (i > 4)
					{
						number = 10 - i;
					}
				System.out.println(number);
			}
		System.out.println(" ");
	}

	private static void Multiples() 
	{
		
	}

	private static void Range() 
	{
		
	}

	private static void Draw() 
	{
		
	}

}
