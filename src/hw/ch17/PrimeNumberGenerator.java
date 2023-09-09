package hw.ch17;

import java.util.Random;

public class PrimeNumberGenerator extends NumberGenerator {
    private Random random = new Random(); 
    private int number;        

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for (int i = 0; i < 100; i++) {
            number = random.nextInt(100) + 1;
            if (isPrimeNumber(number)){
                notifyObservers();
            }
        }
    }

    private boolean isPrimeNumber(int num){
        boolean isPrime = true;

        if (num==1){
            return false;
        }

        for(int i = 2; i < num; i++) {
			if(num%i == 0) {
				isPrime = false;
				break;
			}
		}
        return isPrime;
    }
    
}
