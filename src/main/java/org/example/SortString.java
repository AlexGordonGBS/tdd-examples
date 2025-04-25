package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortString {

    // input: sort the String "My Name is Alex and I work in Discover"
    // expected result: "Alex and Discover I is in My Name work"
    // on null input return null
    //
    public String sortString(String input) {
        if (input == null) {
            return null;
        }
        String[] tokens = input.split(" ");
        List<String> list = Arrays.asList(tokens);
        List<String> list2 = list.stream()
                .map((w) -> w.toUpperCase())
                .sorted()
                .collect(Collectors.toList());
        String result = String.join(" ", list2 );
        return result;
    }

}

