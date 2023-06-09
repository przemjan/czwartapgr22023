package podstawy;

public class StringDemo {
    public static void main(String[] args) {

        String name = "Eugeniusz";

        int dlugosc;

        dlugosc = name.length();


        char inicjal;

        inicjal = name.charAt(4);


        String duze, male;

        name = name.toUpperCase();
        male = name.toLowerCase();

        System.out.println(name);

    }
}
