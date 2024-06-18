package itmo.java.basics.lab7;

public class Airplane {
    public static void main(String[] args) {
        class Wing {
            private Integer weight;

            public Integer getWeight() {
                return weight;
            }

            public void setWeight(Integer weight) {
                this.weight = weight;
            }
        }

        Wing wing1 = new Wing();
        wing1.setWeight(1);
        System.out.printf("Вес первого крыла: %d\n", wing1.getWeight());

        Wing wing2 = new Wing();
        wing2.setWeight(2);
        System.out.printf("Вес второго крыла: %d", wing2.getWeight());
    }
}
