package service.impl;

import model.Book;
import static util.InputUtil.*;

public class LibraryServiceHelp {
    static int id = 0;
    public static Book fillBook() {
        String name = inputTypeString("Enter the name: ");
        String author = inputTypeString("Enter the author: ");
        String genre = inputTypeString("Enter the genre: ");
        int pageCount = inputTypeInt("Enter the page count: ");
        String language = inputTypeString("Enter the language: ");
        int price = inputTypeInt("Enter the price: ");
        int count = inputTypeInt("Enter the count: ");
        boolean stockStatus = inputTypeBoolean("Enter the stock status: ");

        Book book = new Book(++id,name,author,genre,pageCount,language,price,count,stockStatus);
        return book;
    }
}
