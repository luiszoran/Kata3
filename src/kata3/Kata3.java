package kata3;

public class Kata3 {

    public static void main(String[] args) {
        MailReader mailReader = new MailReader("mails.txt");
        HistogramBuilder builder = new HistogramBuilder();
        Histogram<String> histogram = builder.build(mailReader.readDoomains());
        new HistogramViewer<String>().print(histogram);
    }
}
