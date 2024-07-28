package Design_patterns.Creational.Singleton;

public class Singleton {
    private double radius = 696_000.0;
    private int heat = 5600;

    private static Singleton instance;

    private Singleton(){
    }

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getHeat() {
        return heat;
    }

    public void setHeat(int heat) {
        this.heat = heat;
    }

    public static void setInstance(Singleton instance) {
        Singleton.instance = instance;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "radius=" + radius +
                ", heat=" + heat +
                '}';
    }
}
