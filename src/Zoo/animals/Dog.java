package Zoo.animals;

public class Dog extends Animal {
    
    public Dog(final String name) {
        this.setName(name);
        this.setSpeciesName("Dog");
        this.setRequiredLand(3.5);
        this.setRequiredWater(0.0);
        this.setRequiredAir(0.0);
    }
}
