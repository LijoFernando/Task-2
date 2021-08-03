package task2;

public class PojoClass {
    private int bookId,bookPrice;
    private String bookName,authorName;
    private long bookISBN;

    public void setBookId(int newBookId){
        this.bookId = newBookId;
    }
    public void setBookPrice(int newBookPrice){ this.bookPrice = newBookPrice; }
    public void setBookName(String newBookName){
        this.bookName = newBookName;
    }
    public void setAuthorName(String newAuthorName){
        this.authorName = newAuthorName;
    }
    public void setISBN(long newBookISBN){
        this.bookISBN = newBookISBN;
    }

    @Override
    public String toString(){
        return "Book Name: "+bookName+"\nBook ID: "+bookId+"\nAuthor Name: "+authorName+
                             "\nBook ISBN: "+bookISBN+"\nBook Price: "+bookPrice;
    }
}
