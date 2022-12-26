package projects.studentRegistrationWithFile.bean;

import projects.studentRegistrationWithFile.util.FileUtility;

import java.io.IOException;
import java.io.Serializable;

public class Config implements Serializable {

    private static Config config = null;

    private Student[] students = new Student[0];
    private Teacher[] teachers = new Teacher[0];
    private static boolean loggedIn;

    private static final String fileName = "app.obj";

    public static void saveMethod() {
        FileUtility.writeFileObjectToFIle(Config.instance(), fileName);
    }

    public static void initialize() throws IOException, ClassNotFoundException {
        Object obj = FileUtility.readFileObject(fileName);
        if (obj == null) {
            return;
        }
        if (obj instanceof Config) {
            config = (Config) obj;
        }
    }


    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public static Config getConfig() {
        return config;
    }

    public static void setConfig(Config config) {
        Config.config = config;
    }

    public static boolean isLoggedIn() {
        return loggedIn;
    }

    public static void setLoggedIn(boolean loggedIn) {
        Config.loggedIn = loggedIn;
    }

    public void appendStudent(Student s) {

        Student[] st = new Student[students.length + 1];

        for (int i = 0; i < students.length; i++) {
            st[i] = students[i];
        }
        st[st.length - 1] = s;
        students = st;

    }


    public void appendTeacher(Teacher t) {

        Teacher[] tc = new Teacher[teachers.length + 1];

        for (int i = 0; i < teachers.length; i++) {
            tc[i] = teachers[i];
        }
        tc[tc.length - 1] = t;
        teachers = tc;

    }


    public static Config instance() {
        if (config == null) {
            config = new Config();
        }
        return config;
    }


}
