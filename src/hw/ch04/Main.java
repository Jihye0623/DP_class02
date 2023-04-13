package hw.ch04;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;
import hw.ch04.car.CarFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("<<20210694 서지혜>>");

        Factory factory = new CarFactory();
        Product car1 = factory.create("서지혜");
        Product car2 = factory.create("그랜저");
        Product car3 = factory.create("소나타");
        Product car4 = factory.create("캐스터");

        car1.use();
        car2.use();
        car3.use();
        car4.use();

        System.out.println();

        factory.printAllModelNames();
    }
}
