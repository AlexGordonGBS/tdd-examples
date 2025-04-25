package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringParser {

    // input: "Alex Tom Dima Roman"
    // expected result: a sorted list of the first characters of the names:  "A D R T"
    // on null input return null
    //
    public String parseString(String input) {
        if (input == null) {
            return null;
        }
        if (input.length() == 1) {
            String result = input.substring(0, 1);
            return result;
        }
        String[] tokens = input.split(" ");
        List<String> list = Arrays.asList(tokens);
        List<String> list2 = list.stream()
                .map((w) -> w.substring(0, 1))
                .sorted()
                .collect(Collectors.toList());
        String result = String.join(", ", list2 );
        return result;
    }

}
