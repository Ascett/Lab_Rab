package lab3;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class Splitter {

    private static final String SPLITTING_PATTERN = "([^\\s]+(?=[\\s])|(?<=[\\s])[^\\s]+)";
    private static final Pattern regex = Pattern.compile(SPLITTING_PATTERN);
    private final Matcher matcher;
    private final List<String> matches;

    public Splitter(String text) {
        this.matches = new ArrayList<>();
        this.matcher = regex.matcher(text);
        this.split();
    }

    private void split() {
        IntStream.
                iterate(0, i -> matcher.find(), i -> i++).
                forEach(i -> this.matches.add(matcher.group()));
    }

    public List<String> getMatches() {
        return this.matches;
    }
}
