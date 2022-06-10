package Lab4;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeCheckList {

    private List<Integer> elements;

    public PrimeCheckList() {
        elements = new ArrayList<>();
    }

    public int size() {
        return elements.size();
    }

    public void check(int item) {
        if (elements.contains(item)) {
            elements.remove((Object) item);
        }
    }

    public boolean hasAnyUnchecked() {
        return !elements.isEmpty();
    }

    public int pick() {
        var uncheckedElements = new ArrayList<>(elements);
        Collections.shuffle(uncheckedElements);
        return uncheckedElements.stream().findFirst().orElseThrow(NoSuchElementException::new);
    }

    public void fill(int n) {
       elements = IntStream.range(0, n).boxed().collect(Collectors.toList());
    }
}
