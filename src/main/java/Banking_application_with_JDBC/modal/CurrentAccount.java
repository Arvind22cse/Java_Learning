package Banking_application_with_JDBC.modal;

public class CurrentAccount extends Account{

    public CurrentAccount(int acc_no, String name, double bal) {
        super(acc_no, name, bal);
    }

    @Override
    public String getAccountType() {
        return "Current Account";
    }
}
