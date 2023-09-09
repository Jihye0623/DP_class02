package hw.ch14;

public class Main {
    public static void main(String[] args) {
        Support jihye = new PrimeNumberSupport("서지혜");
        Support alice = new NoSupport("Alice");
        Support bob = new LimitSupport("Bob", 10);
        Support charlie = new SpecialSupport("Charlie", 429);
        Support diana = new LimitSupport("Diana", 40);
        Support elmo = new OddSupport("Elmo");
        Support fred = new LimitSupport("Fred", 70);

        // 사슬 형성 
        jihye.setNext(alice).setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);

        // 다양한 트러블 발생
        for (int i = 1; i < 100; i += 1) {
            jihye.support(new Trouble(i));
        }
    }
}
