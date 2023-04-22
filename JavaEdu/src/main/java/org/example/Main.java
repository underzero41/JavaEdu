package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product pr1 = new Product("qwe", "zxc", 3);
        Product pr2 = new Product("asd", "fgh", 4);
        Product pr3 = new Product("lkj", "mnb", 5);
        List<Product> productList = new ArrayList<>();
        productList.add(pr1);
        productList.add(pr2);
        productList.add(pr3);
        System.out.println(productList);
        Scanner scanner = new Scanner(System.in);
        String searchNameProduct = scanner.nextLine();
        Integer searchVolumeProduct = 0;
        List<String> countryList = new ArrayList<>();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).name.equals(searchNameProduct)) {
                searchVolumeProduct += productList.get(i).volume;
                countryList.add(productList.get(i).country);
            }
        }
        System.out.println("countryList = " + countryList);
        System.out.println("searchVolumeProduct = " + searchVolumeProduct);
    }
}