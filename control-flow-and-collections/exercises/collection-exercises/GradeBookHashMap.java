import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradeBookHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        Scanner scr = new Scanner(System.in);

        System.out.println("enter the number of entries you want to add ");
        int n = scr.nextInt();
        scr.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("enter the student id :");
            int id = scr.nextInt();
            scr.nextLine();
            System.out.println("enter the student name :");
            String name = scr.nextLine();

            map.put(id, name);

           // scr.nextLine();
        }
        System.out.println(map.entrySet());
        System.out.println("/class roaster");
        for (Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry+"---->"+entry.getValue());

        }


    }
}
