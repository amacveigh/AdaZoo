package Zoo.animals;

public class Owl extends Animal {

    public Owl(final String name) {
        this.setName(name);
        this.setSpeciesName("Owl");
        this.setRequiredLand(0.0);
        this.setRequiredWater(0.0);
        this.setRequiredAir(20.0);
    }
}

