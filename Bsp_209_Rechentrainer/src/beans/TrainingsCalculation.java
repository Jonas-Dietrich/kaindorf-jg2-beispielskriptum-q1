package beans;

import java.util.Random;

public class TrainingsCalculation {

    private int number1;
    private int number2;
    private char operator;
    private int result;
    private byte difficulty;

    public TrainingsCalculation(byte difficulty) {

        boolean everythingIsFine = false;
        Random random = new Random();
        this.difficulty = difficulty;

        if (difficulty == 1) {
            this.number1 = random.nextInt(10 - 1 + 1 );
            this.number2 = random.nextInt(10 - 1 + 1 );
        } else {
            this.number1 = random.nextInt(100 - 1 + 1 );
            this.number2 = random.nextInt(100 - 1 + 1 );
        }

        int temp = random.nextInt( 4  - 1 ) + 1;

        switch (temp) {
            case 1 -> this.operator = '+';
            case 2 -> this.operator = '-';
            case 3 -> this.operator = '*';
            case 4 -> this.operator = '/';
        }

        switch (operator) {
            case '+' :
                this.result = this.number1 + this.number2;
                break;
            case '-':
                this.result = this.number1 - this.number2;
                break;
            case '*':

        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public byte getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(byte difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public String toString() {
        String txt = String.format("%3d %c %3d = ?", this.number1, this.operator, this.number2);
        return txt;
    }
}
