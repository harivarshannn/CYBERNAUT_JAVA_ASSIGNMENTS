import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> searchByTitle(String title) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                results.add(book);
            }
        }
        return results;
    }

    public List<Book> searchByAuthor(String authorName) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().getName().equalsIgnoreCase(authorName)) {
                results.add(book);
            }
        }
        return results;
    }

    public List<Book> searchByGenre(String genre) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getGenre().equalsIgnoreCase(genre)) {
                results.add(book);
            }
        }
        return results;
    }

    public void displayBooks(List<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        Library library = new Library();

        Author author1 = new Author("Ilango Adigal");
        Author author2 = new Author("Thiruvalluvar");
        Author author3 = new Author("Jayakanthan");

        Book book1 = new Book("Silappathikaram", author1, "Tamil Literature");
        Book book2 = new Book("Thirukkural", author2, "Tamil Literature");
        Book book3 = new Book("Sirukathaigal", author3, "Tamil Literature");

       
        Author author4 = new Author("Carl Sagan");
        Author author5 = new Author("Stephen Hawking");

        Book book4 = new Book("Cosmos", author4, "Science");
        Book book5 = new Book("A Brief History of Time", author5, "Science");
        Book book6 = new Book("The Universe in a Nutshell", author5, "Science");

       
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);

        System.out.println("Search by title 'Cosmos':");
        library.displayBooks(library.searchByTitle("Cosmos"));

        System.out.println("\nSearch by author 'Thiruvalluvar':");
        library.displayBooks(library.searchByAuthor("Thiruvalluvar"));

        System.out.println("\nSearch by genre 'Science':");
        library.displayBooks(library.searchByGenre("Science"));
        
        System.out.println("\nSearch by genre 'Tamil Literature':");
        library.displayBooks(library.searchByGenre("Tamil Literature"));
    }
}
