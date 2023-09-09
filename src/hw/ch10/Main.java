package hw.ch10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        students.add(new Student("최승훈", "123", 175));
        students.add(new Student("서지혜", "456", 168));
        students.add(new Student("강수정", "789", 170));
        students.add(new Student("여강휘", "222", 160));
        students.add(new Student("김채현", "999", 159));

        System.out.println("<<20210694 서지혜>>");
        System.out.println();

        System.out.println("**(1) 정렬 결과 (오름차순)");
        students.sort(new ComparatorAscending());
        System.out.println(students);
        System.out.println();

        System.out.println("**(2) 정렬 결과 (내림차순)");
        students.sort(new ComparatorDesending());
        System.out.println(students);
        
    }    
}
