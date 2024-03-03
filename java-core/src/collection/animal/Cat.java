package collection.animal;

public class Cat extends  Animal {


    public Cat(String name, AnimalWeight weight) {
        super(name, weight, MoveType.WALK);
    }

    public Cat() {
        super(MoveType.WALK);
    }

    private Integer heightCoefficient(Integer weight) {
        if (weight > 10) {
            return 120;
        }
        return 90;
    }

    public Integer jumpHeight() {
        if (this.weight == null) return 300;
        return heightCoefficient(this.weight.getValue());
    }

    @Override
    public void voice() {
        System.out.println("Meow meow");
    }
}
