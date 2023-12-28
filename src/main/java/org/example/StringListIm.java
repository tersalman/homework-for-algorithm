package org.example;

import org.example.exceptions.ArrIsFullException;
import org.example.exceptions.ElementNotFoundException;
import org.example.exceptions.IndexOutOfBuondException;
import org.example.exceptions.ItemIsNullException;

import java.util.Arrays;

public class StringListIm implements StringList {
    private int size;

    public String[] arr;


    public StringListIm() {
        this.arr = new String[10];
    }

    public StringListIm(int size) {
        arr = new String[size];
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

    public void validateItem(String item) {
        if (item == null) {
            throw new ItemIsNullException();
        }
    }


    @Override
    public String add(String item) {
        validateSize();
        validateItem(item);

       arr[size++] = item;
        return item;
    }

    @Override
    public String add(int index, String item) {
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
    public String set(int index, String item) {
        validateIndex(index);
        validateItem(item);

        arr[index] = item;

        return item;
    }

    @Override
    public String remove(String item) {
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
    public String remove(int index) {
        validateIndex(index);

        String item = arr[index];
        if (index != size) {
            System.arraycopy(arr,index+1,arr,index,size-index);
        }

        size--;
        return item;
    }

    @Override
    public boolean contains(String item) {
        return indexOf(item) != -1;
    }

    @Override
    public int indexOf(String item) {
        int a = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(item)) {
                return i;
            }
        }
        return a;
    }

    @Override
    public int lastIndexOf(String item) {
        int a = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i].equals(item)) {
                return i;
            }
        }
        return a;
    }

    @Override
    public String get(int index) {
        validateIndex(index);
        return arr[index];
    }


    @Override
    public boolean equals(StringList otherList) {
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
    public String[] toArray() {
        return Arrays.copyOf(arr, size);
    }

}
