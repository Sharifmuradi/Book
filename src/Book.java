public class Book {
    private String title;
    private String author;
    private String ISBN;
    private int year;
    public void setTitle(){
        this.title=title;
    }
    public String getTitle() {
        return title;
    }
    public void setAuthor(){
        this.author=author;
    }
    public String getAuthor(){
        return author;
    }
    public void setISBN(){
        this.ISBN=ISBN;
    }
    public String getISBN(){
        return ISBN;
    }
    public void setYear(){
        this.year=year;
    }
    public int getYear(){
        return year;
    }
    public Book(String title,String author,String ISBN,int year){
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
        this.year=year;
    }

    @Override
    public String toString() {
        return "\t title:"+"\t "+ title
                +"\t author:"+"\t"+ author
                +"\t ISBN:"+"\t"+ISBN
                +"\t year:"+year;
    }
}
