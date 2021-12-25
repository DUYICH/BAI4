import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("10 số nguyên tố đầu tiên là: ");
        int i = 0;
        int count = 1;
        while (count <= 10) {
            if (checkSNT(i) == true) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
        System.out.println();
        System.out.println("Các số nguyên tố < 10 là: ");
        for (int j = 0; j < 10; j++) {
            if (checkSNT(j) == true) {
                System.out.print(j + " ");

            }
        }
    }

    public static boolean checkSNT(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2 && num >= 2) {
            return true;
        }
        return false;
    }
}
