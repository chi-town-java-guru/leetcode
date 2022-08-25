package com.buycoinsellcoin;

import java.util.*;
import java.util.stream.Collectors;

public class SortByFrequency {
    //Sort by frequency
    public static void main(String[] args) {

        int[] input = {2, 5, 2, 8, 5, 6, 8, 8};//must return 8 8 8 2 2 5 5 6

        System.out.println(Arrays.toString(sortByFrequency(input)));

    }

    private static int[] sortByFrequency(int[] input) {
        int[] output = new int[input.length];
        int x = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();

        Arrays.stream(input).forEach(i -> freqMap.put(i, freqMap.containsKey(i) ? freqMap.get(i) + 1 : 1));

        Map<Integer, Integer> sortedMap = freqMap.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e2, LinkedHashMap::new));

        for (int i : sortedMap.keySet()) {
            for (int j = 0; j < sortedMap.get(i); j++) {
                output[x++] = i;
            }
        }
        return output;
    }

}
