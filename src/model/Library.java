package model;

public class Library {
    private int id;
    private String name;
    private String author;
    private String genre;
    private int pageCount;
    private String language;
    private int price;
    private int count;
    private int stockStatus;

    public Library(int id, String name, String author, String genre, int pageCount, String language, int price, int count, int stockStatus) {
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

    public Library() {
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

    public int getStockStatus() {
        return stockStatus;
    }

    public void setStockStatus(int stockStatus) {
        this.stockStatus = stockStatus;
    }

    public String shortInfo() {
        return "Id: " + getId() +
                "\nName: " + getName() +
                "\nAuthor: " + getAuthor() +
                "\nGenre: " + getGenre() +
                "\nLanguage: " + getLanguage();
    }


    @Override
    public String toString() {
        return "Id: " + getId() +
                "\nName: " + getName() +
                "\nAuthor: " + getAuthor() +
                "\nGenre: " + getGenre() +
                "\nPageCount: " + getPageCount() +
                "\nLanguage: " + getLanguage() +
                "\nPrice: " + getPrice() +
                "\nCount: " + getCount();
    }
}
