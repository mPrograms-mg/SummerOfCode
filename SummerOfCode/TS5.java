import java.util.Scanner;
public class TS5
{
    public static void main(String[] args) 
    {
         
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Input=");
		 int n = sc.nextInt();
    
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.println(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
				
			}
			for(int k=i;k<=n;k++)
			{
				System.out.println(" ");
			}
			for(int k=1;k<=i;k++)
			{
				
				System.out.print(k+" ");
			}
			
			System.out.println(" ");
		} 
		 
    }
}