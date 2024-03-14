public class Book extends Item{
    String author;
    int numberOfPages;
    String genre;

    @Override
    public void showInfo() {
        System.out.println("Day la mot so thong tin cua cuon sach nay: ");
        System.out.println("Ten san pham: " + name +
                ", ID san pham: " + ID + ", ten tac gia: " + author + ", so trang: " + numberOfPages +
                ", the loai: " + genre + ", gia thanh: " + price + "$");
        System.out.println(getDescription());
    }
    Book(String name, String description, String ID, float price, String author, int numberOfPages, String genre) {
        super(name, description, ID, price);
        this.author = author;
        this.numberOfPages = numberOfPages;
    }
}
