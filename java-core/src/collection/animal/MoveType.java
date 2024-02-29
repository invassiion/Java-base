package collection.animal;

public enum MoveType {
    FLY("Летает"), WALK("Ходит"), SWIM("Плавает");

    private String value;

    public String getValue() {
        return value;
    }
    MoveType(String value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return value;
    }
}
