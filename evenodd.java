import java.util.Scanner;
public class evenodd
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if(n/2==(n+1)/2)
        {
            System.out.println("given number is even");
        }
        else {
            System.out.println("given number is odd");
        }
    }
}
