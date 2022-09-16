package Customer;

public interface Payment {
    String pay(int amount);

    Payment payToBankAccount = (amount) -> "Payment of $"+amount+" made from bank account.";

    Payment payToPayPal = (amount) -> "Payment of $"+amount+" made from PayPal.";
}
