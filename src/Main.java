import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[100];

        Scanner sc = new Scanner(System.in);

        int hodnota = 0;

        try {
            hodnota = sc.nextInt();
        } catch (InputMismatchException err) {
            System.out.println(err);
        }

        while(hodnota != 0) {
            try {
                hodnota = sc.nextInt();
            } catch (InputMismatchException err) {
                System.out.println(err);
            }

            for (int i = 0; arr[i] != 0; i++) {
                if (hodnota <= arr[i]) {
                    //provedu cyklický posun
                    for (int j = i; arr[j] != 0; j++) {
                        int pomocna = arr[j+1];
                        arr[j+1] = arr[j];
                    }
                }
            }
        }
    }
}