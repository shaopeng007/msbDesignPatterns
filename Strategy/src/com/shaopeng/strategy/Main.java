package com.shaopeng.strategy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /*int[] a={4,5,6,3,2,8,2,1};
        Sorter s=new Sorter();
        s.sort(a);
        System.out.println(Arrays.toString(a));*/

        Cat [] c={new Cat(1,1),new Cat(5,5),new Cat(2,2)};

       /* SorterCompareble s=new SorterCompareble();
        s.sort(c);
        System.out.println(Arrays.toString(c));*/
       SorterComparator<Cat> s=new SorterComparator<>();
       s.sort(c,new CathightComparator());
        System.out.println(Arrays.toString(c));
       s.sort(c,new CatWeightComparator());
        System.out.println(Arrays.toString(c));
    }
}
