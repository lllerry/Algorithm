package datastructure.datatype.iterator;

import java.util.Iterator;

/**
 * Created by lerry on 11/05/2017.
 */
public class ReverseArrayIterator<T> implements Iterator<T> {

    private int index;
    private T[] mContainer;

    public ReverseArrayIterator(T[] container) {
        mContainer = container;
        index = mContainer.length;
    }

    @Override
    public boolean hasNext() {
        return index > 0;
    }

    @Override
    public T next() {
        return mContainer[--index];
    }
}
