#for loop chnage is done as per student view
public class ForLoop 
{  
	#adding a comment
	public static void main(String[] args) 
	{
		// Display Prime Numbers between 1 and 100
		
		System.out.println("This program displays the Prime numbers between 1 & 100");
		System.out.println();
		
		for (int i=2; i<100; i++)
		{
			int count = 0;
			int elsecount = 0;
			for (int j=1; j<=i; j++)
			{
				if (i%j==0)
					count++;
				else  elsecount++;
			}
			if (count<=2)
				System.out.println(i + " is a Prime number");
			else 
				System.out.println(i + " is not a Prime number");
		}
	}

}
