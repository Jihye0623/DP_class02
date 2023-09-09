package hw.ch11;

public abstract class Entry {
    // 이름, 날짜, 저자를 가져온다 
    public abstract String getName();
    public abstract String getdate();
    public abstract String getAuthor();


    // 크기를 가져온다 
    public abstract int getSize();

    // 목록을 표시한다 
    public void printList() {
        printList("");
    }

    // prefix를 앞에 붙여 목록을 표시한다
    protected abstract void printList(String prefix);

    // 문자열 표시
    @Override
    public String toString() {
        return getName() + " (" + getSize() + ") [" + getdate() + "] [" + getCount() + "개] [" + getAuthor() + "]";
    }

    public abstract int getCount();
}
