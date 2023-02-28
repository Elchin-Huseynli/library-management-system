package util;
import static util.InputUtil.*;
public class MenuUtil {
    public static int entry() {
        System.out.println(
                "[1] Exit System" +
                        "\n[2] Register" +
                        "\n[3] Show" +
                        "\n[4] Update" +
                        "\n[5] Delete" +
                        "\n[6] Search"
        );
        return inputTypeInt("Enter the option: ");
    }
}
