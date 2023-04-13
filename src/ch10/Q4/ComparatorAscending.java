package ch10.Q4;

import java.util.Comparator;

public class ComparatorAscending implements Comparator{

    @Override
    public int compare(Object a, Object b) {
       // 정렬 주체(List)는 음수가 리턴되면 그대로 두고, 양수가 리턴되면 위치를 서로 바꾼다
       return ((String)a).compareTo((String)b);  // String 클래스의 compareTo()를 이용해서 크기 비교
       // .이 우선 순위가 가장 높아 ()로 묶음    
       // 크기 비교 : a - b
       // a가 작을 때는 음수가 리턴, 클 때는 양수가 리턴
       // a가 더 클 때 위치를 서로 바꾼다 -> 큰 것을 뒤로 보냄 => 오름차순

    }
    
}
