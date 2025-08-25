public class MultiFunctionMachine implements Printer, Scanner, Fax {
    @Override
    public void print(String text) {
        System.out.println("MFP printing: " + text);
    }

    @Override
    public void scan(String dstPath) {
        System.out.println("MFP scanning to " + dstPath);
    }

    @Override
    public void fax(String number) {
        System.out.println("MFP faxing to " + number);
    }
}
