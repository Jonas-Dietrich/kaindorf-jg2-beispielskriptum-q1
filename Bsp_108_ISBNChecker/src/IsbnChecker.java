import java.util.Scanner;

public class IsbnChecker {

    private boolean isIsbn = true;
    private String isbn;

    public boolean input() {

        Scanner scanner = new Scanner(System.in);
        this.isbn = scanner.nextLine();

        if (isbn.length() != 10) {
            this.isIsbn = false;
        }

        return isIsbn;
    }

    public void calculate() {
        int allAddedUo = 0;
        for (int i = 0; i < 9; i++) {
            allAddedUo += (int)isbn.charAt(i) * (-i + 10);
        }

        allAddedUo += isbn.charAt(9);

        if (allAddedUo % 11 != 0) {
            this.isIsbn = false;
        }
    }

    public void output() {
        if (this.isIsbn) {
            System.out.println("--- OUTPUT ---");
            System.out.println("The given ISBN number " + isbn + " is correct.");
        } else {
            System.out.println("--- OUTPUT ---");
            System.out.println("The given ISBN number " + isbn + " is not correct.");
        }
    }
}
