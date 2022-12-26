package projects.studentRegistrationWithFile.service.menu;

import projects.studentRegistrationWithFile.bean.Config;
import projects.studentRegistrationWithFile.service.interMenu.MenuLoginServiceInter;

import java.util.Scanner;

public class MenuLoginService implements MenuLoginServiceInter {
    @Override
    public void processLogic() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("User name: ");
        String userName = scanner.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Password: ");
        String password = scanner2.nextLine();


        if (!(userName.equals("user") && password.equals("111"))) {
            throw new IllegalArgumentException("User or password is invalid");
        }

        Config.setLoggedIn(true);

    }
}
