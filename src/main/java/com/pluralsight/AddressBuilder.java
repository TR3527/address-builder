package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Please provide the following information: ");
        //String customerInfo = read.nextLine();

        System.out.print("Full name: ");
        String customerName = read.nextLine();

        System.out.print("Billing Street: ");
        String customerStreet = read.nextLine();

        System.out.print("Billing City: ");
        String customerCity = read.nextLine();

        System.out.print("Billing State: ");
        String customerState = read.nextLine();

        System.out.print("Billing zip: ");
        Long customerZip = read.nextLong();

        read.nextLine();


        System.out.print("Shipping Street: ");
        String shippingStreet = read.nextLine();

        //read.next();

        System.out.print("Shipping City: ");
        String shippingCiy = read.nextLine();

        //read.next();

        System.out.print("Shipping State: ");
        String shippingState = read.nextLine();


        System.out.print("Shipping Zip: ");
        Long shippingZip = read.nextLong();


        StringBuilder userInput = new StringBuilder();


        userInput.append(customerName +"\n");
        userInput.append("Billing Address: \n");
        userInput.append(customerStreet + "\n");
        userInput.append(customerCity + ", ");
        userInput.append(customerState + " ");
        userInput.append(customerZip + "\n");


        userInput.append("Shipping Address: \n");
        userInput.append(shippingStreet + "\n");
        userInput.append(shippingCiy + ", ");
        userInput.append(shippingState + " ");
        userInput.append(shippingZip);




        String finalInfo = userInput.toString();

        System.out.println(finalInfo);

//        System.out.println(customerName);
//        System.out.println(" ");
//        System.out.println(userInput);






//        System.out.println("Full name: " + " " + customerName);
//        System.out.println(" ");
//        System.out.println("Billing Address: ");
//        System.out.println(customerStreet);
//        System.out.println(customerCity + ", " + customerState + " " + customerZip);

//        System.out.println("Shipping Address: ");
//        System.out.println(shippingStreet);
//        System.out.print(shippingCiy + ", " + shippingState + " " + shippingZip);





    }
}
