package helper;

import model.Library;

import static global.GlobalData.libraryList;
import static util.InputUtil.inputTypeInt;
import static util.InputUtil.inputTypeString;
import static util.MenuUtil.showEntry;

public class LibraryServiceHelper {
    static int id = 0;
    public static Library fillLibrary () {
        String name = inputTypeString("Enter the name: ");
        String author = inputTypeString("Enter the author: ");
        String genre = inputTypeString("Enter the genre: ");
        int pageCount = inputTypeInt("Enter the page count: ");
        String language = inputTypeString("Enter the language: ");
        int price = inputTypeInt("Enter the price: ");
        int count = inputTypeInt("Enter the count: ");
        int stockStatus = inputTypeInt("Enter the stock status: ");

        Library library = new Library(++id,name,author,genre,pageCount,language,price,count,stockStatus);
        return library;
    }

    public static void nameSearch(){
        int option = showEntry();
        String name = inputTypeString("Enter the search name: ");
        for (Library library:libraryList) {
            if (option==1 && library.getName().equals(name) && library.getStockStatus()==1){
                System.out.println(library);
            }
            else if (option == 2 && library.getName().equals(name)) {
                System.out.println(library);
            }
        }
    }

    public static void authorSearch(){
        int option = showEntry();
        String author = inputTypeString("Enter the search author: ");
        for (Library library:libraryList) {
            if (option==2 && library.getAuthor().equals(author) && library.getStockStatus()==1){
                System.out.println(library);
            }
            else if (option == 2 && library.getAuthor()
                    .equals(author)) {
                System.out.println(library);
            }
        }
    }

    public static void genreSearch(){
        int option = showEntry();
        String genre = inputTypeString("Enter the search genre: ");
        for (Library library:libraryList) {
            if (option==3 && library.getGenre().equals(genre) && library.getStockStatus()==1){
                System.out.println(library);
            }
            else if (option == 2 && library.getGenre().equals(genre)) {
                System.out.println(library);
            }
        }
    }

    public static void detailView() {
        int detailOption = inputTypeInt("Choose the detail option: ");
        for (Library library: libraryList) {
            if (detailOption==library.getId()) {
                System.out.println("-----------------");
                System.out.println(library);
                System.out.println("-----------------");
            }
        }
    }
}
