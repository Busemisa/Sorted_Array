import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Size of array n :");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid size!!");
            return;
        }

        int[] dizi = new int[n];

        for (int i = 0; i <dizi.length; i++) {
            System.out.print(i+".element  :");
            dizi[i] = scanner.nextInt();
        }

        Arrays.sort(dizi);

        System.out.println("Sorted Array : " + Arrays.toString(dizi));

        scanner.close();
    }
}
