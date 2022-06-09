class Person{
        String Nama;
        String Alamat;
        Integer Usia;
// CONSTRUCTOR ------------------------------------------------
        Person (String Nama, String Alamat, Integer Usia){
                this.Nama = Nama;
                this.Alamat = Alamat;
                this.Usia = Usia;
}
        Person (String Nama, String Alamat){
                this(Nama, Alamat, null);
        }

        Person(String Nama){
                this(Nama,null);
        }
        Person(){
        }
//CONSTRUCTOR --------------------------------------------------
//METHOD -----------------------------------------------------------------
        void sayHello(String Nama){
                System.out.println("Hai " + Nama + ", Namaku " + this.Nama );
        }
        void sayHello1(){
                System.out.println(Nama + ", " + Alamat + ", " + Usia);
        }
}
//METHOD -----------------------------------------------------------------
