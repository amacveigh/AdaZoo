package Zoo.animals;

public class Hippo extends Animal {

//    public Hippo ()
//    {super("Hippo", "Sandy", 10.0, 20.0, 0.0);}

    public Hippo(final String name) { // final prevents name changing or regeneration.
        this.setName(name);
        this.setSpeciesName("Hippo");
        this.setRequiredLand(10.0);
        this.setRequiredWater(20.0);
        this.setRequiredAir(0.0);
    }
}
