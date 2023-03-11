package service.impl;

import static global.GlobalData.libraryList;

import enums.SuccessMessageEnum;
import exceptions.BookNotFoundExceptions;
import exceptions.InvalidIdExceptions;
import exceptions.InvalidOptionExceptions;
import exceptions.InvalidParameterExceptions;
import model.Library;
import service.LibraryService;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static util.InputUtil.*;
import static util.MenuUtil.searchEntry;
import static util.MenuUtil.*;
import static helper.LibraryServiceHelper.*;

public class LibraryServiceImpl implements LibraryService {
    @Override
    public void register() {
        int count = inputTypeInt("How many book register: ");
        for (int i = 0; i < count; i++) {
            System.out.println(i+1 + ". Book");
            libraryList.add(fillLibrary());
        }
        System.out.println("\n" + SuccessMessageEnum.REGISTER_SUCCESSFULLY);
    }

    @Override
    public void show() throws BookNotFoundExceptions, InvalidOptionExceptions {
        if (libraryList==null || libraryList.size()==0) {
            throw new BookNotFoundExceptions();
        }
        else {
            int option = showEntry();
            if (option==1) {
                int i = 1;
                for (Library library : libraryList) {
                    if (library.getStockStatus()==1) {
                        System.out.println("-----------------");
                        System.out.println(i++ + ". Book");
                        System.out.println(library.shortInfo());
                        System.out.println("-----------------");
                    }
                }

                detailView();
            }
            else if (option==2) {
                int i = 1;
                for (Library library: libraryList) {
                    System.out.println("-----------------");
                    System.out.println(i++ + ". Book");
                    System.out.println(library.shortInfo());
                    System.out.println("-----------------");
                }
                detailView();
            }
            else {
                throw new InvalidOptionExceptions();
            }
        }
    }

    @Override
    public boolean update() throws BookNotFoundExceptions, InvalidParameterExceptions, InvalidIdExceptions {
        boolean isUpdate = false;
        if (libraryList==null || libraryList.size()==0) {
            throw new BookNotFoundExceptions();
        }
        else {
            int id = inputTypeInt("Which book do you want to update: ");
            for (Library library : libraryList) {
                if (id == library.getId()) {
                    String parameters = inputTypeString("Which parameter you want to change: ");
                    List<String> parametersList = new LinkedList<>();
                    parametersList.add(Arrays.toString(parameters.split(",")));
                    for (String i : parametersList) {
                        if (i.contains("name")) {
                            library.setName(inputTypeString("Update name: "));
                            isUpdate = true;
                        }
                        if (i.contains("author")) {
                            library.setAuthor(inputTypeString("Update author: "));
                            isUpdate = true;
                        }
                        if (i.contains("genre")) {
                            library.setGenre(inputTypeString("Update genre: "));
                            isUpdate = true;
                        }
                        if (i.contains("page count")) {
                            library.setPageCount(inputTypeInt("Update page count: "));
                            isUpdate = true;
                        }
                        if (i.contains("language")) {
                            library.setLanguage(inputTypeString("Update language: "));
                            isUpdate = true;
                        }
                        if (i.contains("price")) {
                            library.setPrice(inputTypeInt("Update price: "));
                            isUpdate = true;
                        }
                        if (i.contains("count")) {
                            library.setCount(inputTypeInt("Update count: "));
                            isUpdate = true;
                        }
                    }
                    if (isUpdate == true) {
                        System.out.println("\n" + SuccessMessageEnum.UPDATE_SUCCESSFULLY);
                    }
                    else {
                        throw new InvalidParameterExceptions();
                    }
                }
            }
            if (isUpdate == false) {
                throw new InvalidIdExceptions();
            }
        }
        return isUpdate;
    }

    @Override
    public boolean delete() throws BookNotFoundExceptions, InvalidIdExceptions {
        boolean isDelete = false;
        if (libraryList==null || libraryList.size()==0) {
            throw new BookNotFoundExceptions();
        }
        else {
            int id = inputTypeInt("Which book do you want to delete: ");
            for (Library library : libraryList) {
                if (id == library.getId()) {
                    libraryList.remove(library);
                    isDelete = true;
                }
            }
            if (isDelete == true) {
                System.out.println("\n" + SuccessMessageEnum.DELETE_SUCCESSFULLY);
            }
            else {
                throw new InvalidIdExceptions();
            }
        }
        return isDelete;
    }

    @Override
    public void search() throws BookNotFoundExceptions, InvalidOptionExceptions {
        if (libraryList == null || libraryList.size() == 0) {
            throw new BookNotFoundExceptions();
        } else {
            int option = searchEntry();
            switch (option){
                case 1:
                    nameSearch();
                    break;
                case 2:
                    authorSearch();
                    break;
                case 3:
                    genreSearch();
                    break;
                default:
                    throw new InvalidOptionExceptions();

            }
        }
    }

    @Override
    public void warehouseToStock() throws BookNotFoundExceptions {
        if (libraryList==null || libraryList.size()==0) {
            throw new BookNotFoundExceptions();
        }
        else {
            int id  = inputTypeInt("Which book change status: ");
            for (Library library : libraryList) {
                if (id == library.getId() && library.getStockStatus()==0) {
                    library.setStockStatus(1);
                }
            }
        }
    }

}