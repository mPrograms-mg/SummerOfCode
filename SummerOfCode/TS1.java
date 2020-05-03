import java.util.Scanner;
public class TS1
{
  public static void main(String abc[])
  {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Input=");
		int in = sc.nextInt();
	
		//upper half of the Character
		for (int i = in-4; i >= 1; i--) 
        {
			int CharPrint=65; // for Capital alphabet  65 is ascii value
			for (int j = 1; j <= i; j++)
			{
                System.out.print(" "+(char)CharPrint);
				CharPrint++;	
            }
            System.out.println();
			
        }
		
		//lower half of the Character
         
        for (int i = 2; i <= in-4; i++) 
        {
			int CharPrint=65; 
		  for (int j = 1; j <= i; j++)
            {
                System.out.print(" "+(char)CharPrint);
				CharPrint++;
            }
            System.out.println();
		}		
  
    }
}


