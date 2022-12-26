package projects.studentRegistrationWithFile.service;

import projects.studentRegistrationWithFile.bean.Config;

public interface SaveableProcess extends Process {
    public default void process() {
        processLogic();
        Config.saveMethod();
    }

}
