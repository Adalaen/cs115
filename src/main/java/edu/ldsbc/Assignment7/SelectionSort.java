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
        int runTime = list.size();
        for (int i = 0; i<runTime;i++){
            int item = smallestInt(list);
            sortedList.add(list.get(item));
            list.remove(item);
        }
    }

    int smallestInt(List<Integer> list){
        int smallestInteger = 100;
        int smallestIntegerP = 0;
        for (int i = 0; i<list.size();i++){
            if (list.get(i) < smallestInteger){
                smallestInteger = list.get(i);
                smallestIntegerP = i;
            }
        }
        return smallestIntegerP;
    }

    void printList(List<Integer> list){
        for (int i = 0; i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("-----");
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