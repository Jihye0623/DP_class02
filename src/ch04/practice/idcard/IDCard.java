package ch04.practice.idcard;

import ch04.practice.framework.Product;

public class IDCard extends Product {
    private String owner;

    // visibility: 패키지 (같은 패키지에서만 호출 가능함, public 아님)
    // IDCard(String owner) {
    public IDCard(String owner) { 
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(this + "을 사용합니다.");  // +: 문자열 연결, this.toString() 자동 호출
    
    }
    
    @Override
    public String toString() {  // object 클래스로부터 상속
        return "[IDCard:" + owner + "]";
    }

    // public String getOwner() {
    //     return owner;
    // }
}
