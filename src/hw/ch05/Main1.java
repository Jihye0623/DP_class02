package hw.ch05;

import hw.ch05.idcard.IDCardFactorySeoJihye1;

public class Main1 {
    public static void main(String [] args){
        System.out.println("<<20210694 서지혜>>");
        IDCardFactorySeoJihye1 factory1 = IDCardFactorySeoJihye1.getInstance();
        IDCardFactorySeoJihye1 factory2 = IDCardFactorySeoJihye1.getInstance();

        if (factory1==factory2){    // 같은 주소인지 
            System.out.println("factory1과 factory2는 같은 인스턴스입니다.");
        } else{
            System.out.println("factory1과 factory2는 다른 인스턴스입니다.");
        }
    }
}
