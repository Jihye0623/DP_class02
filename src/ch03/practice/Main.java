package ch03.practice;

public class Main {
    public static void main(String[] args){
        AbstractDisplay c;

        c = new CharDisplay('a');   // 자식을 부모타입과 동일시함
        c.open();
        c.print();
        c.close();
        c.display();

        c = new StringDisplay("서지혜");    // 자식을 부모타입과 동일시함
        c.open();
        c.print();
        c.close();
        c.display();
    }
}
