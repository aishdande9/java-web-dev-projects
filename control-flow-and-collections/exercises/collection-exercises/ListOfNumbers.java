import java.util.ArrayList;

public class ListOfNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(9);
        printEven(list);
    }

    public static void printEven(ArrayList<Integer> list) {
int sum = 0;
        for (Integer integer : list) {
            if (integer % 2 == 0) {
                sum += integer;

            }
        }
        System.out.println(sum);
    }
}




