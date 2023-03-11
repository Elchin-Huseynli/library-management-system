package service.impl;

import enums.ExceptionEnum;
import exceptions.BookNotFoundExceptions;
import exceptions.InvalidIdExceptions;
import exceptions.InvalidOptionExceptions;
import exceptions.InvalidParameterExceptions;
import service.ManagementService;

import java.util.InputMismatchException;

import static util.MenuUtil.entry;

public class ManagementServiceImpl implements ManagementService {

    @Override
    public void management() {
        LibraryServiceImpl libraryService = new LibraryServiceImpl();
        while (true) {
            try {
                while (true) {
                    int option = entry();
                    switch (option) {
                        case 0:
                            System.exit(-1);
                        case 1:
                            libraryService.register();
                            break;
                        case 2:
                            libraryService.show();
                            break;
                        case 3:
                            libraryService.update();
                            break;
                        case 4:
                            libraryService.delete();
                            break;
                        case 5:
                            libraryService.search();
                            break;
                        case 6:
                            libraryService.warehouseToStock();
                            break;
                        default:
                            throw new InvalidOptionExceptions();
                    }
                }
            }
            catch (BookNotFoundExceptions e) {
                System.out.println(e.getMessage());
            }
            catch (InvalidIdExceptions e) {
                System.out.println(e.getMessage());
            }
            catch (InvalidParameterExceptions e) {
                System.out.println(e.getMessage());
            }
            catch (InvalidOptionExceptions e) {
                System.out.println(e.getMessage());
            }
            catch (InputMismatchException e) {
                System.out.println("\n" + ExceptionEnum.MUST_BE_AN_INT_VALUE);
            }
        }
    }
}
