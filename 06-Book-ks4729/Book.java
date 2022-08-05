public class Book{
  String bookName;
  int bookISBN;
  
  public Book(){
    bookName = "";
    bookISBN = 0;
  }
  public Book(String n, int i){
    bookName = n;
    bookISBN = i;
  }
  public void setBookName(String n){
    bookName = n;
  }
  public void setBookISBN(int i){
    bookISBN = i;
  }
  public String getBookName(){
    return bookName;
  }
  public int getBookISBN(){
    return bookISBN;
  }
  public String toString(){
    String temp = "" + bookName + " " + bookISBN;
    return temp;
  }
}
//   Time to solo...