package org.example.model;

public class Store {


    public void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
            System.out.println("------------------------");
        }
    }

    public static void main(String[] args) {
        Chocolate chocolate = new Chocolate("Chocolate", 15.99, "Dark Chocolate", 85);
        Coke coke = new Coke("Coke", 1.99, "Refreshing beverage", true);
        Bread bread = new Bread("Bread", 2.49, "Whole grain bread", "Whole Wheat");

        ProductForSale[] products = {chocolate, coke, bread};

        Store store = new Store();
        store.listProducts(products);
    }
}
