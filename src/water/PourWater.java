package water;

public class PourWater {
    String type;

    public PourWater(String type){
        this.type=type;
    }

    public void click(WaterCommand command){
        command.execute();
    }
}
