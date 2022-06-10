package utils;

import java.io.BufferedReader;
import java.io.IOException;

public class BufferedReaderExtension {

    public static boolean ready(BufferedReader br) {
        try {
            return br.ready();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static int read(BufferedReader br) {
        try {
            return br.read();
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
