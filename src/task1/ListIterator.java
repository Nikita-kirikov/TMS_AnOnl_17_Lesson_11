package task1;

import java.util.Iterator;

public class ListIterator<T> implements Iterator<T> {
    private int index = 0;
    private T[] arr;

    public ListIterator(T[] arr) {
        this.arr = arr;
    }

    @Override
    public boolean hasNext() {
        return index < arr.length;
    }

    @Override
    public T next() {
        return arr[index++];
    }
}
