package lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyDeterminer<T> {

    private final List<T> elements;

    public FrequencyDeterminer(List<T> elements) {
        this.elements = elements;
    }

    public Map<T, Integer> determine() {
        var tempList = new ArrayList<>(elements);
        return tempList.stream().distinct().
                collect(Collectors.toMap(e -> e, e -> Collections.frequency(elements, e)));
    }
}
