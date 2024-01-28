package task1;

public interface ListArr<T> extends Iterable<T> {

    public void add(T elem);

    public void remove(int index);

    public T get(int index);

    public boolean have(T elem);

    public T[] clear();
}
