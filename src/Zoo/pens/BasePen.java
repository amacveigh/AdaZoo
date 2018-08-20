package Zoo.pens;

public abstract class BasePen {

    private String penName; // Used to identify who owns each pen
    private double land;
    private double water;
    private double air;
    private double temperature;
    private boolean keeperAssigned = false;

    public String getPenName() {
        return penName;
    }

    public void setPenName(String penName) {
        this.penName = penName;
    }

    public double getLand() {
        return land;
    }

    public void setLand(double land) {
        this.land = land;
    }

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }

    public double getAir() {
        return air;
    }

    public void setAir(double air) {
        this.air = air;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public boolean isKeeperAssigned() {
        return keeperAssigned;
    }

    public void setKeeperAssigned(boolean keeperAssigned) {
        this.keeperAssigned = keeperAssigned;
    }
}
