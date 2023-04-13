package hw.ch03;

public class SeoJiHyeDisplay implements AbstractDisplay{
    private String name;
    private String studentId;
    private int grade;

    public SeoJiHyeDisplay(String name, String studentId, int grade) {
        this.name = name;
        this.studentId = studentId;
        this.grade = grade;
    }

    public void open(){
        System.out.println("================");
        System.out.println("덕성여대 컴퓨터공학과");
    }

    public void print(){
        System.out.println(studentId+" / "+grade+"학년 / "+name);
    }

    public void close(){
        System.out.println("템플릿 메소드 패턴 숙제입니다.");
        System.out.println("================");
    }

}
