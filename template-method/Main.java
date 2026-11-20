public class Main {
    public static void main(String[] args) {
        ReportGenerator[] reports = {new CsvReport(), new HtmlReport(), new TextReport()};
        for (ReportGenerator report : reports) {
            report.generate();
        }
    }
}
