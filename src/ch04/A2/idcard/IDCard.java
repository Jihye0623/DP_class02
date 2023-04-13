package ch04.A2.idcard;

import ch04.A2.framework.Product;

public class IDCard extends Product {
    private String owner;
    private int serial;

    // IDCard(String owner, int serial) {
    public IDCard(String owner, int serial){
        // 부모의 인자 없는 생성자가 자동으로 호출됨
        // 명시적으로 부모의 인자있는 생성자를 호출하고 싶으면, 꼭 첫 줄에 super()를 호출해야 함
        System.out.println(owner + "의 카드를 " + serial + "번으로 만듭니다.");
        this.owner = owner;
        this.serial = serial;
    }

    @Override
    public void use() {
        System.out.println(this + "을 사용합니다.");
    }

    @Override
    public String toString() {
        return "[IDCard:" + owner + "(" + serial + ")]";
    }

    public String getOwner() {
        return owner;
    }

    public int getSerial() {
        return serial;
    }
}
