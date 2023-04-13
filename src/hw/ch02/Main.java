package hw.ch02;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("20210694 서지혜");
        FileIO f = new FileProperties();    // 어댑터 생성
        try {
            f.readFromFile("file.txt");
            f.setValue("Year", "2023");
            f.setValue("bornYear", "2001");
            f.setValue("StudentId", "20210694");
            f.setValue("name","Seo Jihye");
            f.setValue("Location","Seoul");
            f.writeToFile("SeoJiHye.txt");
            System.out.println("SeoJiHye.txt is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
