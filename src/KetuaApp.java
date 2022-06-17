public class KetuaApp {
    public static void main(String[] args) {
        Wakil wakil = new Wakil();
        wakil.name = "Jamal";
        wakil.Doit(); //
        System.out.println(wakil.name); //

        Ketua ketua = (Ketua) wakil;
        ketua.Doit(); //
        ketua.name = "Cepi";
        System.out.println(ketua.name); //
    }
}
// SO VARIABLE CANT BE OVERRIDE, BUT METHOD CAN BE OVERRIDE
// ITS KNOWN AS VARIABLE HIDING NOT VARIABLE OVERRIDING
// VARIABLE STANDS FOR THEMSELF or INDEPENDENT
