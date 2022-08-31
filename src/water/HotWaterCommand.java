package water;

public class HotWaterCommand implements WaterCommand {
    public Water water;

    public HotWaterCommand(Water water) {
        this.water = water;
    }

    @Override
    public void execute() {
        water.pourHotWater();
    }
}
