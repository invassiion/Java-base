package collection.animal;

public class Bird extends Animal {
    protected Boolean flyModeActive = false;

    public Bird() {
        super(MoveType.FLY);
    }

    public final void takeOff() {
        this.flyModeActive = true;
    }

    public final void landing() {
        this.flyModeActive = false;
    }

    public void isTheBirdFlying() {
        System.out.println(
                flyModeActive == true ? "Flying mode: yes" : "Flying mode: no"
        );
    }

    public Boolean getFlyModeActive() {
        return flyModeActive;
    }

    public void setFlyModeActive(Boolean flyModeActive) {
        this.flyModeActive = flyModeActive;
    }

}
