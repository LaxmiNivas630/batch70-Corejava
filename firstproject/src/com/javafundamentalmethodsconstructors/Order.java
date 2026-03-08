package com.javafundamentalmethodsconstructors;

class Order {

    int orderId;
    String customerName;
    String foodItem;
    int quantity;
    double price;
    double extraPrice;
    String extraItem;

    // Default Constructor
    Order() {
        this(0, "Guest");
    }

    // Constructor with Order ID and Customer Name
    Order(int orderId, String customerName) {
        this(orderId, customerName, "Not Selected");
    }

    // Constructor with Order ID, Customer Name, Food Item
    Order(int orderId, String customerName, String foodItem) {
        this(orderId, customerName, foodItem, 1, 0);
    }

    // Constructor with all details
    Order(int orderId, String customerName, String foodItem, int quantity, double price) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.foodItem = foodItem;
        this.quantity = quantity;
        this.price = price;
    }

    // Method to add extra item
    void addExtraItem(String item, int price) {
        extraItem = item;
        extraPrice = price;
    }

    // Method to calculate bill
    double calculateBill() {
        double total = (price * quantity) + extraPrice;
        total = (total > 1000) ? total * 0.9 : total;
        return total;
    }
    
    double calculateBillExtraCondition() {
        double total = (price * quantity) + extraPrice;

        total = (total > 1000) ? total * 0.9 : total;

        return total;
    }

    // Method to display order
    void displayOrder() {

      
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Food Item: " + foodItem);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Extra Item");
        System.out.println("Extra Item Added: " + extraItem);
        System.out.println("Total Bill: " + calculateBill());
    }

    public static void main(String[] args) {

        Order o1 = new Order(101, "kasi", "Pizza", 3, 400);

        o1.addExtraItem("Coke", 100);

        o1.displayOrder();
    }
}