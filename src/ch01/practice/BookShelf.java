package ch01.practice;

import java.util.*;

public class BookShelf implements Iterable<Book> {
    private Book[] books; // 배열 선언
    private int last = 0; // 마지막에 꽃힌 위치

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
        // 배열 생성 (!= 배열 선언)
    }

    // 책 꽃는 메소드
    public void appendBook(Book book) {
        books[last] = book;
        last++;
    }

    // 책 가져오는 메소드
    public Book getBookAt(int index) {
    // public Book getBookFrom(int index){
        return books[index];
    }

    // 책 갯수를 반환하는 메소드
    public int getLength(){
        return last;
    }

    // 자신의 iterator를 반환하는 메소드
    @Override
    //public BookShelfIterator iterator(){
    public Iterator<Book> iterator(){
        return new BookShelfIterator(this);
        // return new BookShelfIteratorBackward(this);  => 과제
    }
}
