package com.company.Interface;

import com.company.Creators.Inventory;

import java.util.Scanner;

public class MainMenu {
    public static void viewMainMenu(Inventory inventory) {

        System.out.print("Co chcesz zrobić?");
        System.out.println("1. Sprawdź stan magazynu");
        System.out.println("2. Dodaj do koszyka");
        System.out.println("3. Sprawdź zawartość koszyka");
        System.out.println("4. Zamów");
        System.out.println("0. Opuść sklep");
        Scanner input = new Scanner(System.in);

        switch(input.nextInt()) {
            case 1:
                inventory.checkInventory(inventory.getInventory());
                viewMainMenu(inventory);
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 0:
                System.out.println("Do zobaczenia następnym razem!");
                break;
            default:
                System.out.println("Wybierz ponownie.");
                viewMainMenu(inventory);
                break;

        }
    }
}
