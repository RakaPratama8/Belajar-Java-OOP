package Raka.Pratama.Data;

class SocialMedia {
}
class Instagram extends SocialMedia {//Final Class cant be inheritanced
    void MethodFinal(String name){ //Final Method Cant be inheritanced
        System.out.println(name);
    }
}
class FakeInsta extends Instagram { //ERROR
    void MethodFinal(String name){ //ERROR

    }
}