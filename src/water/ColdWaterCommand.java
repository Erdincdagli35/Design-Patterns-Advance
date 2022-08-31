package water;

public class ColdWaterCommand implements WaterCommand {
    public Water water;

    public ColdWaterCommand(Water water) {
        this.water = water;
    }

    @Override
    public void execute() {
        water.pourColdWater();
    }
}
