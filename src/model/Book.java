package model;

public class Book {
    private int id;
    private String name;
    private String author;
    private String genre;
    private int pageCount;
    private String language;
    private int price;
    private int count;
    private boolean stockStatus;

    public Book() {
        ++this.id;
    }

    public Book(int id, String name, String author, String genre, int pageCount, String language, int price, int count, boolean stockStatus) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.pageCount = pageCount;
        this.language = language;
        this.price = price;
        this.count = count;
        this.stockStatus = stockStatus;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isStockStatus() {
        return stockStatus;
    }

    public void setStockStatus(boolean stockStatus) {
        this.stockStatus = stockStatus;
    }

    @Override
    public String toString() {
        return "Name: " + getName() +
                "\nAuthor: " + getAuthor() +
                "\nGenre: " + getGenre() +
                "\nPage count: " + getPageCount() +
                "\nLanguage: " + getLanguage() +
                "\nPrice: " + getPrice() +
                "\nCount: " + getCount();
    }

    public String getList() {
     return "Name: " + getName() +
            "\nAuthor: " + getAuthor() +
            "\nGenre: " + getGenre() +
             "\nLanguage: " + getLanguage();
    }
}
