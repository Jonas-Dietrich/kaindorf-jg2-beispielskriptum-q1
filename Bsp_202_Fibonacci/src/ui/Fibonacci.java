package ui;

public class Fibonacci {


    private int upperLimit = 0;
    private int fiboSum = 1;



    public void computeSum() {
        int[] fiboNumbers = new int[fiboSum];
        fiboNumbers[0] = 1;
        fiboNumbers[1] = 1;

        for (int i = 2; i < fiboNumbers.length; i++) {
            fiboNumbers[i] = fiboNumbers[i -2] + fiboNumbers[i -1];
        }

    }

    public String toString() {
        String txt = "Fibonacci-Summe bis " + this.upperLimit + ": " + this.fiboSum;
        return txt;
    }

    public void setUpperLimit(int upperLimit) {
        this.upperLimit = upperLimit;
    }


    public static void main(String[] args) {
        Fibonacci fibo = new Fibonacci();
        System.out.print("Bitte die Obergrenze eingeben: ");
        fibo.setUpperLimit();
    }
}
