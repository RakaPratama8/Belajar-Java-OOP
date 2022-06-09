class Manager{
    String name;
    String age;

    Manager(String name){
       this.name = name;
    }
    Manager(String name, String age){
       this.name = name;
       this.age = age;
    }
}

class Vice extends Manager{
    Vice(String name, String age){
        super(name, age);
    }
}