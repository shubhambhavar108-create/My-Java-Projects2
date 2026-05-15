import java.util.Scanner;
class PrimeNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        int num=sc.nextInt();
        int flag=0;
        for(int i=2;i<=num/2;i++)
        {
            if(num%2==0)
            {
                flag++;
                break;
            }
        }
        if(flag==1)
            {
                System.out.println("Number is not prime");

            }
            else
            {
                System.out.println("Number is Prime");
            }
        

    } 
}