import java.util.Scanner;


public class TS3
{
	public static void main(String args[])
	{ 

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Input = ");
		int in = sc.nextInt();
    
		for(int i=1;i<=in;i++)
		{
			for(int j=i;j<=in;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i*2;j++)
			{
				if(j>1 && j<(i*2)-1)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}	
			}
			
			System.out.println("");
		} 
	}
}
	 