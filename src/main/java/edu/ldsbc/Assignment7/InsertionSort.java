package edu.ldsbc.Assignment7;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort extends Sorter {

    public InsertionSort(String name) {
        setName(name);
    }

    @Override
    public void sort(List<Integer> list) {

        for (int i = 1; i<list.size();i++){
            int num = list.get(i);
            list.remove(i);
            list.add(0
                    ,num);
        }
        printList(list);
    }


    void printList(List<Integer> list){
        for (int i = 0; i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("-----");
    }
}