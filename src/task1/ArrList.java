package task1;

import java.util.Arrays;
import java.util.Iterator;

/*
Представим, что в Java нет коллекции типа ArrayList.
Создать свой класс, симулирующий работу класса динамической
коллекции - т.е. создать свою кастомную коллекцию.
В основе коллекции будет массив.
Кастомная коллекция должна хранить элементы разных классов(т.е. это
generic).
Предусмотреть операции добавления элемента, удаления элемента,
получение элемента по индексу, проверка есть ли элемент в коллекции,
метод очистки все коллекции.
Предусмотреть конструктор без параметров - создает массив размером
по умолчанию.
Предусмотреть конструктор с задаваемым размером внутреннего
массива.
Предусмотреть возможность автоматического расширения коллекции
при добавлении элемента в том случае, когда коллекция уже заполнена.
 */
public class ArrList<T> implements ListArr<T> {
    private final int DEFAULT_SIZE = 0;
    private T[] arr;

    public ArrList() {
        arr = (T[]) new Object[DEFAULT_SIZE];
    }

    public ArrList( int size) {
        arr = (T[]) new Object[size];
    }

    public void add(T elem) {
        try {
            T[] temp = arr;
            arr = (T[]) new Object[arr.length + 1];
            System.arraycopy(temp,0,arr,0,temp.length);
            arr[arr.length - 1] = elem;
        } catch (ClassCastException e) {
            e.getMessage();
        }
    }

    public void remove(int index) {
        try {
            T[] temp = (T[]) new Object[arr.length - 1];
            for (int i = 0, j = 0; i < arr.length; i++) {
                arr[index] = null;
                if (arr[i] != null) {
                    temp[j] = arr[i];
                    j++;
                }
            }
            arr = temp;
        } catch (ClassCastException e) {
            e.getMessage();
        }
    }

    public T get(int index) {
        if (index > arr.length - 1) {
            return (T) "Вы вышли за границу массива";
        }
        return arr[index];
    }

    public boolean have(T elem) {
        boolean isHave = false;

        for (var a : arr) {
            if (a == elem) {
                isHave = true;
                break;
            }
        }

        return isHave;
    }

    public T[] clear() {
        return (T[]) new Object[0];
    }

    public int size() {
        return arr.length;
    }

    public void insert(T elem, int index) {
        if (arr.length - 1 >= index) {
            arr[index] = elem;
        } else {
            System.out.println("Вы вышли за границу");
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator<>(arr);
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}
