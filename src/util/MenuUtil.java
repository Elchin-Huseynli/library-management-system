package util;

import static util.InputUtil.inputTypeInt;

public class MenuUtil {
    public static int entry() {
        System.out.println(
                "\n-----| Library Management System |-----" +
                "\n[0]. System exit" +
                "\n[1]. Register" +
                "\n[2]. Show" +
                "\n[3]. Update" +
                "\n[4]. Delete" +
                "\n[5]. Search" +
                "\n[6]. WarehouseToStock\n"
        );
        return InputUtil.inputTypeInt("Choose the option: ");
    }

    public static int showEntry() {
        System.out.println(
                "[1]. Stock" +
                "\n[2]. Warehouse"
        );
        return inputTypeInt("Choose the option: ");
    }

    public static int searchEntry() {
        System.out.println(
                "[1]. Name search" +
                "\n[2]. Author search" +
                "\n[3]. Genre search"
        );
        return inputTypeInt("Choose the option: ");
    }
}
