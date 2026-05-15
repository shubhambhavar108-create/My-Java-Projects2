import java.util.Scanner;
class PalindromeNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int rev=0,digit;
        int temp=num;
        while(num!=0)
        {
            digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        if(rev==temp)
        {
            System.out.println("Palindrome Number");

        }
        else
        {
            System.out.println("Not Palindrome number");
        }
    }
}