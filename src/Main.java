import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // Degerlendirme formu 7
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        while (!isValid) {
            System.out.print("Olusturulacak Satır : ");
            int row = scanner.nextInt();
            System.out.print("Olusturulacak Sütun : ");
            int column = scanner.nextInt();

            if (row > 2 && column > 2) {
                MineSweeper mineSweeper = new MineSweeper(row, column);
                mineSweeper.run();
                break;
            } else {
                System.out.println("Gecersiz satır/sütun girisi yaptınız");
            }
        }

    }
}