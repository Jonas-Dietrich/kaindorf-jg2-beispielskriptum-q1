package ui;

import java.util.Scanner;

public class Birthdate {

    private int day;
    private int month;
    private int year = 0;
    private int dayOfYear  = 0;
    String stringMonth;


    public void input() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Day (1 - 31): ");
            this.day = scanner.nextInt();
            System.out.println();
        } while (this.day > 31 || this.day < 1);

        do {
            System.out.print("Month (1 - 12): ");
            this.month = scanner.nextInt();
            System.out.println();
        } while (this.month > 12 || this.month < 1);

        System.out.print("Year: ");
        this.year = scanner.nextInt();
        System.out.println();
    }

    public void compute() {

        if (year % 4 == 0) {

            if (year % 400 == 0) {
                switch (month) {
                    case 12:
                        this.dayOfYear += 31;
                    case 11:
                        this.dayOfYear += 30;
                    case 10:
                        this.dayOfYear += 31;
                    case 9:
                        this.dayOfYear += 30;
                    case 8:
                        this.dayOfYear += 31;
                    case 7:
                        this.dayOfYear += 31;
                    case 6:
                        this.dayOfYear += 30;
                    case 5:
                        this.dayOfYear += 31;
                    case 4:
                        this.dayOfYear += 30;
                    case 3:
                        this.dayOfYear += 31;
                    case 2:
                        this.dayOfYear += 29;
                    case 1:
                        this.dayOfYear += this.day;
                }
            }

            else if (year % 100 == 0) {
                switch (month) {
                    case 12:
                        this.dayOfYear += 31;
                    case 11:
                        this.dayOfYear += 30;
                    case 10:
                        this.dayOfYear += 31;
                    case 9:
                        this.dayOfYear += 30;
                    case 8:
                        this.dayOfYear += 31;
                    case 7:
                        this.dayOfYear += 31;
                    case 6:
                        this.dayOfYear += 30;
                    case 5:
                        this.dayOfYear += 31;
                    case 4:
                        this.dayOfYear += 30;
                    case 3:
                        this.dayOfYear += 31;
                    case 2:
                        this.dayOfYear += 28;
                    case 1:
                        this.dayOfYear += this.day;
                }
            }
            else {
                switch (month) {
                    case 12:
                        this.dayOfYear += 31;
                    case 11:
                        this.dayOfYear += 30;
                    case 10:
                        this.dayOfYear += 31;
                    case 9:
                        this.dayOfYear += 30;
                    case 8:
                        this.dayOfYear += 31;
                    case 7:
                        this.dayOfYear += 31;
                    case 6:
                        this.dayOfYear += 30;
                    case 5:
                        this.dayOfYear += 31;
                    case 4:
                        this.dayOfYear += 30;
                    case 3:
                        this.dayOfYear += 31;
                    case 2:
                        this.dayOfYear += 29;
                    case 1:
                        this.dayOfYear += this.day;
                }
            }
        }
        else {
            switch (month) {
                case 12:
                    this.dayOfYear += 31;
                case 11:
                    this.dayOfYear += 30;
                case 10:
                    this.dayOfYear += 31;
                case 9:
                    this.dayOfYear += 30;
                case 8:
                    this.dayOfYear += 31;
                case 7:
                    this.dayOfYear += 31;
                case 6:
                    this.dayOfYear += 30;
                case 5:
                    this.dayOfYear += 31;
                case 4:
                    this.dayOfYear += 30;
                case 3:
                    this.dayOfYear += 31;
                case 2:
                    this.dayOfYear += 28;
                case 1:
                    this.dayOfYear += this.day;
            }
        }


        switch (this.month) {
            case 1:
                stringMonth = "January";
                break;
            case 2:
                stringMonth = "February";
                break;
            case 3:
                stringMonth = "March";
                break;

            case 4:
                stringMonth = "April";
                break;

            case 5:
                stringMonth = "May";
                break;

            case 6:
                stringMonth = "June";
                break;

            case 7:
                stringMonth = "July";
                break;

            case 8:
                stringMonth = "August";
                break;

            case 9:
                stringMonth = "September";
                break;

            case 10:
                stringMonth = "October";
                break;

            case 11:
                stringMonth = "November";
                break;

            case 12:
                stringMonth = "December";
                break;
        }
    }

    public void output() {
        System.out.format("Your Birthday is %2d. %s. %d ", this.day, this.stringMonth, this.year);
        System.out.println("\n You were born on the day "  + this.dayOfYear + " of the year!");
    }

    public static void main(String[] args) {

        Birthdate bdate = new Birthdate();
        bdate.input();
        bdate.compute();
        bdate.output();
    }
}
