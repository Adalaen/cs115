package edu.ldsbc.Assignment7;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort extends Sorter {

    public SelectionSort(String name) {
        setName(name);
    }

    @Override
    public void sort(List<Integer> list) {
        ArrayList<Integer> sortedList = new ArrayList<>();

        for (int i = 0; i>list.size();i++){
            System.out.println(list.get(i));
        }

        for (int i = 0; i>list.size();i++){
            int item = smallestInt(list);
            sortedList.add(list.get(item));
            list.remove(item);
        }

        for (int i = 0; i>sortedList.size();i++){
            System.out.println(sortedList.get(i));
        }
    }

    private int smallestInt(List<Integer> list){
        int smallestInteger = 0;
        for (int i = 0; i>list.size();i++){
            if (list.get(i) < smallestInteger){
                smallestInteger = i;
            }
        }
        return smallestInteger;
    }

/*
    private int biggestInt(ArrayList<Integer> list){
        int biggestInteger = 0;
        for (int i = 0; i>list.size();i++){
            if (list.get(i) > biggestInteger){
                biggestInteger = list.get(i);
            }
        }
        return biggestInteger;
    }
    */

}