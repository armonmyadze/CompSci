package com.havensclass.sorting;

import java.util.ArrayList;
import java.util.Random;

public class Sorting {

    public static void main(String [] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            list.add(random.nextInt(1000));
        }

        //Does selection sort, selects integers less than 500.
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 500) {
                temp.add(list.get(i));
            }
        }

        for (Integer num : temp) {
            System.out.print(num + ", ");
        }
        System.out.println();
        temp.clear();

        //Does insertion sort. Last Integer in list should be the greatest.
        int i, j;
        Integer tempNum = 0;
        for (i = 1; i < list.size(); i++) {
            j = i;
            while (j > 0 && list.get(j) < list.get(j-1)) {
                tempNum = list.get(j);
                list.set(j, (j-1));
                list.set((j-1), tempNum);
                --j;
            }
        }

        for (Integer num : list) {
            System.out.print(num + ", ");
        }
        System.out.println();

        //Does quicksort


    }
}
