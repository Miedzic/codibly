package bubble;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class BubbleSort {

    public <T extends Comparable<T>> List<T> sort(List<T> input){
        int swaps = 0;
        int compares = 0;
        if (input.isEmpty()) {
            return input;
        }
        if (input.stream().allMatch(Objects::isNull)) {
            throw new RuntimeException();
        }
        input.removeIf(Objects::isNull);
        for (int i = 0; i < input.size(); i++)
            for (int j = 0; j < input.size() - 1; j++) {
                if (input.get(j).compareTo( input.get(j + 1)) > 0) {
                    swaps++;
                    compares++;
                    Collections.swap(input, j, j + 1);
                } else {
                    compares++;
                }
            }
        return input;
    }
}

