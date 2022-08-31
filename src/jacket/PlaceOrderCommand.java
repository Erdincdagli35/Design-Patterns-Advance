package jacket;

public class PlaceOrderCommand implements JacketCommand {
    final private Jacket jacket;

    public PlaceOrderCommand(Jacket jacket){
        this.jacket = jacket;
    }

    @Override
    public void invoke() {
        jacket.placeOrder();
    }
}
