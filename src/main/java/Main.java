import lab3.FileTextReader;
import lab3.FrequencyDeterminer;
import lab3.Splitter;

public class Main {
    public static void main(String[] args) {
        var ftr = new FileTextReader("./src/main/resources/text.txt");
        var sp = new Splitter(ftr.readFile());
        var fd = new FrequencyDeterminer<>(sp.getMatches());
        fd.determine().forEach((key, value) -> System.out.println(key + " " + value));
    }
}
