package Zoo.animals;

public class Goat extends Animal {
    
    public Goat(final String name) {
        this.setName(name);
        this.setSpeciesName("Goat");
        this.setRequiredLand(3.0);
        this.setRequiredWater(0.0);
        this.setRequiredAir(0.0);
    }
}
