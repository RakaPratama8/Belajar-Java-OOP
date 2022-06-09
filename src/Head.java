class Head {

    int angka(){
        return 0;
    }
}


class Body extends Head{

    int angka(){
        return 1; //OVERRIDE
    }
    int angkasuper (){
        return super.angka(); //SUPER
    }
}
