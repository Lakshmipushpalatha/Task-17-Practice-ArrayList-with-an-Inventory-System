# Task-17-Practice-ArrayList-with-an-Inventory-System
java calculation

## 1. Project Description

The Inventory Management System is a Java-based application developed using the ArrayList collection.

This application helps users manage product information easily. It allows users to add, display, search, update, and remove products from the inventory.

Each product contains a unique Product ID, Product Name, Quantity, and Price.

The program uses a menu-driven approach so that users can select the operation they want to perform.

## 2. Objective

The main objectives of this task are:

- To understand the ArrayList collection in Java.
- To learn how to store and manage data dynamically.
- To perform CRUD operations.
- To implement product searching using Product IDs.
- To understand how to create reusable methods.
- To improve practical Java programming skills.

## 3. Technologies Used

- Java
- ArrayList
- Scanner class
- Object-Oriented Programming (OOP)

## 4. Product Class Explanation

The `Product` class represents an individual product in the inventory.

It contains four variables:

- `id` – Stores the unique product ID.
- `name` – Stores the product name.
- `quantity` – Stores the available product quantity.
- `price` – Stores the product price.

The constructor initializes these values when a new product object is created.

The `display()` method prints the details of a product.

## 5. ArrayList Explanation

The program uses:

```java
static ArrayList<Product> inventory = new ArrayList<>();
```

Here:

- `ArrayList` is a dynamic collection in Java.
- `Product` specifies the type of objects stored.
- `inventory` is the name of the ArrayList.
- `new ArrayList<>()` creates an empty ArrayList.

Unlike normal arrays, an ArrayList can grow or shrink dynamically.

## 6. Methods Used in the Program

### 1. addProduct()

This method adds a new product to the inventory.

Steps:
1. Gets the product ID from the user.
2. Checks whether the ID already exists.
3. Gets the product name, quantity, and price.
4. Creates a new Product object.
5. Adds the product using `inventory.add()`.

### 2. displayProducts()

This method displays all products available in the inventory.

It checks whether the ArrayList is empty. If products are available, it uses a for-each loop to display their details.

### 3. searchProduct()

This method searches for a product using its unique ID.

It checks each product in the ArrayList. If the ID matches, it returns the product object. Otherwise, it returns `null`.

### 4. search()

This method accepts a product ID from the user and calls `searchProduct()` to find the product.

If the product exists, its details are displayed. Otherwise, a product-not-found message is shown.

### 5. updateProduct()

This method updates the existing product information.

Steps:
1. Accepts the product ID.
2. Searches for the product.
3. Gets the new product name, quantity, and price.
4. Updates the existing product details.

### 6. removeProduct()

This method removes a product from the inventory using its product ID.

It searches for the product and removes it using:

```java
inventory.remove(p);
```

If the product does not exist, it displays an appropriate message.

## 7. CRUD Operations

CRUD represents four basic operations used to manage data.

| Operation | Description |
|---|---|
| Create | Add a new product |
| Read | Display and search products |
| Update | Modify existing product details |
| Delete | Remove a product |

## 8. Program Execution

The program displays a menu with six options:

1. Add Product
2. Display Products
3. Search Product
4. Update Product
5. Remove Product
6. Exit

The user selects an option, and the corresponding method is executed using a switch statement.

The do-while loop repeats the menu until the user selects Exit.

## 9. Sample Input

```text
Enter your choice: 1

Enter Product ID: 101
Enter Product Name: Laptop
Enter Quantity: 10
Enter Price: 45000
```

## 10. Sample Output

```text
Product added successfully!

===== INVENTORY MANAGEMENT SYSTEM =====
1. Add Product
2. Display Products
3. Search Product
4. Update Product
5. Remove Product
6. Exit

Enter your choice: 2

----- Product List -----

Product ID: 101
Product Name: Laptop
Quantity: 10
Price: 45000.0
```

## 11. Important Java Concepts Learned

- ArrayList and dynamic collections.
- Classes and objects.
- Constructors.
- Static methods.
- For-each loop.
- Switch statement.
- Do-while loop.
- CRUD operations.
- Searching objects using product IDs.
- Adding and removing elements from ArrayList.

## 12. Advantages of the Project

- Easy to manage product details.
- Stores multiple products dynamically.
- Avoids duplicate product IDs.
- Supports adding, searching, updating, and deleting products.
- Uses reusable methods for better code organization.

