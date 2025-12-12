package Banking_application_with_JDBC.modal;

public abstract class Account {
    protected int acc_no;
    protected String name;
    protected double bal;

    public Account(int acc_no, String name, double bal) {
        this.acc_no = acc_no;
        this.name = name;
        this.bal = bal;
    }

    public abstract String getAccountType();

    public void withdraw(int amount){
        if(amount>0 && amount<=bal){
            bal-=amount;
        }
        else if(amount>bal){
            System.out.println("Your balance is "+bal+" , so please enter the correct amount.");
        }
        else{
            System.out.println("Amount should be positive");
        }
    }
    public void deposit(int amount){
        if(amount>0){
            bal+=amount;
        }
        else{
            System.out.println("Amount should be positive");
        }
    }
    public double getBalance(){
        return bal;
    }
    public String getname(){
        return name;
    }




}
