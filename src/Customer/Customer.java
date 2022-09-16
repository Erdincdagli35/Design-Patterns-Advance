package Customer;

public class Customer {

    final private String name;
    final private int amount;

    public Customer(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public void payment(Payment payment) {
        System.out.println(name + " Payment of $" + payment.pay(amount) + " made from bank account.");
    }
}
