import Customer.*;
import Encrytptor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Strategy\n");

        System.out.println("\nEncrypt");
        File file =new File("test.pdf");
        file.encrypt(Encryptor.aesEncryptor);
        file.encrypt(Encryptor.rsaEncryptor);

        System.out.println("\nCustomer");
        Customer customer = new Customer("Erdinç Dağlı",100);
        customer.payment(Payment.payToBankAccount);
        customer.payment(Payment.payToPayPal);

        Customer customer2 = new Customer("Emre Dağlı",50);
        customer2.payment(Payment.payToBankAccount);
    }
}
