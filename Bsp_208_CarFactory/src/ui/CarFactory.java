package ui;

import beans.Car;

import java.util.Random;
import java.util.Scanner;

public class CarFactory {

    private String[] carBrands = {"Toyota", "Tesla", "Ford", "VW", "Fiat", "Mercedes"};
    private String[] carModels = {"Yaris", "Model S", "Mustang", "Golf", "500", "CLA", "718", "A4", "T-Roc", "CL500"};
    private Car[] cars;
    private int numberOfCars;


    public CarFactory (int numberOfCars) {
        this.numberOfCars = numberOfCars;
        cars = new Car[numberOfCars];
    }

    public void createCars() {
        Random rand = new Random();
        for (int i = 0; i < this.numberOfCars; i++) {
            cars[i] = new Car(carBrands[rand.nextInt(carBrands.length - 1)],
                    carModels[rand.nextInt(carBrands.length -1 )], rand.nextDouble() * (10000.0 - 1000.0 + 1) + 1000.0);
        }
    }

    public void printCars() {
        for (int i = 0; i < cars.length; i++) {
            System.out.println(i + 1 + cars[i].toString());
        }
    }

    public void changePrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Change price of car: ");
        int carIndex = scanner.nextInt() - 1;
        System.out.println("Car: " + cars[carIndex].getBrand() + "-" + cars[carIndex].getModel());
        System.out.format("Actual price: %.2f € \n", cars[carIndex].getPrice());
        System.out.print("New Price: ");
        cars[carIndex].setPrice(scanner.nextDouble());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of cars: ");
        int numberOfCars;
        numberOfCars = scanner.nextInt();

        CarFactory facCar = new CarFactory(numberOfCars);
        facCar.createCars();
        facCar.printCars();
        facCar.changePrice();
        facCar.printCars();
    }
}
