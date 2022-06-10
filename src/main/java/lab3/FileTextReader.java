package lab3;

import static utils.BufferedReaderExtension.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FileTextReader {

    private final String filePath;

    public FileTextReader(String filePath) {
        this.filePath = filePath;
    }

    public String readFile() {
        try(FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr)) {
            return IntStream.iterate(0, i -> ready(br), i -> i++).
                    mapToObj(i -> String.valueOf((char)read(br))).
                    collect(Collectors.joining());
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
