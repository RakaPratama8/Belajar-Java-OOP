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
        void sayHello(String Namanya){
                System.out.println("Hai " + Nama + ", Namaku " + Namanya );
        }
        void sayHello1(){
                System.out.println(Nama + ", " + Alamat + ", " + Usia);
        }
}
//METHOD -----------------------------------------------------------------
