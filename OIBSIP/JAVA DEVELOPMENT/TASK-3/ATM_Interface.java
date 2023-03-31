package OIBSIP;


import java.util.Scanner;

class ATM{
    float balance;
    int Pincode;
    Scanner sc= new Scanner(System.in);
    public void pin(){
        System.out.println("Enter your pincode : ");
        Scanner sc= new Scanner(System.in);
        int entered= sc.nextInt();
        menu();
    }
    public void menu(){
        System.out.println("Enter your Choice: ");
        System.out.println("1: Check Balance");
        System.out.println("2: Withdraw Money");
        System.out.println("3: Deposit Money");
        System.out.println("4: Transfer Money");
        System.out.println("5: Exit");
        int option=sc.nextInt();
        if(option==5){
            System.out.println("Thank You");
            return;
        }
        switch (option) {
            case 1: checkbalance();
            case 2: withdrawMoney();
            case 3: depositMoney();
            case 4: transferMoney();
            default:
                System.out.println("Enter a valid choice");
        }

    }
    public void checkbalance(){
        System.out.println("Your current bank balance is: "+ balance);
        menu();
    }
    public void withdrawMoney(){
        System.out.println("Enter the amount you want to withdraw ");
        float amount= sc.nextFloat();
        if(amount>balance){
            System.out.println("Insufficient balance");
        }
        else{
            System.out.println("Balance Withdrawn");
            balance=balance-amount;
            System.out.println("Your current balance is "+ balance);
            menu();
        }
    }
    public void depositMoney(){
        System.out.println("Enter the amount  of money to be deposited");
        float amount= sc.nextFloat();
        System.out.println(amount + " is successfully deposited");
        menu();
    }
    public void transferMoney(){
        System.out.println(" Enter the amount you want to transfer: ");
        float amount=sc.nextFloat();
        if(amount>balance){
            System.out.println("Sorry "+ amount + " is not present in your bank account");
            System.out.println("Do you want to deposit money?");
            System.out.println("1: Yes");
            System.out.println("2: No");
            int opt= sc.nextInt();
            switch (opt){
                case 1: depositMoney();
                case 2:
                    System.out.println(" Ok Thank You");
                default:
                    System.out.println("Please Choose Correct Option");
            }
        }
        else{
            System.out.println("Enter the account number of the reciever: ");
            float recieve= sc.nextFloat();
            System.out.println("You successfully transfered the money");
            balance=balance-recieve;
            menu();

        }
    }
}
public class ATM_Interface {
    public static void main(String[] args) {
         ATM atm= new ATM();
         atm.pin();

    }
}
