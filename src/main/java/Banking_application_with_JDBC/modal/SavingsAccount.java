package Banking_application_with_JDBC.modal;

public class SavingsAccount extends Account{
    public SavingsAccount(int acc_no, String name, double bal) {
        super(acc_no, name, bal);
    }

    @Override
    public String getAccountType() {
        return "Savings Account";
    }
}
