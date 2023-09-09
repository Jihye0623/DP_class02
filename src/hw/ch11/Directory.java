package hw.ch11;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {
    private String name;
    private String date;
    private String author;
    private List<Entry> directory = new ArrayList<>();

    public Directory(String name, String date, String author) {
        this.name = name;
        this.date = date;
        this.author = author;
    }

    public int getCount(){
        int sum = 0;
        for(Entry entry:directory){
            sum+=entry.getCount();
        }
        return sum;
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
        int size = 0;
        for (Entry entry: directory) {
            size += entry.getSize();
        }
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        for (Entry entry: directory) {
            entry.printList(prefix + "/" + name);
        }
    }

    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }
    
}
