package exceptions;

import enums.ExceptionEnum;

public class BookNotFoundExceptions extends Exception{
    public BookNotFoundExceptions() {
        super("\n" + ExceptionEnum.BOOK_NOT_FOUND.name());
    }
}
