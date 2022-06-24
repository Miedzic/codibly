package bubble;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(-9.3);
        list.add(0.2);
        list.add(4.0);
        list.add(0.1);
        list.add(5.0);
        list.add(9.0);

        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(bubbleSort.sort(list));

    }
}
