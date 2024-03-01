package collection.animal;

public class Bird extends Animal implements Flight{
    protected Boolean flyModeActive = false;

    public Bird() {
        super(MoveType.FLY);
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

    @Override
    public void takeOff() {
        flyModeActive = true;
    }

    @Override
    public void landing() {
        flyModeActive = false;
    }
}
