import java.util.Scanner;
 
public class TS2
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Enter The Input=");
         
        int in = sc.nextInt();
         
        for(int i=1;i<=in ;i++)
        {
            for(int j=i; j <=in; j++)
            {
                System.out.print(j+"");
            }
			
			for (int k =in-1; k >=i; k--)
            {
                System.out.print(k+"");
            }
             
            System.out.println();
		}	
            
    }
}