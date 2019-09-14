package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Catalog catalog = Catalog.initialize();
        int a[] = new int[]{10, 20, 50, 100};
        Denomination denomination = new Denomination(a);
        Machine machine = new Machine(catalog, denomination);
        System.out.println(machine.itemsAvailable());
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Product p = machine.selectProduct(s);
        System.out.println(machine.askMoney(p));
    }
}
