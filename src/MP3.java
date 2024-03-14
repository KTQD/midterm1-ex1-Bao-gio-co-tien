public class MP3 extends Item{
    int duration;
    @Override
    public void showInfo() {
        System.out.println("Day la mot so thong tin cua chiec MP3 nay: ");
        System.out.println("Ten san pham: " + name +
                ", ID san pham: " + ID + ", thoi gian: " + duration + "s, " +
                ", gia thanh: " + price + "$");
        System.out.println(getDescription());
    }

    MP3(String name, String description, String ID, float price, int duration) {
        super(name, description, ID, price);
        this.duration = duration;
    }

}
