package jacket;

public class ReturnOrderCommand implements JacketCommand {
    final private Jacket jacket;

    public ReturnOrderCommand(Jacket jacket) {
        this.jacket = jacket;
    }

    @Override
    public void invoke() {
        jacket.returnOrder();
    }
}
