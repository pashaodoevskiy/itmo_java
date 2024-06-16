package itmo.java.basics.lab6.exercise2;

public class BankEmployee extends Human {
    private final String bankName;

    public BankEmployee(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    @Override
    public String getFullName() {
        return this.getName() + " " + this.getSurname();
    }

    @Override
    public String getFullInfo() {
        return this.getName() + " " + this.getSurname() + " работает в " + this.bankName;
    }
}
