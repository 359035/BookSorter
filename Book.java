/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package booksorter;

/**
 *
 * @author Samsung
 */
public class Book implements Comparable<Book> {
    private String bookName;
    private int numberOfPages;
    private String authorName;
    private int releaseDate;

    public Book(String bookName, int numberOfPages, String authorName, int releaseDate) {
        this.bookName = bookName;
        this.numberOfPages = numberOfPages;
        this.authorName = authorName;
        this.releaseDate = releaseDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }
    
    @Override
    public int compareTo(Book b){
        return getBookName().compareTo(b.getBookName());
        
    }
    
    
}
