// Demo07.java
public class Demo07 {
    public static void main(String[] args) {
        Printer p = new BasicPrinter();
        p.print("Hello"); // Works fine

        MultiFunctionMachine m = new MultiFunctionMachine();
        m.print("World");
        m.scan("/tmp/out");
        m.fax("1234567890");
    }
}
