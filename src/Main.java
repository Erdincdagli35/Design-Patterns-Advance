public class Main {

    public static void main(String[] args) {
        System.out.println("Prototype Design Pattern");

        Rabbit rabbit = new Rabbit();
        rabbit.setAge(18);
        rabbit.setOwner(new Person("Erdinc"));
        Rabbit rabbitCopy = rabbit.clone();

        System.out.println("Copy Rabbit Age: " + rabbitCopy.getAge());
        System.out.println("Rabbit Age : " + rabbit.getAge());
        System.out.println("Copy Rabbit Owner: " + rabbitCopy.getOwner().getName());
        System.out.println("Rabbit Age Owner: " + rabbit.getOwner().getName());

        rabbitCopy.getOwner().setName("Emre");
        System.out.println("Copy Rabbit Owner: " + rabbitCopy.getOwner().getName());
        System.out.println("Rabbit Age Owner: " + rabbit.getOwner().getName());

    }
}
