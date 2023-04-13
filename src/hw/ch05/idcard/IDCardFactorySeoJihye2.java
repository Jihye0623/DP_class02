package hw.ch05.idcard;

public class IDCardFactorySeoJihye2 {
    private static IDCardFactorySeoJihye2 singleton = null;

    private IDCardFactorySeoJihye2() {
        System.out.println("인스턴스를 생성했습니다.");
        slowdown();
    }

    public static synchronized IDCardFactorySeoJihye2 getInstance() {
        if (singleton == null) {
            singleton = new IDCardFactorySeoJihye2();
        }
        return singleton;
    }

    private void slowdown() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
    }
}
