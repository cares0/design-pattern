package pattern.singleton;

import java.io.*;
import java.lang.reflect.Constructor;

public class App {

    public static void main(String[] args) throws Exception {
        // 리플렉션을 사용하는 방법
        Settings instance = Settings.getInstance();

        Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings newInstance = constructor.newInstance();

        System.out.println("instance == newInstance = " + (instance == newInstance)); // false

        // 직렬화와 역직렬화를 사용하는 방법
        Settings settings = Settings.getInstance();
        Settings serSettings = null;
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
             serSettings = (Settings) in.readObject();
        }
        System.out.println("settings == serSettings = " + (settings == serSettings)); // false
    }
}
