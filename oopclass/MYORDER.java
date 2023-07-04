/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopclass;
import java.util.Scanner;
/**
 *
 * @author philip
 */
public class MYORDER {
    
    
     public static Scanner input = new Scanner(System.in);
    public static String again;
    public static int discount=1; 
   public static int choose=1;
   public static double quantity=1;
    public static double total=0,pay;
    
    
        public static void order() {
        System.out.println("");
        System.out.println("Enter 6: CANCEL");
        System.out.println("Enter the number code of your order: ");
        choose = input.nextInt();
        System.out.println("");

        switch (choose) {

            case 1:
                System.out.println("You chose ROASTED TURKEY");
                System.out.println("Enter the quantity of your order: ");
                quantity = input.nextDouble();
                total = total + (quantity * 329);
                break;

            case 2:
                System.out.println("You chose  ROASTED PORK BELLY");
                System.out.println("Enter the quantity of your order: ");
                quantity = input.nextDouble();
                total = total + (quantity * 279);
                break;

            case 3:
                System.out.println("You chose ROASTED BEEF");
                System.out.println("Enter the quantity of your order: ");
                quantity = input.nextDouble();
                total = total + (quantity * 349);
                break;

            case 4:
                System.out.println("You chose  ROASTED DUCK");
                System.out.println("Enter the quantity of your order: ");
                quantity = input.nextDouble();
                total = total + (quantity * 250);
                break;

            case 5:
                System.out.println("You chose ROASTED FISH");
                System.out.println("Enter the quantity of your order: ");
                quantity = input.nextDouble();
                total = total + (quantity * 229);
                break;

            case 6:
                System.exit(0);

            default:
                System.out.println("1 to 6 only ");
                order();
                break;
        }

        if (total >= 700) {
            System.out.println("You have 1 free 1L of any drink of your choice!");
        }
        if (total >= 1000) {
            System.out.println("You have 1 order of MANGO FLAOT  ");
        }

        System.out.println("");
        System.out.println("do you want to add more?");
        System.out.println("Enter 1 for Yes and 2 for No: ");
        again = input.next();
        if (again.equalsIgnoreCase("1")) {
            order();
        } else {
            System.out.println("---Discount List---");
            System.out.println(" We also offer discount to the following:");
            System.out.println(" Discount 1 - Elderly discount ( 3% )");
            System.out.println(" Discount 2 - Birthday discount ( 7% )");
            System.out.println(" Note: Discounts cannot be stacked");
            System.out.println("");
            System.out.println("Enter 3 if neither applicable");
            System.out.println("Enter your Code: ");
            discount = input.nextInt();
            if (discount == 1) {
                total = total * 0.95;
            }
            if (discount == 2) {
                total = total * 0.90;
            }
            if (discount == 3) {
                System.out.println("No discount applicable");
                total = total - 0;
            }
            System.out.println("");
            System.out.println("The bill is Php " + total + "0");
            System.out.println("Enter Cash: ");
            pay = input.nextDouble();

            while (pay < total) {
                System.out.println("---Not enpough cas amount---");
                System.out.println("Enter Cash: ");
                pay = input.nextDouble();
            }
            {
                total = pay - total;
                System.out.println("The change is Php " + total + "0");
            }
        }
        System.out.println("Order again?");
        System.out.println("Enter 1 for Yes and 2 for No: ");
        choose = input.nextInt();
        if (choose == 1) {
           Mymenu.menu();
            order();
             total = total - total;
        } else {
            System.exit(0);
        }
    }

       
       
}
