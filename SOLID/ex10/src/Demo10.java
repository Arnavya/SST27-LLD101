public class Demo10 {
    public static void main(String[] args) {
        ReportService consoleReport = new ReportService(new ConsoleLogger());
        consoleReport.generate();

        ReportService fileReport = new ReportService(new FileLogger("report.log"));
        fileReport.generate();
    }
}
