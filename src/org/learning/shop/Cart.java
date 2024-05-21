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

            System.out.println("Inserisci il prezzo");
            int price = scanner.nextInt();
            System.out.println("Inserisci l'iva");
            int iva = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Inserisci il nome");
            String name = scanner.nextLine();




            switch (choice) {
                case 1:
                    //smartphone
                    System.out.println("Inserisci imei");
                    int imei = scanner.nextInt();
                    System.out.println("Inserisci quantità memoria");
                    int memory = scanner.nextInt();
                    product[counter] = new Smartphone(price,iva,name,imei,memory);


                    break;
                case 2:
                    System.out.println("Inserisci dimensioni schermo");
                    int size = scanner.nextInt();
                    System.out.println("E' una smart TV?");
                    boolean smart = scanner.nextBoolean();
                    product[counter] = new Tv(price,iva,name,size,smart);

                    break;
                case 3:
                    System.out.println("Inserisci colore");
                    String color = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Sono cuffie wireless?");
                    boolean cable = scanner.nextBoolean();
                    product[counter] = new Headphone(price,iva,name,color,cable);

                    break;
                default:
                    System.out.println("Hai inserito un valore non valido...riprova");
                    break;
            }
            counter++;
        }




        double total=0;
        double totalDiscount=0;
        for (int i = 0; i < counter; i++) {
            if (product[i] instanceof Smartphone) {
                ((Smartphone) product[i]).fidelity();
            } else if (product[i] instanceof Headphone) {
                ((Headphone) product[i]).fidelity();
            } else if (product[i] instanceof Tv) {
                ((Tv) product[i]).fidelity();
            }
            System.out.println(product[i].toString());

            total += product[i].getPriceWithIva();
            totalDiscount += product[i].getPricewithdiscount();
        }
        System.out.println("Hai la carta fedeltà?");
        boolean response = scanner.nextBoolean();
        if (response){
            System.out.println("il totale da pagare con lo sconto è di: " + totalDiscount);
        }else{
            System.out.println("il totale da pagare è di: " + total);
        }








//
        scanner.close();
    }
}
