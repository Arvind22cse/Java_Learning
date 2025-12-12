package Oops_practical;

import java.util.Queue;

public class Bank {
    private String Account_number;
    private String Account_holder_name;
    private double balance;

    public Bank(String Account_number, String Account_holder_name, double balance) {
        this.Account_number = Account_number;
        this.Account_holder_name = Account_holder_name;
        this.balance = balance;
    }
    public void withdraw(int amount){
        if(amount>0 && balance>=amount){
            balance-=amount;
            System.out.println("withdraw amount :"+amount+"Current balance:"+balance);
        }
        else if(amount<=0){
            System.out.println("Withdraw amount should be positive");
        }
        else{
            System.out.println("insufficient balance");
        }
    }
    public void deposit(int amount){
        if(amount>0){
            balance+=amount;
            System.out.println("deposit amount :"+amount+"Current balance:"+balance);
        }
        else {
            System.out.println("deposit amount should be positive");
        }
    }
    public void transfer(Bank toacc,int amount){
        if(amount>0 && balance>=amount) {
            this.withdraw(amount);
            toacc.deposit(amount);
            System.out.println("Transfered rs."+ amount+ " from "+this.Account_holder_name +" to "+toacc.Account_holder_name);
        }
        else {
            System.out.println("Insufficient balance");
        }
    }
    public void getinfo(){
        System.out.println("Account number:"+Account_number);
        System.out.println("Account holder name:"+Account_holder_name);
        System.out.println("Account balance:"+balance);
        System.out.println("-----------------------------------------------");
    }

    public static void main(String[] args) {
        Bank ac1=new Bank("1000","Arvi",10000);
        Bank ac2=new Bank("1001","Bharath",9000);
        ac1.getinfo();
        ac2.getinfo();

        ac1.withdraw(2000);
        ac2.deposit(2000);
        ac1.transfer(ac2,100);

        ac1.getinfo();
        ac2.getinfo();

    }
}
