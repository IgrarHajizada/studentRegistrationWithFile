package projects.studentRegistrationWithFile.service.menu;

import projects.studentRegistrationWithFile.bean.Config;
import projects.studentRegistrationWithFile.bean.Teacher;
import projects.studentRegistrationWithFile.service.interMenu.MenuShowTeachersServiceInter;

public class MenuShowTeacherService implements MenuShowTeachersServiceInter {
    public void processLogic() {
        Teacher[] allTeacher = Config.instance().getTeachers();
        for (int i = 0; i < allTeacher.length; i++) {
            System.out.println(allTeacher[i]);
            System.out.println();
        }
    }
}
