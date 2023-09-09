package ch11.practice;

import javax.swing.event.SwingPropertyChangeSupport;

public class Main {
    public static void main(String[] args){
        Directory root = new Directory("root");

        // Entry의 자식이 너무 다르니까, 자식으로 선언할 수 밖에
        Directory bin = new Directory("bin");   
        Directory tmp = new Directory("tmp");
        Directory usr = new Directory("usr");
        
        // 컴파일러 입장에서는 변수의 타입이 실제 들어간 객체보다 중요함
        // ((Directory)root).add(bin); -> root 타입이 entry일 때
        root.add(bin);
        root.add(tmp);
        root.add(usr);

        bin.add(new File("vi", 100));
        bin.add(new File("latex", 200));
        
        System.out.println(root.getSize());
        root.printList();
    }
}
