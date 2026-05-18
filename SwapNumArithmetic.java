import java.util.Scanner;
class SwapNumArithmetic
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number");
        int num1=sc.nextInt();
        System.out.println("Enter second Number");
        int num2=sc.nextInt();
        System.out.println("Before Swapping");
        System.out.println("First Number is "+num1);
        System.out.println("Second Number is "+num2);
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("After Swapping");
        System.out.println("First Number is "+num1);
        System.out.println("Second Number is "+num2);
    }
}