package edu.ldsbc.Assignment7;

import java.util.*;

public class SortComparer {

    private List<Integer> numbers;
    private List<Sorter> algorithms = new ArrayList<>();

    public void compareSorters(int sizeList){
        createRandomList(sizeList);
        InsertionSort insertionSort = new InsertionSort("ListInsertionSort");
        insertionSort.sort(numbers);
        SelectionSort selectionSort = new SelectionSort("ListSelectionSort");
        selectionSort.sort(numbers);
    }

    void createRandomList(int size){
        this.numbers =  new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i<size; i++){
            this.numbers.add(rand.nextInt(100));
        }
    }

    void createAcsendingList(int size){

    }

    void createDecsendingList(int size){

    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}