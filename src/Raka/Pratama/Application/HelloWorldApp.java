package Raka.Pratama.Application;

import Raka.Pratama.Data.HelloWorld;

public class HelloWorldApp{
    public static void main(String[] args) {

        HelloWorld english = new HelloWorld() { //Anonymus class
            public void sayHello() {
                System.out.println("Hello");
            }

            public void sayHello(String name) {
                System.out.println("Hello" + name);

            }
        };

        HelloWorld indonesia = new HelloWorld() { //Anonymus class
            public void sayHello() {
                System.out.println("Halo");
            }

            public void sayHello(String name) {
                System.out.println("Halo" + name);

            }
        };

        english.sayHello();
        english.sayHello("Raka");
        indonesia.sayHello();
        indonesia.sayHello("Raka");

    }
}
