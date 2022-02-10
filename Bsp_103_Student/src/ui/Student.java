package ui;

import java.util.Scanner;

public class Student {

    Scanner scanner = new Scanner(System.in);

    private String firstName;
    private String lastName;

    public void input() {
        System.out.print("Wie lautet der Vorname des Schülers? ");
        this.firstName = scanner.next();
        System.out.println();
        System.out.print("Wie lautet der Nachname des Schülers? ");
        this.lastName = scanner.next();
        System.out.println();
    }

    public void output() {
        System.out.println("      ////^\\\\\\\\\n" +
                "      | ^   ^ |    First Name: " + this.firstName + "\n" +
                "     @ (o) (o) @   Last Name: " + this.lastName + "\n" +
                "      |   <   |\n" +
                "      |  ___  |\n" +
                "       \\_____/\n" +
                "     ____|  |____\n" +
                "    /    \\__/    \\\n" +
                "   /              \\\n" +
                "  /\\_/|        |\\_/\\\n" +
                " / /  |        |  \\ \\\n" +
                "( <   |        |   > )\n" +
                " \\ \\  |        |  / /\n" +
                "  \\ \\ |________| / /\n" +
                "   \\ \\|");
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.input();
        student.output();
    }


}
