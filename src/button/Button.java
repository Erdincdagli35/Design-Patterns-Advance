package button;

public class Button {
    String text;

    public Button(String text){
        this.text=text;
    }
    public void click(ButtonCommand command){
        command.execute();
    }
}
