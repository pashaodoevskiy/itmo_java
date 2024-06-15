package itmo.java.basics.lab6.exercise3;

public enum Color {
    WHITE("Белый"),
    BLACK("Черный");

    private final String description;

    Color(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}