package projects.studentRegistrationWithFile.util;

import projects.studentRegistrationWithFile.bean.Config;
import projects.studentRegistrationWithFile.service.Process;
import projects.studentRegistrationWithFile.service.menu.*;

import java.io.IOException;

public enum Menu {
    LOGIN(1, "Login", new MenuLoginService()),
    REGISTER(2, "Register", new MenuRegisterService()),
    ADD_TEACHER(3, "Add Teacher", new MenuAddTeacherService()),
    ADD_STUDENT(4, "Add Student", new MenuAddStudentService()),
    SHOW_ALL_TEACHER(5, "Show all Teacher", new MenuShowTeacherService()),
    SHOW_ALL_STUDENT(6, "Show all Student", new MenuShowStudentService()),
    UNKNOWN;

    private String label;
    private Process service;
    private int number;

    Menu() {
    }

    Menu(int number, String label, Process service) {
        this.number = number;
        this.label = label;
        this.service = service;
    }


    public String getLabel() {
        return label;
    }


    public void process() throws IOException {
        service.process();
        MenuUtil.showMenu();
    }

    public int getNumber() {
        return this.number;
    }

    @Override
    public String toString() {
        return number + ". " + label;
    }

    public static Menu menuFind(int number) {
        Menu[] valuesArr = Menu.values();
        for (int i = 0; i < valuesArr.length; i++) {
            if (valuesArr[i].getNumber() == number) {
                return valuesArr[i];
            }
        }
        return Menu.UNKNOWN;
    }


    public static void showAllMenu() {
        System.out.println("Please select Menu");
        Menu[] valuesArr = Menu.values();
        for (int i = 0; i < valuesArr.length; i++) {
            if (valuesArr[i] != UNKNOWN) {
                if (valuesArr[i] == LOGIN || valuesArr[i] == REGISTER) {
                    if (!Config.isLoggedIn()) {
                        System.out.println(valuesArr[i]);
                    }
                } else if (Config.isLoggedIn()) {
                    System.out.println(valuesArr[i]);
                }
            }
        }
    }
}
