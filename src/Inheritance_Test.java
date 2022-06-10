public class Inheritance_Test {
    public static void main(String[] args) {
        var inherit = new Child("Raka");
        inherit.sayHello("Fathan");

        var inherit2 = new Parent("Raihan");
        inherit2.sayHello("Jaka");

        System.out.println("--------------------------------------------------------");

        var head = new Head();
        System.out.println(head.angka());

        var body = new Body();
        System.out.println(body.angka());
        System.out.println(body.angkasuper());
    }
}
