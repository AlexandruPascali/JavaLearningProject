package md.tekwillacademy.bookcollectiontask;

import java.util.HashMap;
import java.util.Map;

public class LibraryMafiaService {
    public static void main(String[] args) {
        Library carturestiLibrary001 = new Library("Carturesti");

        System.out.println(carturestiLibrary001.getTheNumberOfTheBooksInTheStock());

        Book prichindelBook001 = new Book("Prichindel1", "Spiridon Vangheli");
        Book prichindelBook002 = new Book("Prichindel2", "Spiridon Vangheli");
        Book prichindelBook003 = new Book("Prichindel3", "Spiridon Vangheli");

        carturestiLibrary001.addBook(prichindelBook002);
        carturestiLibrary001.addBook(prichindelBook003);
        carturestiLibrary001.addBook(prichindelBook002);

        System.out.println(carturestiLibrary001.getTheNumberOfTheBooksInTheStock());
        carturestiLibrary001.containsBook(prichindelBook001);

        carturestiLibrary001.printTheBookTitles();

        Library librariusibrary002 = new Library("Librarius");

        Book poorDadRichDad001 = new Book("Poor Dad, Rich Dad", "Robert K.");

        librariusibrary002.addBook(poorDadRichDad001);
        librariusibrary002.addBook(prichindelBook002);

        Map<String, Library> lanturiDeLibrarii = new HashMap<>();

        lanturiDeLibrarii.put("Str. Arborilor 4/2", carturestiLibrary001);
        lanturiDeLibrarii.put("Str. Stefan Cel Mare", librariusibrary002);

        for (Map.Entry<String, Library> dataSet : lanturiDeLibrarii.entrySet()) {
            System.out.println("The key is: " + dataSet.getKey());
            System.out.println("The value is: ");
            dataSet.getValue().printTheBookTitles();
        }
    }
}