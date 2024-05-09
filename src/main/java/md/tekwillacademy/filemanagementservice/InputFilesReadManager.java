package md.tekwillacademy.filemanagementservice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class InputFilesReadManager {
    public static void printTheDataFromAFile(String file) {
        try {
            System.out.println(Files.readString(Path.of(file)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void printDataFromAFileByUsingFileReader(String filePath) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(filePath);
            int charNumber;
            while ((charNumber = fileReader.read()) != -1) {
                System.out.print((char) charNumber);
            }
            System.out.println();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void printDataFromAFileByUsingBufferReader(String filePath) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(filePath);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                    bufferedReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
