package org.learning.shop;

import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanti prodotti vuoi aggiungere");
        int totalProduct=scanner.nextInt();
        int choice;
        int counter=0;
        Product[] product = new Product[totalProduct];



        while(counter != totalProduct) {
            System.out.println("Quale prodotto vuoi aggiungere?");
            System.out.println("1:smartphone,2:TV,3 Headphone");
            choice=scanner.nextInt();
            switch (choice) {
                case 1:
                    //smartphone
                    System.out.println("Inserisci imei");
                    int imei = scanner.nextInt();
                    System.out.println("Inserisci quantità memoria");
                    int memory = scanner.nextInt();
                    product[counter] = new Smartphone(imei,memory);

                    System.out.println("Inserisci il prezzo");
                    product[counter].setPrice(scanner.nextInt());
                    System.out.println("Inserisci l'iva");
                    product[counter].setIva(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Inserisci il nome");
                    product[counter].setName(scanner.nextLine());
                    break;
                case 2:
                    System.out.println("Inserisci dimensioni schermo");
                    int size = scanner.nextInt();
                    System.out.println("E' una smart TV?");
                    boolean smart = scanner.nextBoolean();
                    product[counter] = new Tv(size,smart);

                    System.out.println("Inserisci il prezzo");
                    product[counter].setPrice(scanner.nextInt());
                    System.out.println("Inserisci l'iva");
                    product[counter].setIva(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Inserisci il nome");
                    product[counter].setName(scanner.nextLine());
                    break;
                case 3:
                    System.out.println("Inserisci colore");
                    String color = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Sono cuffie wireless?");
                    boolean cable = scanner.nextBoolean();
                    product[counter] = new Headphone(color,cable);

                    System.out.println("Inserisci il prezzo");
                    product[counter].setPrice(scanner.nextInt());
                    System.out.println("Inserisci l'iva");
                    product[counter].setIva(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Inserisci il nome");
                    product[counter].setName(scanner.nextLine());
                    break;
                default:
                    System.out.println("Hai inserito un valore non valido...riprova");
                    break;
            }
            counter++;
        }

        for (int i = 0; i < counter; i++) {
            System.out.println(product[i].toString());
        }

//
        scanner.close();
    }
}
