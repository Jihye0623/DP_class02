package hw.ch05.idcard;

import hw.ch05.framework.Product;

public class IDCardFactorySeoJihye1 extends Product{

    // 3. singleton 객체 미리 생성
    private static IDCardFactorySeoJihye1 singleton = new IDCardFactorySeoJihye1();

    // 1. 생성자를 private로 한다
    private IDCardFactorySeoJihye1(){
        System.out.println("인스턴스가 생성되었습니다.");
    }

    // 2. 객체를 얻어가는 메소드 구현
    public static IDCardFactorySeoJihye1 getInstance(){
        return singleton;
    }

    @Override
    public void use() {
        System.out.println(this + "을 사용합니다.");  // +: 문자열 연결, this.toString() 자동 호출
    }

}
