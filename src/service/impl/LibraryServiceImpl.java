package service.impl;

import global.GlobalData;
import model.Book;
import service.LibraryService;

import java.time.LocalDateTime;

import static service.impl.LibraryServiceHelp.*;
import static util.InputUtil.*;

public class LibraryServiceImpl implements LibraryService {
    @Override
    public void register() {
        int count = inputTypeInt("How many book register: ");
        if (GlobalData.books != null) {
            Book[] tempBooks = GlobalData.books;
            GlobalData.books = new Book[count + tempBooks.length];

            for (int i = 0, k = 0; i < GlobalData.books.length; i++) {
                if (i < tempBooks.length) {
                    GlobalData.books[i] = tempBooks[i];
                }
                else {
                    System.out.println("-------------------");
                    System.out.println(++k + ". Book");
                    GlobalData.books[i] = fillBook();
                    System.out.println("-------------------");
                }
            }
        }
        else {
            GlobalData.books = new Book[count];

            for (int i = 0; i < count; i++) {
                System.out.println("-------------------");
                System.out.println(i+1 + ". Book");
                GlobalData.books[i] = fillBook();
                System.out.println("-------------------");
            }
        }
        System.out.println("\nREGISTER_SUCCESSFULLY");
        System.out.println("Total book: " + GlobalData.books.length + "\n");

    }

    @Override
    public void show() {
        if (GlobalData.books == null || GlobalData.books.length == 0) {
            System.out.println("Book not found!");
        }
        else {
            for (int i = 0; i < GlobalData.books.length; i++) {
                System.out.println("-------------------");
                System.out.println(i+1 + ". Book");
                System.out.println(GlobalData.books[i]);
                System.out.println("-------------------");
            }
        }
    }

    @Override
    public boolean update() {
        boolean isUpdated = false;
        if (GlobalData.books == null || GlobalData.books.length == 0) {
            System.out.println("Book not found!");
        }
        else {
            int id = inputTypeInt("Which book do you want to update: ");
            for (int i = 0; i < GlobalData.books.length; i++) {
                if (GlobalData.books[i].getId() == id) {
                    String newParameter = inputTypeString("Which parameter you want to change: ");
                    String[] newParameterArr = newParameter.toLowerCase().split(",");
                    for (int j = 0; j < newParameterArr.length; j++) {
                        if (newParameterArr[j].contains("name")) {
                            GlobalData.books[i].setName(inputTypeString("Update name: "));
                            isUpdated = true;
                        }
                        if (newParameterArr[j].contains("author")) {
                            GlobalData.books[i].setAuthor(inputTypeString("Update author: "));
                            isUpdated = true;
                        }
                        if (newParameterArr[j].contains("genre")) {
                            GlobalData.books[i].setGenre(inputTypeString("Update genre: "));
                            isUpdated = true;
                        }
                        if (newParameterArr[j].contains("page count")) {
                            GlobalData.books[i].setPageCount(inputTypeInt("Update page count: "));
                            isUpdated = true;
                        }
                        if (newParameterArr[j].contains("language")) {
                            GlobalData.books[i].setLanguage(inputTypeString("Update language: "));
                            isUpdated = true;
                        }
                        if (newParameterArr[j].contains("price")) {
                            GlobalData.books[i].setPrice(inputTypeInt("Update price: "));
                            isUpdated = true;
                        }
                        if (newParameterArr[j].contains("count")) {
                            GlobalData.books[i].setPrice(inputTypeInt("Update count: "));
                            isUpdated = true;
                        }
                        if (newParameterArr[j].contains("stock status")) {
                            GlobalData.books[i].setStockStatus(inputTypeBoolean("Update stock status: "));
                            isUpdated = true;
                        }
                    }
                    if (isUpdated == true) {
                        System.out.println("\nUPDATE_SUCCESSFULLY");
                    }
                    else {
                        System.out.println("Invalid parameter!");
                    }
                }
            }
            if (isUpdated == false) {
                System.out.println("Inalid id!");
            }
        }
        return isUpdated;
    }

    @Override
    public boolean delete() {
        boolean isDeleted = false;
        if (GlobalData.books == null || GlobalData.books.length == 0) {
            System.out.println("Book not found!");
        }
        else {
            int id = inputTypeInt("Which book do you want to delete: ");
            for (Book book : GlobalData.books) {
                if (book.getId() == id) {
                    Book[] tempBooks = GlobalData.books;
                    GlobalData.books = new Book[tempBooks.length-1];
                    int k = 0;
                    for (Book tempBook : tempBooks) {
                        if (tempBook.getId() == id) {
                            continue;
                        }
                        GlobalData.books[k] = tempBook;
                        k++;
                    }
                    isDeleted = true;
                }
            }
            if (isDeleted == true) {
                System.out.println("\nDELETE_SUCCESSFULLY");
            }
            else {
                System.out.println("Invalid id!");
            }
        }
        return isDeleted;
    }

    @Override
    public void search() {
        boolean isFind = false;
        if (GlobalData.books == null || GlobalData.books.length == 0) {
            System.out.println("Book not found!");
        }
        else {
            System.out.println("[1]. Stock and warehouse" + "\n[2] Warehouse");
            int option = inputTypeInt("Enter the option: ");
            if (option==2) {
                for (Book book: GlobalData.books) {
                    if (book.isStockStatus()==false) {
                        String name = inputTypeString("Enter the name: ");
                        if (name.equals(book.getName())) {
                            System.out.println("-------------------");
                            System.out.println(book);
                            System.out.println("-------------------");
                        }
                    }
                }
            }
            else {
                for (Book book: GlobalData.books) {
                    String name = inputTypeString("Enter the name: ");
                    if (name.equals(book.getName())) {
                        System.out.println("-------------------");
                        System.out.println(book);
                        System.out.println("-------------------");
                    }
                }
            }
        }
    }
}
