import java.util.Scanner;
class FibonacciSeries 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No of times you want to print fibonacci series");
        int n=sc.nextInt();
        int a=0,b=1,c;
        System.out.print(a+","+b+",");
        for(int i=0;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+",");
        }
    }
}