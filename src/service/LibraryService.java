package service;

import exceptions.BookNotFoundExceptions;
import exceptions.InvalidIdExceptions;
import exceptions.InvalidOptionExceptions;
import exceptions.InvalidParameterExceptions;

public interface LibraryService {
    void register();
    void show() throws BookNotFoundExceptions, InvalidOptionExceptions;
    boolean update() throws BookNotFoundExceptions, InvalidParameterExceptions, InvalidIdExceptions;
    boolean delete() throws BookNotFoundExceptions, InvalidIdExceptions;
    void search() throws BookNotFoundExceptions, InvalidOptionExceptions;
    void warehouseToStock() throws BookNotFoundExceptions;

}
