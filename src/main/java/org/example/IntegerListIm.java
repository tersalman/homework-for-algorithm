package org.example;

import org.example.exceptions.ArrIsFullException;
import org.example.exceptions.ElementNotFoundException;
import org.example.exceptions.IndexOutOfBuondException;
import org.example.exceptions.ItemIsNullException;

import java.util.Arrays;

public class IntegerListIm implements IntegerList {
    private int size;

    public Integer[] arr;


    public IntegerListIm() {
        this.arr = new Integer[10];
    }

    public IntegerListIm(int size) {
        arr = new Integer[size];
    }

    public void validateIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBuondException();
        }
    }

    private void validateSize() {
        if (size == arr.length) {
            throw new ArrIsFullException();
        }
    }

    public void validateItem(Integer item) {
        if (item == null) {
            throw new ItemIsNullException();
        }
    }


    @Override
    public Integer add(Integer item) {
        validateSize();
        validateItem(item);

       arr[size++] = item;
        return item;
    }

    @Override
    public Integer add(int index, Integer item) {
        validateSize();
        validateItem(item);
        validateIndex(index);

        if (index == size) {
            arr[size++] = item;
            return arr[index];
        }

        System.arraycopy(arr, index, arr, index +1, size - index);
        arr[index] = item;
        size++;
        return arr[index];
    }


    @Override
    public Integer set(int index, Integer item) {
        validateIndex(index);
        validateItem(item);

        arr[index] = item;

        return item;
    }

    @Override
    public Integer remove(Integer item) {
        validateItem(item);
        int index = indexOf(item);
        if (index == -1) {
            throw new ElementNotFoundException();
        }

        if (index != size) {
            System.arraycopy(arr,index+1,arr,index,size-index);
        }

        size--;
        return item;
    }

    @Override
    public Integer remove(int index) {
        validateIndex(index);

        Integer item = arr[index];
        if (index != size) {
            System.arraycopy(arr,index+1,arr,index,size-index);
        }

        size--;
        return item;
    }

    @Override
    public boolean contains(Integer item) {
        Integer[] copyArray = toArray();
        sort(copyArray);
        return binarySearching(copyArray, item);
    }

    @Override
    public int indexOf(Integer item) {
        int a = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(item)) {
                return i;
            }
        }
        return a;
    }

    @Override
    public int lastIndexOf(Integer item) {
        int a = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i].equals(item)) {
                return i;
            }
        }
        return a;
    }

    @Override
    public Integer get(int index) {
        validateIndex(index);
        return arr[index];
    }


    @Override
    public boolean equals(IntegerList otherList) {
        return Arrays.equals(this.toArray(), otherList.toArray());
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public Integer[] toArray() {
        return Arrays.copyOf(arr, size);
    }

    public void sort(Integer[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

    private boolean binarySearching(Integer[] arr ,Integer item) {
        int min = 0;
        int max = arr.length - 1;

        while (min <= max) {
            int mid = (min + max) / 2;

            if (item == arr[mid]) {
                return true;
            }

            if (item < arr[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return false;
    }

    private static void swapElements(int[] arr, int indexA, int indexB) {
        int tmp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = tmp;
    }


    public static void bubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapElements(arr, j, j + 1);
                }
            }
        }
    }

    public static void sortSelection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minElementIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minElementIndex]) {
                    minElementIndex = j;
                }
            }
            swapElements(arr, i, minElementIndex);
        }
    }

    public static void sortInsertion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] >= temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }





}
