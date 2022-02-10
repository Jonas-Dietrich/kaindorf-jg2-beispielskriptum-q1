package ui;

import java.util.Random;

public class Lottonumbers {

    private int[] numbers = new int[6];
    private int bonusNumber;

    Random rand = new Random();

    public Lottonumbers() {
        for (int i = 0; i < 6; i++) {
            numbers[i] = rand.nextInt(45 - 1) + 1;
            
        }

        bonusNumber = rand.nextInt(45 - 1) + 1;
    }

    public void sortNumbers() {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < (numbers.length); j++) {
                if (numbers[j - 1] > numbers[j]) {
                    //swap elements
                    int temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {

        String txt = "Lottoziehung: " + numbers[0] + ", " + numbers[1] + ", " +  numbers[2] + ", " + numbers[3] + ", " +  numbers[4] + ", " + numbers[5] + " Zusatzzahl: " + bonusNumber;
        return txt;
    }


    public static void main(String[] args) {
        Lottonumbers allSixRight = new Lottonumbers();
        System.out.println(allSixRight.toString());
        allSixRight.sortNumbers();
        System.out.println(allSixRight.toString());
    }
}
