package hw.ch16;

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

// 자기 자신이 이벤트 처리하도록 TextListener 상속 받음
public class ColleagueTextField extends TextField implements TextListener, Colleague {
    private Mediator mediator;

    public ColleagueTextField(String text, int columns) {
        super(text, columns);
        // 디폴트 문자열과 크기
    }

    // Mediator를 설정한다 
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    // Mediator에서 활성/비활성을 지시한다
    @Override
    public void setColleagueEnabled(boolean enabled) {
        // TextField로부터 상속 받은 메소드
        setEnabled(enabled);
        
        // 활성/비활성에 맞게 배경색을 변경한다
        setBackground(enabled ? Color.white : Color.lightGray);
    }

    @Override
    public void textValueChanged(TextEvent e) {
        // 문자열이 변화했으면 Mediator에 알린다
        mediator.colleagueChanged();
    }
}
