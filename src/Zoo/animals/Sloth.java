package Zoo.animals;

public class Sloth extends Animal {
    
    public Sloth(final String name) {
        Sloth sloth = new Sloth(); // can this be deleted??????????????????????????
        this.setName(name);
        this.setSpeciesName("Sloth");
        this.setRequiredLand(3.0);
        this.setRequiredWater(0.0);
        this.setRequiredAir(0.0);
    }

    /** and this???
     * Try not use this
     */
    private Sloth(){ }// and this?????????????????????????????????????
}