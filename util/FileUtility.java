package projects.studentRegistrationWithFile.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileUtility {

    public static boolean writeFileObjectToFIle(Object object, String name) throws RuntimeException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(name))) {
            outputStream.writeObject(object);
            return true;
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }


    public static Object readFileObject(String name) {
        Object obj = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(name));) {
            obj = objectInputStream.readObject();
            return obj;
        } finally {
            return obj;
        }
    }
}
