package Zoo.animals;

public abstract class Animal {

    private String speciesName;
    private String name;
    private double requiredLand;
    private double requiredWater;
    private double requiredAir;
    private int threatLevel; // is <= the animals can interact

    NameGenerator random = new NameGenerator();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public double getRequiredLand() {
        return requiredLand;
    }

    public void setRequiredLand(double requiredLand) {
        this.requiredLand = requiredLand;
    }

    public double getRequiredWater() {
        return requiredWater;
    }

    public void setRequiredWater(double requiredWater) {
        this.requiredWater = requiredWater;
    }

    public double getRequiredAir() {
        return requiredAir;
    }

    public void setRequiredAir(double requiredAir) {
        this.requiredAir = requiredAir;
    }

//    public Animal(String speciesName, String name, double requiredLand, double requiredWater, double requiredAir) {
//        this.speciesName = speciesName;
//        this.name = name;
//        this.requiredLand = requiredLand;
//        this.requiredWater = requiredWater;
//        this.requiredAir = requiredAir;
//    }

}
