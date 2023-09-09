package hw.ch17;

public class NamePrintObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.print("NamePrintObserver:");
        int count = generator.getNumber();
        for (int i = 0; i < count; i++) {
            System.out.print("서지혜 ");
        }
        System.out.println("");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}
