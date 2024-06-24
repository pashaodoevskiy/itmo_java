package itmo.java.basics.lab9;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        return obj instanceof User && ((User) obj).name.equals(this.name);
    }

    @Override
    public int hashCode() {
        int hash = 31;

        return hash * 31 + name.hashCode();
    }
}
