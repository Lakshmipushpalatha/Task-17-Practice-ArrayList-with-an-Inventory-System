import java.util.ArrayList;
import java.util.Scanner;

class Product {
    int id;
    String name;
    int quantity;
    double price;

    Product(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    void display() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("-------------------------");
    }
}

public class Task17 {

    static ArrayList<Product> inventory = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static Product searchProduct(int id) {
        for (Product p : inventory) {
            if (p.id == id) {
                return p;
            }
        }
        return null;
    }

    static void addProduct() {
        System.out.print("Enter Product ID: ");
        int id = Integer.parseInt(sc.nextLine());

        if (searchProduct(id) != null) {
            System.out.println("Product ID already exists!");
            return;
        }

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = Integer.parseInt(sc.nextLine());

        System.out.print("Enter Price: ");
        double price = Double.parseDouble(sc.nextLine());

        if (quantity < 0 || price < 0) {
            System.out.println("Quantity and price cannot be negative!");
            return;
        }

        Product p = new Product(id, name, quantity, price);
        inventory.add(p);

        System.out.println("Product added successfully!");
    }

    static void displayProducts() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty!");
            return;
        }

        System.out.println("\n----- Product List -----");

        for (Product p : inventory) {
            p.display();
        }
    }

    static void search() {
        System.out.print("Enter Product ID to search: ");
        int id = Integer.parseInt(sc.nextLine());

        Product p = searchProduct(id);

        if (p != null) {
            System.out.println("Product Found!");
            p.display();
        } else {
            System.out.println("Product not found!");
        }
    }

    static void updateProduct() {
        System.out.print("Enter Product ID to update: ");
        int id = Integer.parseInt(sc.nextLine());

        Product p = searchProduct(id);

        if (p == null) {
            System.out.println("Product not found!");
            return;
        }

        System.out.print("Enter New Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter New Quantity: ");
        int quantity = Integer.parseInt(sc.nextLine());

        System.out.print("Enter New Price: ");
        double price = Double.parseDouble(sc.nextLine());

        if (quantity < 0 || price < 0) {
            System.out.println("Quantity and price cannot be negative!");
            return;
        }

        p.name = name;
        p.quantity = quantity;
        p.price = price;

        System.out.println("Product updated successfully!");
    }

    static void removeProduct() {
        System.out.print("Enter Product ID to remove: ");
        int id = Integer.parseInt(sc.nextLine());

        Product p = searchProduct(id);

        if (p != null) {
            inventory.remove(p);
            System.out.println("Product removed successfully!");
        } else {
            System.out.println("Product not found!");
        }
    }

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== INVENTORY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Product");
            System.out.println("5. Remove Product");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addProduct();
                    break;

                case 2:
                    displayProducts();
                    break;

                case 3:
                    search();
                    break;

                case 4:
                    updateProduct();
                    break;

                case 5:
                    removeProduct();
                    break;

                case 6:
                    System.out.println("Thank you for using Inventory System!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
