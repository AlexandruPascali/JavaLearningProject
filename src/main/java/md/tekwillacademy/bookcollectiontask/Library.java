package md.tekwillacademy.bookcollectiontask;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private String name;

    private List<Book> bookStock;

    public Library(String name) {
        this.name = name;
        bookStock = new ArrayList<>();
    }

    public void addBook(Book inputBook) {
        if (bookStock.add(inputBook)) {
            System.out.println("The book has been added: " + inputBook.getTitle());
        }
    }

    public int getTheNumberOfTheBooksInTheStock() {
        return bookStock.size();
    }

    public boolean containsBook(Book formalBook) {
        return bookStock.contains(formalBook);

    }

    public void printTheBookTitles() {
        try {
            for (int i = 0; i <= bookStock.size(); i++) {
                System.out.println("The book number " + i + " title is: "
                        + bookStock.get(i).getTitle());
            }
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("The number of indexes is not so big BRO!");
            System.out.println(exception.getMessage());
            System.out.println("The show must go on");
        }
    }
}
