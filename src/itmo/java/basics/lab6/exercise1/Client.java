package itmo.java.basics.lab6.exercise1;

public class Client extends Human {
    private final String bankName;

    public Client(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    @Override
    public String getFullInfo() {
        return this.getName() + " " + this.getSurname() + " обслуживается в " + this.bankName;
    }
}
