package projects.studentRegistrationWithFile.service.menu;

import projects.studentRegistrationWithFile.bean.Config;
import projects.studentRegistrationWithFile.bean.Teacher;
import projects.studentRegistrationWithFile.service.SaveableProcess;
import projects.studentRegistrationWithFile.service.interMenu.MenuAddTeacherServiceInter;

import java.util.Scanner;

public class MenuAddTeacherService implements MenuAddTeacherServiceInter, SaveableProcess {
    @Override
    public void processLogic() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Add name: ");
        String name = scanner1.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Add surname: ");
        String surname = scanner2.nextLine();

        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Add age: ");
        int age = scanner3.nextInt();

        Teacher teacher = new Teacher();
        teacher.setName(name);
        teacher.setSurname(surname);
        teacher.setAge(age);


        Config.instance().appendTeacher(teacher);
        System.out.println("Teacher added");
        System.out.println();


    }
}
