class Child extends GrandParent{

    Child(String name) { //SUPER CONSTRUCTOR
        super(name);
    }
    void sayHello (String name){
        System.out.println("Hi " + name + ", My name is Child " + this.name);
    }
}
