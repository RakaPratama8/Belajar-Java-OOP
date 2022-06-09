public class PersonApp {
    public static void main(String[] args) {

        var person1 = new Person();
        person1.Nama = "Rendi";
        person1.Alamat = "Sawangan";
        person1.Usia = 21;

        System.out.println(person1.Nama);
        System.out.println(person1.Alamat);
        System.out.println(person1.Usia);

        System.out.println("-----------------------------------------------------------------------------------------------------------");

        var person = new Person(); // Kondisi 1 //no parameter
        var person2 = new Person("Fatah"); // Kondisi 2 //1 parameter
        var person3 = new Person("Lina", "Jagakarsa", 23); // Kondisi 3 //3 parameter

        person.sayHello1();
        person2.sayHello1();
        person3.sayHello1();

        System.out.println("-----------------------------------------------------------------------------------------------------------");

        person.sayHello("Luna");
        person2.sayHello("Jaka");

    }
}
