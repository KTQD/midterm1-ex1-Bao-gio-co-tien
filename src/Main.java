public class Main {
    public static void main(String[] args) {

        Item mp3 = new MP3("BR3000", "Day la mot san pham co nhieu tinh nang dot pha thoi dai",
                "BR#03", 34, 40000);
        mp3.showInfo();

        Item book = new Book("Giao trinh Chu nghia xa hoi khoa hoc", "Giao trinh the hien nhieu ket qua nghien cuu moi ve chu nghia xa hoi khoa hoc",
                "GT#01", 3, "Bo Giao duc va Dao tao", 276, "Giao trinh hoc");
        book.showInfo();

    }
}