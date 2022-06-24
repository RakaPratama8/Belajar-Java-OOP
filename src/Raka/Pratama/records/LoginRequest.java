package Raka.Pratama.records;

public record LoginRequest(String username, String password) {
    //record class tidak bisa di extend, tapi bisa di implement
    public LoginRequest {
        System.out.println("Halo, Selamat datang: ");
    }
    public LoginRequest (String username) {
        this(username, "");
    }
    public LoginRequest () {
        this("", "");
    }
}
