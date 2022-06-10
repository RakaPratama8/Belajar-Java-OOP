class Parent extends GrandParent{

    Parent(String name){
        super(name);
    }

    void sayHello (String name){
        System.out.println("Hi " + name + ", My name is Parent " + this.name);
    }
}
