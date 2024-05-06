package md.tekwillacademy.exceptionsservicetask;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TextManager {

    public static int getTheTextLength(String text) {

        return text.length();
    }

    public static int getTheTextLengthWithTryAndCatch(String text) {
        try {
            return text.length();
        } catch (NullPointerException exceptionObject) {
            System.out.println("There is an exception: " + exceptionObject.getMessage());
            return 0;
        } finally {
            System.out.println("This block is executed each time");
        }
    }

    public static int getTheTextLengthWithIF(String text) {
        if (text == null) {
            return 0;

        } else {
            return text.length();
        }
    }

    public static void readDataWithTryCatch(String filename) {
        try {
            FileReader fileReader = new FileReader(filename);
        } catch (FileNotFoundException e){
            System.out.println("Continuam executia dar afisam mesajul stocat in obiectul capturat:" + e.getMessage());
        }

        System.out.println("Filereader was created");
    }

    public static void readWithoutTryAndCatch(String filename) throws FileNotFoundException {
        FileReader fileReader = new FileReader(filename);
        System.out.println("Metoda a fost executata");
    }

}


