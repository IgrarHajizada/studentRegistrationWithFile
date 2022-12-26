package projects.studentRegistrationWithFile.service.menu;

import projects.studentRegistrationWithFile.bean.Config;
import projects.studentRegistrationWithFile.bean.Student;
import projects.studentRegistrationWithFile.service.interMenu.MenuAddStudentServiceInter;

import java.util.Scanner;

public class MenuAddStudentService implements MenuAddStudentServiceInter {

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

        Student student = new Student();
        student.setName(name);
        student.setSurname(surname);
        student.setAge(age);


        Config.instance().appendStudent(student);
        System.out.println("Student added");
        System.out.println();


    }
}
