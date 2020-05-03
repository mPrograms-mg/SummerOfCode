import java.util.Scanner;
public class TS6
{
    public static void main(String[] args) 
    {
         
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter The Input=");
		
        int n = sc.nextInt();  
          
		//upper pattern  
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }
              
            for (int k = i; k <= n; k++) 
			{ 
				System.out.print(k+" "); 
			} 
			System.out.println(); 
		} 
		
		// Lower pattern
		for (int i = n-1; i >= 1; i--) 
		{
            for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
         
    }
}