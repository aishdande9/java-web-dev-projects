import java.util.ArrayList;
import java.util.Scanner;

public class ListOfWords {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("apple");
        words.add("banana");
        words.add("guava");
        words.add("pineapple");
        words.add("orange");
        printWords(words);
    }

    public static void printWords(ArrayList<String> words) {
        Scanner scr = new Scanner(System.in);
        System.out.println("enter the number :");
        int num = scr.nextInt();

     for(int i=0;i< words.size();i++){
         if(words.get(i).length() == num){
             System.out.println(words.get(i));
       }
     }
        if(words.size() != num){
            System.out.println("word is not present");
        }



    }
}



