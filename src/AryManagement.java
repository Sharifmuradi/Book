import java.util.Scanner;

public class AryManagement {
    Scanner scanner = new Scanner(System.in);
    Library library =new Library();
    public Book readBook(){
        return new Book(readTitle(),readAuthor(), readISBN(), readYear());
    }
    private String readTitle(){
        System.out.println("Enter the name of the book : ");
         return scanner.nextLine();

    }
    private String readAuthor(){
        System.out.println("Enter the name of the author of the book : ");
        return scanner.nextLine();

    }
    private String readISBN(){
        System.out.println("Enter the ISBN  : ");
        return scanner.nextLine();
    }
    private int readYear(){
        System.out.println("Enter the year of publication of the book : ");
        int year=0;
        String input = scanner.nextLine();
        try{
            year = Integer.parseInt(input);
            try{
                if(year<0||year>2024){
                    throw new ArithmeticException("Enter the exact year");
                }
            }catch (ArithmeticException exception){
                System.err.println("Enter the exact year");
            }

        }catch (NumberFormatException e){
            System.err.println("Invalid input, please enter a number.");
           year = readYear();
        }
        return year;
    }

    public void help() {
        while (true) {
            System.out.println("1. Add book\n" +
                    "2. Remove book\n" +
                    "3. Search book by ISBN\n" +
                    "4. Show all the books\n" +
                    "5. Exit");
            int enter = Integer.parseInt(scanner.nextLine());

            switch (enter) {
                case 1:
                    library.addBook(readBook());
                    break;
                case 2:
                    library.removeBook(readISBN());
                    break;
                case 3:
                    library.findBookByISBN(readISBN());
                    break;
                case 4:
                    library.listBooks();
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
