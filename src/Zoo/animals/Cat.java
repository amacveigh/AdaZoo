package Zoo.animals;

public class Cat extends Animal {

    public Cat(final String name) {
        this.setName(name);
        this.setSpeciesName("Owl");
        this.setRequiredLand(4.0);
        this.setRequiredWater(0.0);
        this.setRequiredAir(0.0);
    }
}
