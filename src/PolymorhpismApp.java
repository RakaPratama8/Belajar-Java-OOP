public class PolymorhpismApp {
    public static void main(String[] args) {
        GrandParent grandParent = new GrandParent("koko");
        grandParent.sayHello("Kiki");

        grandParent = new Parent("Lulu");
        grandParent.sayHello("Kiki");

        grandParent = new Child("Lala");
        grandParent.sayHello("Kiki");

        System.out.println("-----------------------  METHOD POLYMORPHISM  ------------------------------");

        sayHello(new GrandParent("Junaidi"));
        sayHello(new Parent("Junaida"));
        sayHello(new Child("Junaido"));

    }

    static void sayHello(GrandParent grandParent){
        System.out.println("Hi, " + grandParent.name);
    }
}
