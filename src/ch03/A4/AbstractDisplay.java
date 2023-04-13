package ch03.A4;

public interface AbstractDisplay {  // 인터페이스 => 원래는 불가능했지만 지금은 구현된 메소드도 가능
    public void open();
    public void print();
    public void close();

    public default void display() {     // 인터페이스에서 구현된 메소드 쓰려면 키워드 default 붙이기!!
        open();
        for (int i = 0; i < 5; i++) {   // 하드 코딩: 수정하기 어려운 코드 => 유연성 떨어져서 안 좋음
            print();    
        }
        close();
    }
}
