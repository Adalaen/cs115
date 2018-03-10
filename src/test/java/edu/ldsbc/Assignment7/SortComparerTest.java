package edu.ldsbc.Assignment7;

import org.junit.Test;

public class SortComparerTest {
    @Test
    public void compareSorters() throws Exception {
        SortComparer sortcomparer = new SortComparer();
        sortcomparer.compareSorters(9);
    }

    @Test
    public void createRandomList() throws Exception {
        SortComparer sortcomparer = new SortComparer();
        sortcomparer.createRandomList(9);
        System.out.println(sortcomparer.getNumbers());
    }
}