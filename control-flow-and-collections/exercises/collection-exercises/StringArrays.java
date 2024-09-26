import java.util.Arrays;

public class StringArrays {
    public static void main(String[] args) {
        String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] word = str.split("\\.");
        System.out.println(Arrays.toString(word));
    }
}


