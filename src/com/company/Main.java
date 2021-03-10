package com.company;

import com.company.Creators.Inventory;
import com.company.Interface.MainMenu;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Inventory newInventory = new Inventory(1000);
        //newInventory.checkInventory(newInventory.getInventory());
        System.out.println("Witaj w naszym sklepie.");
        System.out.println();
        MainMenu.viewMainMenu(newInventory);
        }
    }

