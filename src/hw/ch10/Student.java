package hw.ch10;

import java.util.Comparator;

public class Student implements Comparable<Student>{
    private String name;
    private String id;
    private int height;
    
    public Student(String name, String id, int height){
        this.name=name;
        this.id=id;
        this.height=height;
    }

    public int compareTo(Student s){
        Comparator c = new ComparatorAscending();
        return c.compare(this, s);
    }

    public String toString(){
        return "(이름:" + name + ",학번:" + id + ",키:" + height + ")";
    }

    public int getHeight(){
        return height;
    }
}