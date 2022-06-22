package Raka.Pratama.Data;

public class Application {
    public static final int PROCESSOR;

    static {
        System.out.println("Processor: ");
        PROCESSOR = Runtime.getRuntime().availableProcessors();
    }
}
