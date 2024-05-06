package md.tekwillacademy.exceptionsservicetask;

import java.io.FileNotFoundException;

public class Execution {
    public static void main(String[] args) {
        try {
            TextManager.readWithoutTryAndCatch("sasas");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
