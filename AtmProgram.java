import java.util.Scanner;
class AtmProgram
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int balance=10000;
        System.out.println("Welcome to the Atm Machine");
        System.out.println("Press 1:Withdraw Ammount");
        System.out.println("Press 2:Deposit Ammount");
        System.out.println("Press 3:Check Balance");
        System.out.println("Press 4:Exit");
        int choice=scan.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println("Enter Withdrawable ammount");
            int Withdraw=scan.nextInt();
            if(balance>=Withdraw)
            {
                balance=balance-Withdraw;
                System.out.println("Please collect your money");
                break;
            }
            else
            {
                System.out.println("Insufficient Bank Balance");
                break;
            }
            
            case 2:
                System.out.println("Enter Deposit ammount");
                int Deposite=scan.nextInt();
                balance=balance+Deposite;
                System.out.println("Your money has been Successfully Deposited");
                break;
            case 3:
                System.out.println("Your current balance is:"+balance);
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("invalid Choice Please try again");
                break;

        }
    }
}