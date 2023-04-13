package hw.ch04.car;

import java.util.*;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;

public class CarFactory extends Factory {
    private Vector<String> modelsNames = new Vector<String>();

    @Override
    protected Product createProduct(String modelName) {
        return new Car_SeoJiHye(modelName);
    }

    @Override
    protected void registerProduct(Product product) {
        String s = String.valueOf(product);
        modelsNames.add(s);
    }


    public void printAllModelNames(){
        Iterator<String> it = modelsNames.iterator();  // Iterator 객체 얻기
		while(it.hasNext()) {
			String m = it.next();
			System.out.println(m);
		}
    }
}
