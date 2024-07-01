import java.util.ArrayList;

public class Library {
    ArrayList<Book>books= new ArrayList<Book>();
    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added successfully.");
    }
    public void removeBook(String ISBN){
        boolean flag = false;
        for (Book book : books){
            if(book.getISBN()==ISBN){
                flag = true;
                books.remove(book);
            }
        }
        if(!flag){
            System.out.println(
                    "No book were found with this ISBN."
            );
        }
    }
    public Book findBookByISBN(String ISBN){
        for (Book book: books) {
            if (book.getISBN() == ISBN) {
                return book;

            }
        }
        System.out.println("Book not found.");
        return null;
    }
    public void listBooks(){
        if (books.isEmpty()){
            System.out.println("No books available.");
        }else {
            for (Book book: books){
                System.out.println(book);
            }
        }
    }
}
