package service.impl;

import static util.MenuUtil.*;
public class ManagementService {
    LibraryServiceImpl libraryService = new LibraryServiceImpl();
    public void management() {

        while (true) {
            int option = entry();
            switch (option) {
                case 1:
                    System.out.println("GOOD_BYE");
                    System.exit(-1);
                case 2:
                    libraryService.register();
                    break;
                case 3:
                    libraryService.show();
                    break;
                case 4:
                    libraryService.update();
                    break;
                case 5:
                    libraryService.delete();
                    break;
                case 6:
                    libraryService.search();
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
