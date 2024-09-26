import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ListOfString {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String str = "I would not, could not, in a box. I would not, " +
                "could not with a fox. I will not eat them in a house. I will not eat them with a mouse";

        String[] word = str.split(" ");
        list.addAll(Arrays.asList(word));
        System.out.println(list);
     printWords(list);



    }
    public static void printWords(ArrayList<String> list){
        Scanner scr = new Scanner(System.in);
        System.out.println("enter number :");
        int num = scr.nextInt();


for(int i=0;i<list.size();i++){
    if(list.get(i).trim().length()==num){

        System.out.println(list.get(i));
    }
}

    }


}
