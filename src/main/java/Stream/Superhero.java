package Stream;

public class Superhero {
    private String nickname;
    private String superPowers;
    private boolean canFly;

    public Superhero(String nickname, String superPowers, boolean canFly) {
        this.nickname = nickname;
        this.superPowers = superPowers;
        this.canFly = canFly;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSuperPowers() {
        return superPowers;
    }

    public void setSuperPowers(String superPowers) {
        this.superPowers = superPowers;
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
                "nickname='" + nickname + '\'' +
                ", superPowers='" + superPowers + '\'' +
                ", canFly=" + canFly +
                '}';
    }
}

