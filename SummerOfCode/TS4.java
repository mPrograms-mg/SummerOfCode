import java.util.Scanner;
public class TS4 
{
    public static void main(String[] args)
    {
       
        Scanner sc = new Scanner(System.in);
        
		System.out.print("Enter Input=");
        int n = sc.nextInt();
        
		for(int i=n;i>=1;i--)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}