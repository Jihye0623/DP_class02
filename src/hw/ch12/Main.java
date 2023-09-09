package hw.ch12;

public class Main {
    public static void main(String[] args){
        System.out.println("<<<20210694 서지혜>>>");
        
        MultiStringDisplay md = new MultiStringDisplay();
        md.add("학번:20210694");
        md.add("이름:서지혜");
        md.add("핸드폰 번호: 010-9156-6233");

    
       Display d = new MultiSideBorder(
                        new UpDownBorder(
                                new FullBorder(
                                    new SideBorder(md, '%')
                                ),'='
                        ), '*',3
                    );

       d.show();
        
    }
}
