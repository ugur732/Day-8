package Homeworkandexamples;

import java.util.Scanner;

public class homework11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("quantity of the product sold: ");
        int sold= scan.nextInt();
        System.out.println("the price of each product: ");
        double price= scan.nextDouble();
        double revenue=sold*price;
        System.out.println("the revenue is: "+revenue);

















    }
}