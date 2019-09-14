package com.company;

public class Machine {
    private Catalog catalog;
    private Denomination vaildDenomination;

    public Machine(Catalog catalog, Denomination vaildDenomination) {
        this.catalog = catalog;
        this.vaildDenomination = vaildDenomination;
    }

    public String itemsAvailable() {
        return "Items available: \n" + catalog.toString() + "\n Select One to dispense: \n";
    }

    public Product selectProduct(String name) {
        return catalog.searchProduct(name);
    }

    public String askMoney(Product product) {
        return "Please put money for:" + product.toString() +
                "\n Valid denominations are: " + vaildDenomination.toString();
    }


}
