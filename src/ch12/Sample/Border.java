package ch12.Sample;

// 장식자를 나타내는 클래스
public abstract class Border extends Display {
    // 장식 대상
    protected Display display;       // 이 장식틀이 감싸는 '내용물'

    // 추상 클래스지만 생성자를 가짐
    protected Border(Display display) { // 인스턴스 생성 시 '내용물'을 인수로 지정
        this.display = display;
    }
}
