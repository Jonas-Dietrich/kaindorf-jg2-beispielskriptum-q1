package ui;

import beans.Address;

import java.util.Scanner;

public class AddressUI {

    public Address createAddress() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter street: ");
        scanner.useDelimiter("\n");
        String street = scanner.next();
        System.out.print("Enter number:");
        int number = scanner.nextInt();
        System.out.print("Enter city: ");
        String city = scanner.next();
        System.out.print("Enter zipCode: ");
        int zipCode = scanner.nextInt();

        Address newAddress = new Address(street, number, city, zipCode);


        return newAddress;
    }

    public void changeAddress(Address addr)  {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What would you like to change?");
        System.out.println(" (A) street: " + addr.getStreet());
        System.out.println(" (B) number: " + addr.getNumber());
        System.out.println(" (C) city: " + addr.getCity());
        System.out.println(" (D) zipcode: " + addr.getZipCode());
        char input = scanner.next().toLowerCase().charAt(0);

        switch (input) {
            case 'a':
                String street = scanner.nextLine();
                addr.setStreet(street);
                break;
            case 'b':
                int number = scanner.nextInt();
                addr.setNumber(number);
                break;
            case 'c':
                addr.setCity(scanner.nextLine());
                break;
            case 'd':
                addr.setZipCode(scanner.nextInt());
                break;
            default:
                System.out.println("Bad Input du depp lern einmal lesen diese option stand da gar nicht du kleiner inkompetenter wicht wieso hast du keine Intelligenz in dernen Gehirnbeans sogar java hat mehr beans in sich du absoluter Schnitzelsepp also du bist eine Enttäuschung!");
        }
    }

    public static void main(String[] args) {
        AddressUI ui = new AddressUI();
        Address newAddress = ui.createAddress();
        ui.changeAddress(newAddress);
        System.out.println(newAddress);
    }
}
