package balanced;

import java.util.HashMap;
import java.util.Map;

public class BalancedWordsCounter {
    private int valueCount = 0;

    public Integer count(String input) {
        if (input == null || input.matches(".*\\d+.*")) {
            throw new RuntimeException();
        }

        char[] strArray = input.toCharArray();
        for(int i = 0; i< strArray.length;i++){
            Map<Character, Integer> mapOfBalance = new HashMap<Character,Integer>();
            Integer first = mapOfBalance.put(strArray[i], 1);
            valueCount++;
            for (int j = i+1;j<strArray.length;j++){
                char key = strArray[j];
                if (mapOfBalance.containsKey(key)) {
                    mapOfBalance.put(key, mapOfBalance.get(key) + 1);
                } else mapOfBalance.put(key, 1);

                boolean counter = true;
                for (final Character character : mapOfBalance.keySet()) {
                    if (!mapOfBalance.get(character).equals(mapOfBalance.get(key))) {
                        counter = false;
                    }
                }
                if (counter) {
                    valueCount++;
                }
            }

            }
        return valueCount;
        }
}
