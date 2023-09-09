package hw.ch11;

public class File extends Entry{
    private String name;
    private String date;
    private int size;
    private String author;

    public File(String name, String date, int size, String author) {
        this.name = name;
        this.date = date;
        this.size = size;
        this.author = author;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getdate() {
        return date;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public int getSize() {
        return size;
    }
    
    public int getCount(){
        return 1;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }
}
