package ch10.practice;

// 열거형 클래스 -> 타입으로 사용 가능
public enum Hand {
    // 가위 바위 보를 나타내는 세 개의 enum 상수
    ROCK("바위", 0),    // 1개만 만들어짐
    SCISSORS("가위", 1),
    PAPER("보", 2);

    // enum이 가진 필드 
    private String name; // 가위 바위 보 손의 이름
    private int handvalue; // 가위 바위 보 손의 값 

    // 손의 값으로 상수를 얻기 위한 배열
    private static Hand[] hands = {
        ROCK, SCISSORS, PAPER
    };

    // 생성자 
    private Hand(String name, int handvalue) {
        this.name = name;
        this.handvalue = handvalue;
    }

    // 손의 값으로 enum 상수를 가져온다 
    public static Hand getHand(int handvalue) {
        return hands[handvalue];    // hands[0], hands[1], ....
    }

    // this(현재 손)가 h(인자로 들어온 손)보다 강할 때 true
    public boolean isStrongerThan(Hand h) {
        return fight(h) == 1;
    }

    // this가 h보다 약할 때 true
    public boolean isWeakerThan(Hand h) {
        return fight(h) == -1;
    }

    // 무승부는 0, this가 이기면 1, h가 이기면 -1
    private int fight(Hand h) {
        if (this == h) {
            return 0;
        } else if ((this.handvalue + 1) % 3 == h.handvalue) {
            return 1;
        } else {
            return -1;
        }
    }

    // 가위 바위 보의 문자열 표현
    @Override
    public String toString() {
        return name;
    }
}
