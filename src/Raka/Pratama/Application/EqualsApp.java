package Raka.Pratama.Application;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Raka";
        first = first + " " +"Pratama";

        String second = "Raka Pratama";

        String third = "Raka Pratama";

        System.out.println(first);
        System.out.println(second);

        System.out.println(first == second);
        System.out.println(third == second);
        System.out.println(first.equals(second));
    }
}
