package Design_patterns.Creational.Singleton;

public class App {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1);
        System.out.println(singleton2);
        singleton1.setHeat(4200);
        System.out.println(singleton1);
        System.out.println(singleton2);
    }
}
