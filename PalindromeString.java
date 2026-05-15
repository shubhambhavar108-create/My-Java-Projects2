import java.util.Scanner;
class PalindromeString
{
  public static void main(String[] args)
 {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String");
    String s=sc.nextLine();
    String rev="";
    int leng=s.length();

    for(int i=leng-1;i>=0;i--)
    {
        rev=rev+s.charAt(i);    
    }
    if(rev.equalsIgnoreCase(s))
    {
        System.out.println("Palindrome String");
    }
    else
    {
        System.out.println("Not Palindrome String");
    }
 }

}