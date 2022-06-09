class Child extends Parent{
    int age;

    Child(String name){ //SUPER CONSTRUCTOR
        super(name);
    }

    void sayHello(Integer age){
        System.out.println(age + " and " + this.age);
    }
}
