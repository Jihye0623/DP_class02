package hw.ch14;

public class PrimeNumberSupport extends Support {
    public PrimeNumberSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (isPrimeNumber(trouble.getNumber())) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isPrimeNumber(int n){
        if (n==1) return false;

        for (int i = 2; i<=(int)Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
          }
          return true;
    }
}