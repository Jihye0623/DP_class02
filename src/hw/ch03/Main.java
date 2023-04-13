package hw.ch03;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay d = new SeoJiHyeDisplay("서지혜", "20210694", 3);
        d.display(10);
        d.display(5);
    }
}
