package ui;

import java.util.Scanner;

public class Calculator {

    Scanner scanner = new Scanner(System.in);

    private double num1;
    private double num2;
    private char operator;
    private double result;

    public void input() {
        System.out.println("--- INPUT ---");
        System.out.println("Erste Zahl eingeben: ");
        this.num1 = scanner.nextDouble();
        do {
            System.out.println("Operator eingeben: : ");
            this.operator= scanner.next().charAt(0);
        } while (this.operator != '+' && this.operator != '-' && this.operator != '*' && this.operator != '/' && this.operator != '%');
        System.out.println("Zweite Zahl eingeben: ");
        this.num2 = scanner.nextDouble();
    }

    public void calculate() {
        switch (this.operator) {

            case '+':
                this.result = this.num1 + this.num2;
                break;

            case '-':
                this.result = this.num1 - this.num2;
                break;

            case '*':
                this.result = this.num1 * this.num2;
                break;

            case '/':
                if (this.num2 != 0) {
                    this.result = this.num1 / this.num2;
                } else {System.out.println("Nein. Frag nicht warum. Einfach nur Nein.");}
                break;

            case '%':
                this.result = this.num1 % this.num2;
                break;
        }
    }

    public void output() {

        System.out.println("--- NEW OUTPUT ---");

        switch (this.operator) {
            case '+':
                System.out.format("Addition: %.2f + %.2f = %.2f", num1, num2, result);
                break;
            case '-':
                System.out.format("Subtraktion: %.2f - %.2f = %.2f", num1, num2, result);
                break;
            case '*':
                System.out.format("Multiplikation: %.2f * %.2f = %.2f", num1, num2, result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.format("Division: " + num1 + " / " + num2 + " = Nein.");
                } else {
                    System.out.format("Division: %.2f / %.2f = %.2f", num1, num2, result);
                }
                break;
            case '%':
                System.out.format("This should never be seen!: %.2f %% %.2f = %.2f", num1, num2, result);
        }
    }

    public static void main(String[] args) {

        Calculator kalk = new Calculator();
        kalk.input();
        kalk.calculate();
        kalk.output();

        Calculator gips = new Calculator();
        gips.input();
        gips.calculate();
        gips.output();

    }
}
