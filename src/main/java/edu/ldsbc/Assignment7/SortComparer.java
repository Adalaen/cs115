package edu.ldsbc.Assignment7;

import java.util.*;

public class SortComparer {

    private List<Integer> numbbers;
    private List<Sorter> algorithms = new ArrayList<>();

    public void compareSorters(int sizeList){
        createRandomList(sizeList);
        SelectionSort selectionSort = new SelectionSort("ListSelectionSort");
        selectionSort.sort(numbbers);
    }

    void createRandomList(int size){
        this.numbbers =  new ArrayList<>(size);
        for (int i = 0; i>size; i++){
            Random rand = new Random();
            numbbers.add(new Integer(rand.nextInt(size)));
        }
    }

    void createAcsendingList(int size){

    }

    void createDecsendingList(int size){

    }

}