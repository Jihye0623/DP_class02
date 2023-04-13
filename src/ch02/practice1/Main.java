package ch02.practice1;

public class Main {
    public static void main(String [] arg){
        // Banner 이용하기
        // 직접 사용
        Banner b = new Banner("sjh");
        b.showWithParen();
        b.showWithAster();

        // 어댑터 이용하기
        // 가정: 클라이언트가 Banner를 직접 사용하지 못한다.
        // 해결: 어댑터를 이용하여 클라이언트가 사용하도록 하기
        // Banner 클래스를 수정해도 클라이언트는 영향을 안 받는다. 
        Print x = new PrintBanner("sjh");     // 어댑터 생성
        x.printWeak();
        x.printStrong();
    }
}