package hw.ch04.car;

import hw.ch04.framework.Product;

public class Car_SeoJiHye extends Product{
    private String modelName;

    public Car_SeoJiHye(String modelName){
        this.modelName=modelName;
    }

    public void use() {
        System.out.println("모델명 "+modelName+ "인 car를 사용합니다.");  
    }

    @Override
    public String toString() {  // object 클래스로부터 상속
        return modelName;
    }
    
    public String getModelName() {
        return modelName;
    }
}
