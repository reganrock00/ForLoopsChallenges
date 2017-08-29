import java.util.Scanner;
public class ForLoopsChallenges 
{

	public static void main(String[] args) 
	{
		Donuts();
		Ascending();
		Multiples();
		Range();
		Draw();
		Extra();
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
		int fives = 5;
		for (fives = 5; fives < 101; fives = fives + 5)
			{
				System.out.println(fives);
			}
	}

	private static void Range() 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("bottom number");
		int lower = in.nextInt();
		System.out.println("top number");
		int upper = in.nextInt();
		int sum = 0;
		for (int i = lower; i <= upper; i++)
			{
				System.out.println(i);
				sum = sum + i;
			}
		System.out.println(sum);
	}

	private static void Draw() 

	{
		System.out.println(" *********");
		for (int x = 0; x < 7; x++)
			{
				System.out.println(" *       *");
			}
		System.out.println(" *********");
	}
	
	private static void Extra()
		{
			for (int odd = 7; odd < 51; odd = odd)
				{
					odd = odd + 3;
					System.out.println(odd);
					odd = odd + 7;
				}
			
		}
}
