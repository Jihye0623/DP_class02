package ch02.Q2;

import java.io.IOException;
import java.util.Properties;


public class Main {
    public static void main(String[] args) {
        Properties f = new Properties();
        try {
            f.readFromFile("file.txt");
            f.setValue("width", "1024");
            f.setValue("height", "512");
            f.setValue("depth", "32");
            f.writeToFile("newfile.txt");
            System.out.println("newfile.txt is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
