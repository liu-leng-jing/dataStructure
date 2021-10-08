package com.dr.data.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author dr
 * @create 2021-09-30
 */
public class Test {
    @org.junit.Test
    public void test() {
        List<Integer> ls = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            ls.add((int) (10 * Math.random()));
        }

        for (Integer num : ls) {
            System.out.print(num);
        }
        System.out.println();

        ListIterator<Integer> iterator = ls.listIterator();
        int i=0;
        while (iterator.hasNext()) {
                iterator.next();
                if (i==0){
                    iterator.add(3);
                }
                i++;
        }
        for (Integer num : ls) {
            System.out.print(num);
        }
    }
}
