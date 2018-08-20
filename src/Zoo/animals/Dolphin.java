package Zoo.animals;

public class Dolphin extends Animal {
    
    public Dolphin(final String name) {
        this.setName(name);
        this.setSpeciesName("Dolphin");
        this.setRequiredLand(0.0);
        this.setRequiredWater(40.0);
        this.setRequiredAir(0.0);
    }
}
