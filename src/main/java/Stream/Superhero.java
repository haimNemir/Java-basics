package Stream;

public class Superhero {
    private String nickName;
    private String SuperPowers;
    private boolean canFly;

    public Superhero(String nickName, String superPowers, boolean canFly) {
        this.nickName = nickName;
        SuperPowers = superPowers;
        this.canFly = canFly;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getSuperPowers() {
        return SuperPowers;
    }

    public void setSuperPowers(String superPowers) {
        SuperPowers = superPowers;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    @Override
    public String toString() {
        return "Superhero{" +
                "nickName='" + nickName + '\'' +
                ", SuperPowers='" + SuperPowers + '\'' +
                ", canFly=" + canFly +
                '}';
    }
}
