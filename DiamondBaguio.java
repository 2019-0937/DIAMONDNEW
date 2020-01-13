import java.util.Scanner;
public class DIAMONDA
{
    public static void main(String args[]) 
    {
        int first=1;
	int second=1;
	int third=1;
	int spaces= 1;
        System.out.print("Enter the number of rows: ");
        Scanner s = new Scanner(System.in);
        first = s.nextInt();
        spaces = first - 1;
        for (third = 1; third <= first; third++) 
        {
            for (second = 1; second <= spaces; second++) 
            {
                System.out.print(" ");
            }
            spaces--;
            for (second = 1; second <= 2 * third - 1; second++) 
            {
                System.out.print("*");                
            }
            System.out.println("");
        }
        spaces = 1;
        for (third = 1; third <= first - 1; third++) 
        {
            for (second = 1; second <= spaces; second++) 
            {
                System.out.print(" ");
            }
            spaces++;
            for (second = 1; second <= 2 * (first - third) - 1; second++) 
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}