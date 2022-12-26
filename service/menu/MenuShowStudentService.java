package projects.studentRegistrationWithFile.service.menu;

import projects.studentRegistrationWithFile.bean.Config;
import projects.studentRegistrationWithFile.bean.Student;
import projects.studentRegistrationWithFile.service.interMenu.MenuShowStudentsServiceInter;

public class MenuShowStudentService implements MenuShowStudentsServiceInter {
    @Override
    public void processLogic() {
        Student[] allStudent = Config.instance().getStudents();
        for (int i = 0; i < allStudent.length; i++) {
            System.out.println(allStudent[i]);
            System.out.println();
        }
    }
}
