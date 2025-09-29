import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankAccount{
    private String accountnumber;
    private String holdername;
    private double balance;
    private List<String> transactionhistory=new ArrayList<>();

    public BankAccount(String  accountnumber, String holdername, double balance) {
        this.accountnumber = accountnumber;
        this.holdername = holdername;
        this.balance = balance;
        transactionhistory.add("Account Created With Balance:"+balance);
    }
    public void depositamount(double amount){
        balance=balance+amount;
        transactionhistory.add("Deposited:"+amount+" Balance:"+balance);
    }
    public void withdraamount(double amount){
        if(balance>=amount){
            balance=balance-amount;
            transactionhistory.add("WithDraw:"+amount+" Balance:"+balance);
        }
        else {
            transactionhistory.add("Failed Withdrawl Amount of "+amount);
            System.out.println("Insufficient Balance");
        }
    }
    public void getbalance(){
        System.out.println("Balance="+balance);
    }
    public void printtransaction(){
        System.out.println("Transaction History");
        for(String tx:transactionhistory){
            System.out.println(tx);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("---Bank Account Details---");
        System.out.println("Enter Your Bank Account Number:");
        String  accountnumber=sc.nextLine();
        System.out.println("Enter Your Account Holder Name:");
        String accountholder=sc.nextLine();
        System.out.println("Enter Your Initial Balance:");
        double initialbalance=sc.nextDouble();
        BankAccount bankAccount=new BankAccount(accountnumber,accountholder,initialbalance);
        int choice;
        do{
            System.out.println("\n ---Bank Menu---");
            System.out.println("1-Deposit");
            System.out.println("2-WithDraw");
            System.out.println("3-CheckBalance");
            System.out.println("4-Transaction History");
            System.out.println("5-Exit");
            System.out.println("Enter Your Choice:");
            choice=sc.nextInt();
            switch (choice){
                case 1 -> {
                    System.out.println("Enter Amount");
                    bankAccount.depositamount(sc.nextDouble());
                    break;
                }
                case 2->{
                    System.out.println("Enter Amount");
                    bankAccount.withdraamount(sc.nextDouble());
                    break;
                }
                case 3->{
                    bankAccount.getbalance();
                    break;
                }
                case 4->{
                    bankAccount.printtransaction();
                    break;
                }
                case 5 -> {
                    System.out.println("Exit From Bank Menu!Vist Again");
                    return;
                }
                default -> System.out.println("Invalid Choice Please Try Again");
            }
        }while (choice!=5);
    }
}