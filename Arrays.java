import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        String[] strings = {"Khie", "Laura", "Azlan"};
        Integer[] numbers = {1, 3, 5};
        ArrayList<Object> list = new ArrayList<Object>(3);
        list.add(new String("Name"));
        list.add(1);
        System.out.println(list.get(0));
        System.out.println(numbers[0]);
        System.out.println(strings[2]);
    }
}
