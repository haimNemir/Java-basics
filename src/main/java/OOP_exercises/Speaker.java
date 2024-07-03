package OOP_exercises;

public class Speaker {
    private String color;
    private int volume;

    public Speaker(String color, int volume) {
        this.color = color;
        this.volume = volume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVolume() {
        return volume;
    }

    public void turnOnPopMessage(){
        System.out.println("Speaker on");
    }

    public void turnOffPopMessage(){
        System.out.println("Speaker off");
    }

    public void enableBluetooth(){
        System.out.println("Speaker off");
    }

    public void dataMembers(){
        System.out.println("the color is: " + color + "\nthe volume is: " + volume + " from 10");
    }
}
