class Parent {
    String name;

    Parent(String name){
        this.name = name; //SUPER CONSTRUCTOR
    }

    void sayHello (String name){
        System.out.println("Hi " + name + ", My name is " + this.name);
    }
}
