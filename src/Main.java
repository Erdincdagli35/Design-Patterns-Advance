import Employee.Employee;
import Employee.StaffList;
import Employee.StaffListIterator;
import Item.Inventory;
import Item.Item;
import Item.StockIterator;

public class Main {

    public static void main(String[] args) {
        System.out.println("Iterator \n\n");

        System.out.println("Item Example :");
        Item pens = new Item("pens", 175);
        Item pencils = new Item("pencils", 0);
        Item paper = new Item("paper", 500);

        Inventory inventory = new Inventory(pens, pencils, paper);

        StockIterator stockIterator = inventory.iterator();

        while (stockIterator.hasNext()) {
            Item item = stockIterator.next();
            System.out.println(item.getName());
        }

        System.out.println("\nEmployee Example :");
        Employee zack = new Employee("Zack");
        Employee sarah = new Employee("Sarah");
        Employee anna = new Employee("Anna");

        StaffList staffList = new StaffList(zack, sarah, anna);

        StaffListIterator staffListIterator = staffList.iterator();

        while (staffListIterator.hasNext()) {
            Employee employee = staffListIterator.next();
            System.out.println(employee.getName());
        }
    }
}
