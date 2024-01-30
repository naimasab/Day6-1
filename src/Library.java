import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public Library(){
        books.add(new FictionBook("werewolf","kk","kk","supernatural"));
        books.add(new Book("","",""));
        books.add(new Book("","",""));
    }

    public void displayInformation(){
        for (Book book : books) {
            book.displayInfo();
            System.out.println();
        }
    }
}




