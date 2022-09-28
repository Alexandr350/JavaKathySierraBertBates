public class BooksTestDrive {
    public static void main(String[] args) {
        Books[] books = new Books[3];
        books[0] = new Books();
        books[1] = new Books();
        books[2] = new Books();

        int x = 0;
        books[0].titer = "Плоды Java";
        books[1].titer = "Java Гетсби";
        books[2].titer = "Сборник рецептов по Java";

        books[0].author = "Боб";
        books[1].author = "Сью";
        books[2].author = "Ян";

        while (x < 3){
            System.out.print(books[x].titer);
            System.out.print(", автор ");
            System.out.println(books[x].author);
            x++;
        }
    }
}
class Books{
    String titer;
    String author;
}
