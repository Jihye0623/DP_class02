package ch07.practice;

import javax.crypto.spec.GCMParameterSpec;

import ch15.A2.pagemaker.HtmlWriter;

public class Main {
    public static void main(String[] args){
        // TextBuilder 이용
        TextBuilder tb = new TextBuilder();
        Director d1 = new Director(tb);     // Dependency Injection: 구체적인 객체를 외부에서 주입

        d1.construct();

        String result = tb.getTextResult();
        System.out.println(result);

        // HTMLBuilder 이용
        HTMLBuilder hb = new HTMLBuilder();
        Director d2 = new Director(hb);

        d2.construct();

        String result2 = hb.getHTMLResult();
        System.out.println("파일 " + result2 + " 가 생성되었습니다.");
    }
    
}
