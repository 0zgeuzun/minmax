import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Sayıyı giriniz: ");
            numbers[i] = scanner.nextInt();
        }

        // İlk girilen sayıyı başlangıçta en büyük ve en küçük olarak kabul ediyoruz
        int max = numbers[0];
        int min = numbers[0];

        // Diziyi tarayarak en büyük ve en küçük sayıları bulma
        for (int i = 1; i < n; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);

        // Scanner'ı kapatmak iyi bir uygulama pratiğidir.
        scanner.close();
    }
}