package hw.ch11;

public class Main {
    public static void main(String[] args){
        Directory MyDocuments = new Directory("MyDocuments", "20230401", "SeoJiHye");
        Directory MyData = new Directory("MyData", "20230401", "SeoJiHye");
        Directory MyPictures = new Directory("MyPictures", "20230401", "SeoJiHye");

        File seojihye0 = new File("서지혜0.doc", "20230501", 1000, "SeoJiHye");
        File seojihye1 = new File("서지혜1.doc", "20230501", 2000, "SeoJiHye");
        File seojihye2 = new File("서지혜2.java", "20230501",3000, "SeoJiHye");
        File seojihye3 = new File("서지혜3.gif", "20230601", 4000, "SeoJiHye");
        File seojihye4 = new File("서지혜4.jpg", "20230601", 5000, "SeoJiHye");
        File seojihye5 = new File("서지혜5.png", "20230601", 6000, "SeoJiHye");

        MyDocuments.add(seojihye0);
        MyDocuments.add(MyData);

        MyData.add(seojihye1);
        MyData.add(seojihye2);
        MyData.add(MyPictures);

        MyPictures.add(seojihye3);
        MyPictures.add(seojihye4);
        MyPictures.add(seojihye5);

        System.out.println("<<<20210694 서지혜>>>");
        MyDocuments.printList();

    }
}
