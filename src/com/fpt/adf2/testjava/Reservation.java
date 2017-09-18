/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.adf2.testjava;

import com.fpt.adf2.testjava.controller.MenuController;
import com.fpt.adf2.testjava.enity.Passenger;
import java.util.Scanner;

/**
 *
 * @author Nam Nguyen
 */
public class Reservation {

    public static void main(String[] args) {
        Reservation menu = new Reservation();
        menu.creatMenu(); 
    }

    public void creatMenu() {
        while (true) {
            System.out.println("==============Menu============");
            System.out.println("1. Add reservation");
            System.out.println("2. Modify passenger records");
            System.out.println("3. Display passenger records");
            System.out.println("4. Exit");

            int inChoice = 0;
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();
            
            try {
                inChoice = Integer.parseInt(choice);
            } catch (Exception e) {
                System.err.println("Please enter number: ");
                continue;
            }

            MenuController menuController = new MenuController();
            if (inChoice == 4) {
                break;
            } else {
                switch (inChoice) {
                    case 1:
                        System.out.println("=============Add reservation==============");
                        menuController.addRevervation();
                        break;
                    case 2:
                        System.out.println("=============Modify passenger records===============");
                        menuController.editPassenger();
                        break;
                    case 3:
                        System.out.println("=============Display passenger records==============");
                        menuController.displayPassenger();
                        break;
                    default:
                }
            }
        }

    }
}
