package Zoo.animals;

public class Penguin extends Animal {
    
    public Penguin(final String name) {
        this.setName(name);
        this.setSpeciesName("Penguin");
        this.setRequiredLand(2.0);
        this.setRequiredWater(4.0);
        this.setRequiredAir(0.0);
    }
}
