public class Main
{
	public static void main(String args[])
	{
		Book textBook = new Book();
		System.out.println(textBook.toString());

    Book hgttg = new Book("Hitchhikers Guide to the Galaxy", 345391802);
    System.out.println(hgttg.toString());

    textBook.setBookName("Learn JAVA now!!!");
    textBook.setBookISBN(12345678);
    System.out.println(textBook.getBookName() + " " + textBook.getBookISBN());

    System.out.println("Book 0 name: "+ textBook.getBookName() + " ISBN(" + textBook.getBookISBN() + ")");
    System.out.println("Book 1 name: "+ hgttg.getBookName() + " ISBN(" + hgttg.getBookISBN() + ")");
    
		System.out.println(textBook.toString());
    System.out.println(hgttg.toString());
	}
}