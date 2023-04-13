package ch02.practice1;

// 어댑터(상속을 이용) (implements Print : 어댑터는 항상 타켓 인터페이스를 제공해야 함)
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) { // 생성자
        super(string);  // 부모 생성자
    }

    @Override
    // 메소드 이름이 변환된다. 클라이언트는 prinWeak를 호출했는데 일은 showWithParen이 하니까
    public void printWeak() {   // 12볼트 
        showWithParen();    // 220볼트
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
