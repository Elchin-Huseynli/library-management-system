package util;

import java.util.Scanner;

public class InputUtil {
    public static String inputTypeString(String title) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(title);
        String a = scanner.nextLine();
        return a;
    };

    public static int inputTypeInt(String title) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(title);
        int a = scanner.nextInt();
        return a;
    }

    public static boolean inputTypeBoolean(String title) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(title);
        boolean a = scanner.nextBoolean();
        return a;
    }

}
