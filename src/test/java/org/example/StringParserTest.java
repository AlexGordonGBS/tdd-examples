package org.example;

import org.junit.jupiter.api.Test;

public class StringParserTest {
    StringParser sp;

    @Test
    public void shouldReturnNullOnNullInput() {
        sp = new StringParser();
        String result = sp.parseString(null);
        assert result==null;
    }

    @Test
    public void shouldTheFirstCharOnSingleWordInputAlex() {
        sp = new StringParser();
        String result = sp.parseString("Alex");
        assert result.equals("A");
    }

    @Test
    public void shouldTheFirstCharOnSingleWordInputDima() {
        sp = new StringParser();
        String result = sp.parseString("Dima");
        assert result.equals("D");
    }

    @Test
    public void shouldFeturnTheSortedListOfFirtsChars() {
        sp = new StringParser();
        String result = sp.parseString("Dima Alex Foma Tom");
        assert result.equals("A, D, F, T");
    }


}
