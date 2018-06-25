package Equals;

public class Demo {

    public static void main(String[] args) {
        Identity i1 = new Identity();
        i1.name = "Ivan";
        i1.surname = "Ivanov";
        i1.series = "AA";
        i1.number = 123456;

        Identity i2 = new Identity();
        i2.name = "Ivan";
        i2.surname = "Ivanov";
        i2.series = "AB";
        i2.number = 123456;

        System.out.println(i1.equals(i2));


    }
}
