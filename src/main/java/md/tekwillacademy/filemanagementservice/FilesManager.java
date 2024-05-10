package md.tekwillacademy.filemanagementservice;


import java.io.File;
import java.io.IOException;

public class FilesManager {

    public static boolean createTheFileIfDoesNotExist(File file) {
        try {
            return file.createNewFile();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
            return false;
        }

    }

    public static void informIfTheFileExist(File file) {
        if (file.exists()) {
            System.out.println("The file exists");
        } else {
            System.out.println("The file does not exist");
        }
    }

    public static void printTheFileName(File file) {
        System.out.println(file.getName());
    }

    public static void printTheAbsolutePath(File fileInput) {
        System.out.println(fileInput.getAbsolutePath());
    }

    public static void printIfTheFileIsADirectory(File file) {
        System.out.println("The file is a directory " + file.isDirectory());
    }

    public static void deleteTheFileIfExists(File file) {
        if (file.delete()) {
            System.out.println("The file is delete");
        } else {
            System.out.println("The file could not be deleted");
        }
    }
}
