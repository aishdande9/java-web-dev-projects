package technology;

import java.util.Random;

public abstract class AbstractEntity {

    public  int uniqueId() {
        Random ran = new Random();
        return ran.nextInt();
    }
}
