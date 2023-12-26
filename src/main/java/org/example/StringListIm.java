package org.example;

import org.example.exceptions.NumberIsLowerThanNullException;

public class StringListIm implements StringList {
    private int size;

    public String[] arr;



    public StringListIm(int size) {
        if (size>0) {
            this.size = size;
            this.arr= new String[size];
        }else {
            throw new NumberIsLowerThanNullException("this number less than null try write number more than null");
        }
    }

    @Override
    public String add(String item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==null){
                arr[i] = item;
            }
        }
        return item;
    }

    @Override
    public String add(int index, String item) {
        return null;
    }

    @Override
    public String set(int index, String item) {
        return null;
    }

    @Override
    public String remove(String item) {
        return null;
    }

    @Override
    public String remove(int index) {
        return null;
    }

    @Override
    public boolean contains(String item) {
        return false;
    }

    @Override
    public int indexOf(String item) {
        return 0;
    }

    @Override
    public int lastIndexOf(String item) {
        return 0;
    }

    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public boolean equals(StringList otherList) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public String[] toArray() {
        return new String[0];
    }
}
