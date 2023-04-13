package hw.ch04.framework;

public abstract class Factory {
    // 제품 생산 시의 큰 흐름 결정 => 템플릿 메소드 
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    // 자식이 구체적인 생산 방법을 결정 => factory method
    protected abstract Product createProduct(String owner);  
    protected abstract void registerProduct(Product product);
    public abstract void printAllModelNames();
}
