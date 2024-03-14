package com.mycompany.practical3;

import java.util.Scanner;

public class Practical3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");
        System.out.println("Вариант 2. Ковальчук Артем Викторович");
        System.out.println("Введите название телефона: ");
        String name = scan.next();
        Telephone telephone = new Telephone(name);
        
        
        Seller seller = new Seller();
        seller.modify(telephone);
        System.out.println(telephone.getName());
    }
}
