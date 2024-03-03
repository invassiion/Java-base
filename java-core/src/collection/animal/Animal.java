package collection.animal;

import java.util.Objects;

 public abstract class Animal {
public static class WeightException extends RuntimeException{

}
     public static class AnimalWeight {
         public enum WeightType {
             KG, GR
         }

         private Integer value;

         protected WeightType weightType;


         public AnimalWeight(Integer value, WeightType weightType) {
             if (value < 0) {
                 throw new WeightException();
             }
             this.value = value;
             this.weightType = weightType;
         }

         @Override
         public String toString() {
             return "AnimalWeight{" +
                     "value=" + value +
                     ", weightType=" + weightType +
                     '}';
         }

         public Integer getValue() {
             return value;
         }

         public void setValue(Integer value) {
             if (value < 0) {
                 throw new WeightException();
             }
             this.value = value;
         }

         public WeightType getWeightType() {
             return weightType;
         }

         public void setWeightType(WeightType weightType) {
             this.weightType = weightType;
         }

     }


    protected String name;
    protected AnimalWeight weight;
    protected Integer currentPosition = 0;
    protected MoveType moveType;


    public Animal(String name, AnimalWeight weight,MoveType moveType) {
        this.name = name;
        this.weight = weight;
        this.moveType = moveType;
    }

    public Animal(MoveType moveType) {
        this.moveType = moveType;
    }

    public  abstract void voice();

    public void runForward(Integer lenght) {
        this.currentPosition += lenght;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (!Objects.equals(name, animal.name)) return false;
        if (!Objects.equals(weight, animal.weight)) return false;
        if (!currentPosition.equals(animal.currentPosition)) return false;
        return moveType.equals(animal.moveType);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        result = 31 * result + currentPosition.hashCode();
        result = 31 * result + moveType.hashCode();
        return result;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public AnimalWeight getWeight() {
        return weight;
    }

    public void setWeight(AnimalWeight weight) {
        this.weight = weight;
    }

    public Integer getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Integer currentPosition) {
        this.currentPosition = currentPosition;
    }

    public MoveType getMoveType() {
        return moveType;
    }
    public void setMoveType(MoveType moveType) {
        this.moveType = moveType;
    }
}
