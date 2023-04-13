package hw.ch05;

import hw.ch05.idcard.IDCardFactorySeoJihye2;

public class Main2 extends Thread {
    public static void main(String[] args) {
        System.out.println("<<20210694 서지혜>>");
        System.out.println("Start.");
        new Main2("최승훈").start();
        new Main2("서지혜").start();
        new Main2("강덕영").start();
        System.out.println("End.");
    }

    @Override
    public void run() {
        IDCardFactorySeoJihye2 obj = IDCardFactorySeoJihye2.getInstance();
        System.out.println(getName() + ": obj = " + obj);
    }

    public Main2(String name) {
        super(name);
    }
}
