package Zoo.pens;

public class DryPen extends BasePen {

    public DryPen(final String name, double land) { // final prevents name changing or regeneration.
        this.setPenName(name);
        this.setLand(land);
        this.setWater(0.0);
        this.setAir(0.0);
//        this.setKeeperAssigned(false);
    }
}
