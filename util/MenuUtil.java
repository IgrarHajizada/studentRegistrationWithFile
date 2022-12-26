package projects.studentRegistrationWithFile.util;

import java.io.IOException;
import java.util.Scanner;

public class MenuUtil {

    public static void showMenu() throws IOException {
        Menu.showAllMenu();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choose:");
        int selectMenuNumber = scanner.nextInt();

        Menu selectedMenu = Menu.menuFind(selectMenuNumber);
        selectedMenu.process();

    }


    public static void processMenu(Menu menu) {

    }
}
