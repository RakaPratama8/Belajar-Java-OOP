class GrandParent {
    String name;

    GrandParent(String name){
        this.name = name;
    }
    void sayHello(String name){
        System.out.println("Hi " + name + ", My name is GrandParent " + this.name);
    }

}
