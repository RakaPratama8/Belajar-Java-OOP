package Raka.Pratama.Data;

public class Application {
    public static final int PROCESSOR;

    static {
        System.out.println("Processors: ");
        PROCESSOR = Runtime.getRuntime().availableProcessors();
    }
}
