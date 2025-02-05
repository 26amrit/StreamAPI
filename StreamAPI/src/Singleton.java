import java.io.Serializable;

public class Singleton implements Serializable {

    private static volatile Singleton singleton;

    private Singleton() {

    }

    public static synchronized Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null)
                    singleton = new Singleton();
            }

        }
        return singleton;

    }

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}
