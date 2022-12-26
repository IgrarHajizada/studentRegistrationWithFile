package projects.studentRegistrationWithFile.service;

public interface Process {

    public abstract void processLogic();

    public default void process() {
        processLogic();
    }
}


