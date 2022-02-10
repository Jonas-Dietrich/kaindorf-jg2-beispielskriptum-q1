package ui;

import beans.TrainingsCalculation;

import java.util.Scanner;

public class CalcTrainerUI {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rounds: ");
        int inputRounds = scanner.nextInt();

        System.out.print("Enter difficulty: ");
        byte inputDifficulty = scanner.nextByte();

        int points = 0;
        for (int i = 0; i < inputRounds; i++) {
            System.out.println("Round " + (i + 1));
            TrainingsCalculation calc = new TrainingsCalculation(inputDifficulty);
            System.out.println(calc.toString());
            System.out.print("Enter result: ");
            int inputResult = scanner.nextInt();
            if (inputResult == calc.getResult()) {
                System.out.println("perfect!");
                points++;
            }
            else {
                System.out.println("The correct result is " + calc.getResult());
            }
        }

        System.out.println("you achieved " + points + " points out of " + inputRounds + " points");
    }
}
