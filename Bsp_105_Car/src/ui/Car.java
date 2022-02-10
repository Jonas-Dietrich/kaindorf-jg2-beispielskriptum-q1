package ui;

import java.util.Scanner;

public class Car {

    Scanner scanner = new Scanner(System.in);

    private String brand;
    private String model;
    private int speed = 0;
    private int desiredVelo = 0;

    public void input() {
        System.out.print("Enter the brand of the Car: ");
        this.brand = scanner.next();
        System.out.print("Enter the model of the Car: ");
        this.model = scanner.next();
        System.out.println(this.brand + " " + this.model + " runs with " + this.speed + " KM/h.");

        do {
            System.out.print("Desired velocity: ");
            this.desiredVelo = scanner.nextInt();
        } while (this.desiredVelo < 0 || this.desiredVelo > 130);

    }

    public void calculate() {
        while (this.speed < desiredVelo) {
            accelerate();
        }

        while (this.speed > desiredVelo) {
            slowDown();
        }
    }

    public void accelerate() {
        this.speed++;
    }

    public void slowDown() {
        this.speed--;
    }

    public int getDesiredVelo() {
        return this.desiredVelo;
    }

    public void output() {
        System.out.println(this.brand + " " + this.model + " runs with " + this.speed + " KM/h.");
    }

    public static void main(String[] args) {

        Car car = new Car();

        car.input();
        car.calculate();
        car.output();
}
}
