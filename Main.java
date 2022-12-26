package projects.studentRegistrationWithFile;


import projects.studentRegistrationWithFile.bean.Config;
import projects.studentRegistrationWithFile.util.MenuUtil;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Config.initialize();
        MenuUtil.showMenu();
    }
}
