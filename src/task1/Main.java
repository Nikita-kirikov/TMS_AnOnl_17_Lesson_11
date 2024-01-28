package task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrList<String> arr = new ArrList<>();
        arr.add("Vasua");
        arr.add("as");
        arr.add("as1");
        arr.add("as2");
        arr.add("as3");
        System.out.println("Amount - " + arr.size());
        System.out.println(arr.toString());
        arr.remove(1);
        arr.insert("AER", 1);
        System.out.println("get - " + arr.get(2));
        System.out.println("is have in arr " + arr.have("wert"));
        System.out.println(arr.toString());
        System.out.println(Arrays.toString(arr.clear()));
    }
}
