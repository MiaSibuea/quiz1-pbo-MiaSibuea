import java.util.Scanner;

public class Driver2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int[] nilai = new int[N];

        for (int i = 0; i < N; i++) {
            nilai[i] = input.nextInt();
        }

        int kodeKelompok = input.nextInt();

        int startIndex = 0;
        for (int i = 1; i < kodeKelompok; i++) {
            startIndex += i;
        }

        int total = 0;
        for (int i = 0; i < kodeKelompok; i++) {
            total += nilai[startIndex + i];
        }

        System.out.println(total);
    }
}