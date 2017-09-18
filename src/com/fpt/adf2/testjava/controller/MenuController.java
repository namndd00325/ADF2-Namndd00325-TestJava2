/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.adf2.testjava.controller;

import com.fpt.adf2.testjava.enity.Passenger;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author Nam Nguyen
 */
public class MenuController {

    static PriorityQueue<Passenger> listPassenger = new PriorityQueue<>();
    static Passenger passenger = new Passenger();
    Scanner scanner = new Scanner(System.in);

    public boolean addRevervation() {
        System.out.println("Please enter passenger information.");
        while (true) {

            System.out.println("Please enter reservation ID: ");
            String strId = scanner.nextLine();

            int inChoice = 0;
            try {
                inChoice = Integer.parseInt(strId);
            } catch (Exception e) {
                System.err.println("Please enter number: ");
                continue;
            }

            System.out.println("Please enter name: ");
            String name = scanner.nextLine();

            System.out.println("Please enter address: ");
            String address = scanner.nextLine();
            System.out.println("Please enter phone: ");
            String phone = scanner.nextLine();

            System.out.println("Date of departure and return: ");
            String date = scanner.nextLine();

            Passenger passenger = new Passenger();
            passenger.setIDRevervation(inChoice);
            passenger.setPassengerName(name);
            passenger.setAddress(address);
            passenger.setPhone(phone);
            passenger.setDateOfDeparture_Return(date);
            listPassenger.add(passenger);
            return true;
        }

    }

    public void editPassenger() {
        while (true) {
            for (Passenger passenger : listPassenger) {

                System.out.println("Please enter reservation ID that you want to edit:");
                String strId = scanner.nextLine();
                int id;

                try {
                    id = Integer.parseInt(strId);
                    if (id == passenger.getIDRevervation()) {
                        listPassenger.remove();
                        System.out.println("Please enter passenger information.");

                        System.out.println("Please edit name: ");
                        String name = scanner.nextLine();

                        System.out.println("Please edit address: ");
                        String address = scanner.nextLine();
                        System.out.println("Please edit phone: ");
                        String phone = scanner.nextLine();

                        System.out.println("Date of departure and return: ");
                        String date = scanner.nextLine();

//                    Passenger passenger = new Passenger();
                        passenger.setIDRevervation(id);
                        passenger.setPassengerName(name);
                        passenger.setAddress(address);
                        passenger.setPhone(phone);
                        passenger.setDateOfDeparture_Return(date);
                        listPassenger.add(passenger);
                    } else {
                        System.err.println("Not data! Please enter ID: ");
                    }

                } catch (Exception e) {
                    System.err.println("Please enter number: ");
                    continue;
                }

            }
        }

    }

    public void displayPassenger() {
        for (Passenger pass : listPassenger) {
            System.out.println("1. Revervation ID: " + pass.getIDRevervation());
            System.out.println("2. Passenger Name: " + pass.getPassengerName());
            System.out.println("3. Address: " + pass.getAddress());
            System.out.println("4. Phone: " + pass.getPhone());
            System.out.println("5. Date Of Departure And Return: " + pass.getDateOfDeparture_Return());
        }

    }
}
