package org.example;

import org.junit.jupiter.api.Test;

public class SortStringTest {
    SortString ss;

    @Test
    public void givenNullInput_whenCalled_thenReturnNull() {
        ss = new SortString();
        String result = ss.sortString(null);
        assert result == null;
    }


    @Test
    public void givenStringInput_whenCalled_thenReturnSortedString() {
        ss = new SortString();
        String result = ss.sortString("My Name is Alex and I work in Discover");
        assert result.equals("ALEX AND DISCOVER I IN IS MY NAME WORK");
    }


}
